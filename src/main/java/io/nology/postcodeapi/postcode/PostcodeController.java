package io.nology.postcodeapi.postcode;

import io.nology.postcodeapi.exceptions.NotFoundException;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postcode")
public class PostcodeController {

  @Autowired
  private PostcodeService postcodeService;

  // CREATE
  @PreAuthorize("hasRole('ADMIN')") // only allow Admins to create new postcode combinations
  @PostMapping("/admin")
  public ResponseEntity<Postcode> createPostcode(
    @Valid @RequestBody CreatePostcodeDTO data
  ) {
    Postcode createdPostcode = this.postcodeService.create(data);
    return new ResponseEntity<>(createdPostcode, HttpStatus.CREATED);
  }

  //& READ

  // Get all postcodes and suburbs
  @GetMapping
  public ResponseEntity<List<Postcode>> getAll() {
    List<Postcode> allPostcodes = this.postcodeService.findAll();
    return new ResponseEntity<>(allPostcodes, HttpStatus.OK);
  }

  // Get suburb(s) based on postcode
  @GetMapping("/{postcode}")
  public ResponseEntity<List<Postcode>> getByPostcode(
    @PathVariable String postcode
  ) {
    List<Postcode> foundPostcodes =
      this.postcodeService.findByPostcode(postcode);
    if (foundPostcodes.isEmpty()) {
      throw new NotFoundException(
        String.format("Postcode %d is not found", postcode)
      );
    }
    return new ResponseEntity<>(foundPostcodes, HttpStatus.OK);
  }

  @GetMapping("suburb/{suburb}")
  public ResponseEntity<List<Postcode>> getBySuburb(
    @PathVariable String suburb
  ) {
    List<Postcode> foundSuburbs = this.postcodeService.findBySuburb(suburb);
    if (foundSuburbs.isEmpty()) {
      throw new NotFoundException(
        String.format("Suburb %s is not found", suburb)
      );
    }
    return new ResponseEntity<>(foundSuburbs, HttpStatus.OK);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @GetMapping("/admin")
  public String getSecurePostcodes() {
    return "secure postcodes";
  }
}

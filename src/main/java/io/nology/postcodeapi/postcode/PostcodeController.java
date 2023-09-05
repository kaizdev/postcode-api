package io.nology.postcodeapi.postcode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postcode")
public class PostcodeController {

  @Autowired
  private PostcodeService postcodeService;

  // CREATE

  // READ
  @GetMapping
  public ResponseEntity<List<Postcode>> getAll() {
    List<Postcode> allPostcodes = this.postcodeService.findAll();
    return new ResponseEntity<>(allPostcodes, HttpStatus.OK);
  }

  // Get suburb based on postcode
  @GetMapping("/{postcode}")
  public ResponseEntity<Postcode> getByPostcode(@PathVariable String postcode) {
    Optional<Postcode> foundPostcode =
      this.postcodeService.findByPostcode(postcode);
  }
}

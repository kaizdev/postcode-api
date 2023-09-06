package io.nology.postcodeapi.postcode;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PostcodeService {

  @Autowired
  private PostcodeRepository postcodeRepository;

  @Autowired
  private ModelMapper modelMapper;

  // Find all
  public List<Postcode> findAll() {
    return this.postcodeRepository.findAll();
  }

  // Find by postcode
  public List<Postcode> findByPostcode(String postcode) {
    return this.postcodeRepository.findByPostcode(postcode);
  }

  // Find by suburb
  public List<Postcode> findBySuburb(String suburb) {
    return this.postcodeRepository.findBySuburb(suburb);
  }
}

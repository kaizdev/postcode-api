package io.nology.postcodeapi.postcode;

import java.util.List;
import java.util.Optional;

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
  public Optional<Postcode> findByPostcode(String postcode) {
    Optional<Postcode> maybePostcode = this.postcodeRepository.findBy()
  }
}

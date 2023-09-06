package io.nology.postcodeapi.postcode;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostcodeRepository extends JpaRepository<Postcode, Long> {
  @Query(value = "SELECT * FROM postcode WHERE postcode=?", nativeQuery = true)
  public List<Postcode> findByPostcode(String postcode);

  @Query(value = "SELECT * FROM postcode WHERE locality=?", nativeQuery = true)
  public List<Postcode> findBySuburb(String suburb);
}

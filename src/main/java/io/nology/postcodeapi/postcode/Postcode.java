package io.nology.postcodeapi.postcode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// @JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Postcode {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String postcode;

  private String locality;
  private String state;

  public String getPostcode() {
    return this.postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public String getLocality() {
    return this.locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Long getId() {
    return id;
  }

  public Postcode() {}

  public Postcode(Long id, String postcode, String locality, String state) {
    this.id = id;
    this.postcode = postcode;
    this.locality = locality;
    this.state = state;
  }
}

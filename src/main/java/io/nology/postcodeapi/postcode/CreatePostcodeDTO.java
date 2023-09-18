package io.nology.postcodeapi.postcode;

import jakarta.validation.constraints.NotBlank;

public class CreatePostcodeDTO {

  @NotBlank
  String postcode;

  @NotBlank
  String locality;

  @NotBlank
  String state;

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

  public CreatePostcodeDTO(String postcode, String locality, String state) {
    this.postcode = postcode;
    this.locality = locality;
    this.state = state;
  }
}

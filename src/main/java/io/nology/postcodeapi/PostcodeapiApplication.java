package io.nology.postcodeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// public class PostcodeapiApplication implements CommandLineRunner {
public class PostcodeapiApplication {

  //   @Autowired
  //   private PostcodeRepository postcodeRepository;

  public static void main(String[] args) {
    SpringApplication.run(PostcodeapiApplication.class, args);
  }
  //^ only required to do the initial data population
  //   @Override
  //   public void run(String... args) throws Exception {
  //     ObjectMapper objectMapper = new ObjectMapper();
  //     List<Postcode> postcodes = objectMapper.readValue(
  //       Paths
  //         .get(
  //           "/Users/kai/code/post-course/postcode-api/src/main/java/io/nology/postcodeapi/postcode/australian_postcodes.json"
  //         )
  //         .toFile(),
  //       objectMapper
  //         .getTypeFactory()
  //         .constructCollectionType(List.class, Postcode.class)
  //     );

  //     postcodeRepository.saveAll(postcodes);
  //   }
}

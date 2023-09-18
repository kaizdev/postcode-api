package io.nology.postcodeapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
      .csrf(csrf -> csrf.disable())
      .authorizeHttpRequests(authz ->
        authz
          .requestMatchers("/postcode/admin")
          .authenticated()
          .requestMatchers("/postcode/**", "/postcode/suburb/**")
          .permitAll()
      )
      .httpBasic(Customizer.withDefaults());

    return http.build();
  }
}

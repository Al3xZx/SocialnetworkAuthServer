package com.alessandro.socialnetworkauthserver.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("sicurezza")
@Data
public class JwtConfig {
  private String uri;
  private String refresh;
  private String header;
  private String prefix;
  private int expiration;
  private String secret;
}

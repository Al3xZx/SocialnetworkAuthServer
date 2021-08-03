package com.alessandro.socialnetworkauthserver.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("gestuser")
@Data
public class UserConfig {
  private String srvUrl;
  private String userId;
  private String password;
}

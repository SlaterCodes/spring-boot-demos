package codes.slater.springbootdemos.actuator.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = CoolProperties.class)
public class Config {
}

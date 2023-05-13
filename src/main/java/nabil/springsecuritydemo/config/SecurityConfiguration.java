package nabil.springsecuritydemo.config;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author Ahmed Nabil
 */
@EnableWebSecurity
@Configuration
@Slf4j
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain basicSecurityFilterChain(HttpSecurity http) throws Exception {
        log.info("Verify it's HOOKED!");
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
        return http.build();
    }
}

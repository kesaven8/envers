package com.learnSpring.envers;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@org.springframework.context.annotation.Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class Configuration {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl();
    }
}

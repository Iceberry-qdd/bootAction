package com.iceberry.bootAction.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer customizer() {
        return configuration -> configuration.setMapUnderscoreToCamelCase(true);
    }
}

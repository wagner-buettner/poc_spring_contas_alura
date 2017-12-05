package br.com.caelum.contas.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


/**
 * @author wagner on 04/12/17
 */

public class DataSourceConfig {

    @ConfigurationProperties(prefix = "resources/application.properties")
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username("")
                .password("")
                .url("")
                .driverClassName("")
                .build();
    }
}
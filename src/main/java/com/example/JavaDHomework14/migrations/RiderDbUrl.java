package com.example.JavaDHomework14.migrations;

import org.hibernate.cfg.Environment;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Properties;
@Service
public class RiderDbUrl {

    public String dbUrl() throws IOException {
        Properties hibernateProperties = new Properties();
        hibernateProperties.load(DatabaseMigrationsService.class.getClassLoader()
                .getResourceAsStream("application.properties"));
        String hibernateUrl = hibernateProperties.getProperty(Environment.URL);
        return hibernateUrl;
    }
}

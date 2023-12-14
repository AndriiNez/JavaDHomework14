package com.example.JavaDHomework14.migrations;

import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@RequiredArgsConstructor
@Service
public class DatabaseMigrationsService {
    private final RiderDbUrl dbUrl;

    public void initDbService() throws IOException {
        Flyway flyway = Flyway
                .configure()
                .dataSource(dbUrl.dbUrl(), null, null)
                .load();
        flyway.migrate();
    }

}



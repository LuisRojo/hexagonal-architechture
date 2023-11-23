package org.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class HexagonalMultiModuleApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(HexagonalMultiModuleApplication.class, args);

    }
}

package com.apirest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;


// https://spring.io/guides/gs/relational-data-access/
// https://docs.spring.io/spring/docs/current/spring-framework-reference/data-access.html#jdbc
@SpringBootApplication
public class StartApplication {

    @Bean
    public LobHandler lobHandler() {
        return new DefaultLobHandler();
    }
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}

package com.example.profiling.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Profile("dev")
public class MySQLConnection {
    public static  final Logger log= LoggerFactory.getLogger(MySQLConnection.class);
    @Value("${username}")
    String username;
    @Value("${password}")
    String password;


    private MySQLConnection(){

        log.info("MySQLConnection Initialized");

    }
}

package com.example.profiling.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class NoSQLConnection {
    public static final Logger log= LoggerFactory.getLogger(NoSQLConnection.class);
    @Value("${username}")
    String username;
    @Value("${password}")
    String password;

    private NoSQLConnection(){
        log.info("NoSQLConnection Initialized");
    }
}

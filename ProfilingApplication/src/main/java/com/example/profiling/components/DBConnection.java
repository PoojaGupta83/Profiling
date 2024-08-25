package com.example.profiling.components;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {
public static final Logger log= LoggerFactory.getLogger(DBConnection.class);

@Value("${username}")
String username;
@Value("${password}")
String password;


@Autowired
public  DBConnection(MySQLConnection mySQLConnection, NoSQLConnection noSQLConnection){
log.info("mySQLConnection UserName:{}",mySQLConnection.username);
    log.info("mySQLConnection Password:{}",mySQLConnection.password);

log.info("NosqlConnection UserName:{}",noSQLConnection.username);
log.info("NosqlConnection Password:{}",noSQLConnection.password);
}
@PostConstruct
public void init(){
    log.info("DBConnection initialized");
    log.info("username:{}",username);
            log.info("password:{}",password);


    }
}

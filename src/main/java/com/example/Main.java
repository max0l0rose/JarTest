package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(
////		exclude={DataSourceAutoConfiguration.class}
)
public class Main {

    @Bean
//@Transactional
    boolean demo() {
        return true;
    }


    public static void main(String[] args) {

        //org.springframework.ws.server.EndpointAdapter

//        Logger log = LoggerFactory.getLogger(Main.class);
//        log.info("qqqqq");

        System.out.println("1");
        SpringApplication.run(Main.class, args);
        System.out.println("2");
    }
}



//@Data
//class User {
//
//}
//
//
//@Service
//class UserService {
//
//}

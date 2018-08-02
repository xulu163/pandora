package com.xulu.pandora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.context.request.RequestContextListener;

/**
 * Created by xulu on 2018/8/2.
 */
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = "com.xulu")
public class PandoraApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandoraApplication.class, args);
    }

    @Bean
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }
}

package com.xulu.pandora;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

/**
 * Created by xulu on 2018/8/2.
 */
public class PandoraApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandoraApplication.class, args);
    }

    @Bean
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }
}

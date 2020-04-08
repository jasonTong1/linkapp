package com.easylinkin.linkapp;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

@MapperScan(basePackages = {"com.easylinkin.linkapp.**.dao"})
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)

@ServletComponentScan
@EnableAsync
//@EnableEncryptableProperties
public class Appruner extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Appruner.class);
    }


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Appruner.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}

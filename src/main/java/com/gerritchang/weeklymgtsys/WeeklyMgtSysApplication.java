package com.gerritchang.weeklymgtsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.gerritchang.weeklymgtsys.*.mapper")
public class WeeklyMgtSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeeklyMgtSysApplication.class, args);
    }

}

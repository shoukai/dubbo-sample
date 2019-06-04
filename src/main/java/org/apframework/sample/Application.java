package org.apframework.sample;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Shoukai Huang
 * @Date: 2019/6/4 21:11
 */
@EnableDubbo(scanBasePackages = "org.apframework.sample.service")
@EnableFeignClients(basePackages = "org.apframework.sample.feign")
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
//                .listeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
//                    new EmbeddedZooKeeper(2182, false).start();
//                })
                .run(args);
    }

    @Override
    public void run(String... args) {
    }
}

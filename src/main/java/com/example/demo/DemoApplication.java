package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private final ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String[] allBeansNames = appContext.getBeanDefinitionNames();
        for (String beanName : allBeansNames) {
            log.info("Bean name: {}", beanName);
        }
    }
}

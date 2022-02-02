package com.example.hellobeanworld;

import com.example.hellobeanworld.services.MyColor;
import com.example.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor color;

    @Autowired
    public HelloBeanWorldApplication(Printer printer, MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloBeanWorldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(color.printColor());

    }
}
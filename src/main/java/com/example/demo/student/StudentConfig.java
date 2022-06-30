package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student lubuntu = new Student(
                    "Lubuntum",
                    LocalDate.of(1999, Month.NOVEMBER,18),
                    "Lubuntum@gmail.com");
            Student alex = new Student(
                    "Alex",
                    LocalDate.of(1996, Month.JANUARY,5),
                    "Alex@gmail.com");
            repository.saveAll(
                    Arrays.asList(lubuntu,alex)
            );
        };
    }
}

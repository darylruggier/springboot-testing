package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student daryl = new Student(
                    "Daryl",
                    LocalDate.of(2002, Month.JANUARY, 14),
                    "daryl.ruggier@gmail.com"
            );

            Student adam = new Student(
                    "Adam",
                    LocalDate.of(2002, Month.JANUARY, 14),
                    "adam.ruggier@gmail.com"
            );

            repository.saveAll(List.of(daryl, adam));
        };
    }
}

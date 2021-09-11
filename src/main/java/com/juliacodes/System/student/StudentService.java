package com.juliacodes.System.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service

public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariamgamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );
    }
}

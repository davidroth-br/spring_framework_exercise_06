package com.montrealcollege.exercise6.config;

import com.montrealcollege.exercise6.entities.Program;
import com.montrealcollege.exercise6.entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean(name = "java", initMethod = "firstHere")
    @Scope("prototype")
    public Program getJava() {
        return new Program("Java Development", 12);
    }

    @Bean(name = "student1")
    public Student getStudent1() {
        return new Student("David", "Roth", getJava());
    }

    @Bean(name = "student2")
    public Student getStudent2() {
        return new Student("Laryne", "Santana", getJava());
    }

    @Bean(name = "student3")
    @Lazy
    public Student getStudent3() {
        return new Student("Regina", "Serra", getJava());
    }

    @Bean(name = "student4")
    public Student getStudent4() {
        return new Student("Nanci", "Nascimento", getJava());
    }
}

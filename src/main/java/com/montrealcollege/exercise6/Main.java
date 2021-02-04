package com.montrealcollege.exercise6;

import com.montrealcollege.exercise6.config.JavaConfig;
import com.montrealcollege.exercise6.entities.Program;
import com.montrealcollege.exercise6.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student stu1 = context.getBean("student1", Student.class);
        Student stu2 = context.getBean("student2", Student.class);
        Student stu3 = context.getBean("student3", Student.class);
        Student stu4 = context.getBean("student4", Student.class);

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4);
    }
}

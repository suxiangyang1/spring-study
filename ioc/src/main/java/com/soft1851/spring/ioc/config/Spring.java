package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.soft1851.spring.ioc")
public class Spring {
    @Bean
    public Phone phone(){
        return new Phone();
    }

    @Bean
    public Student student() {
        return new Student();
    }
}

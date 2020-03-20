package com.soft1851.spring.ioc.appIoc;

import com.soft1851.spring.ioc.config.Spring;
import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Spring.class);
        Phone phone = (Phone) ac.getBean("phone");
        phone.setBrand("魅族");
        phone.setPrice(2568.9);
        Phone phone1 = new Phone();
        phone1.setBrand("iphonex");
        phone1.setPrice(8888.8);

        Student student = (Student) ac.getBean("student");
        student.setId(1);
        student.setName("John");
        List<String> hobbitsList = new ArrayList<>();
        hobbitsList.add("打球");
        hobbitsList.add("跑步");
        student.setHobbits(hobbitsList);
        List<Phone> phoneList  = new ArrayList<>();
        phoneList.add(phone);
        phoneList.add(phone1);
        student.setPhones(phoneList);
        System.out.println(student);


    }
}

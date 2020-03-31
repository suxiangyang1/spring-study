package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    public void insert() {
        Student student = Student.builder()
                .clazzId(1)
                .studentName("测试学生")
                .hometown("安徽阜阳")
                .birthday(LocalDate.of(2000,10,10))
                .build();
        studentMapper.insert(student);
        System.out.println(student.getStudentId());
    }

    @Test
    public void delete() {
        studentMapper.delete(2010);
    }

    @Test
    public void update() {
        Student student = studentMapper.getStudentById(2011);
        System.out.println(student);
        student.setStudentName("新世界");
        student.setHometown("四川");
        student.setBirthday(LocalDate.of(2000,1,10));
        studentMapper.update(student);
        System.out.println(studentMapper.getStudentById(2011));
    }

    @Test
    public void getStudentById() {
        Student student = studentMapper.getStudentById(2011);
        System.out.println(student);
    }

    @Test
    public void batchInsert() {
        List<Student> students = new ArrayList<>();
        for(int i=0; i<3;i++) {
            Student student = Student.builder()
                    .studentId(4000 + i)
                    .studentName("学习" + i)
                    .clazzId(1)
                    .hometown("南京")
                    .birthday(LocalDate.of(1999,01,10))
                    .build();
            students.add(student);
        }
        System.out.println(studentMapper.batchInsert(students));
    }

    @Test
    public void batchDelete() {
        List<Integer> integers = new ArrayList<>();
        integers.add(4000);
        integers.add(4001);
        integers.add(4002);
        int x = studentMapper.batchDelete(integers);
        System.out.println(x);
        }

    @Test
    public void batchUpdate() {
        List<Student> list = new ArrayList<>();
        for (int i=0;i<2;i++){
            Student student = Student.builder()
                    .studentId(2011 + i)
                    .studentName("批量改" + i)
                    .clazzId(1)
                    .hometown("南京")
                    .birthday(LocalDate.of(1999,01,10))
                    .build();
            list.add(student);
        }
        int n = studentMapper.batchUpdate(list);
        System.out.println(n);
    }

    @Test
    public void selectLimit() {
        System.out.print(studentMapper.selectLimit());
    }

    @Test
    public void selectLimitByDynamicSql() {
        Student student = Student.builder()
                .clazzId(2)
                .hometown("江苏")
                .studentName("孙")
                .build();
        System.out.println(studentMapper.selectLimitByDynamicSql(studentMapper.getStudentById(2004)));
    }

    @Test
    public void selectAll() {
        List<Student> students = studentMapper.selectAll();
        students.forEach(student -> {
            System.out.println(student.getStudentId()
            + ',' + student.getStudentName()
            + ',' + student.getHometown()
            + ',' + student.getBirthday()
            + ',' + student.getClazz().getClazzName());
        });
    }
}
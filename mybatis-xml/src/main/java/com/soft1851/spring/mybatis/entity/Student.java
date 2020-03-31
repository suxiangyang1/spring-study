package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * @author ysx
 * @Date 2020 / 3 / 31
 */


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer studentId;
    private Integer clazzId;
    private String studentName;
    private String hometown;
    private LocalDate birthday;
    /**
     * 学生所属班级
     */
    private Clazz clazz;
    /**
     * 学生所属课程
     */
    private List<Course> courses;
}

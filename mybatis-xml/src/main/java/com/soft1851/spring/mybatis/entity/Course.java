package com.soft1851.spring.mybatis.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ysx
 * @date 2020 / 3 / 31
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer courseId;
    private String courseName;
    /**
     * 课程和学生列表
     */
    private List<Student> students;
}

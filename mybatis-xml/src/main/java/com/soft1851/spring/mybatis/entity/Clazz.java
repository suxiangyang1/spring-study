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
public class Clazz {
    private Integer clazzId;
    private String clazzName;
    private Integer teacherId;
    /* 管理班级的老师  */
    private Teacher teacher;
    /*  班级学生集合  */
    private List<Student> students;
}

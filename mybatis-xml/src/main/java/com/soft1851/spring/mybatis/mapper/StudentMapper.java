package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ysx
 * @date 2020 / 3 / 31
 */

@Transactional(rollbackFor = Exception.class)
public interface StudentMapper {

    /**
     * 新增student,并且返回自增主键
     *
     * @param student
     */
    void insert(Student student);

    /**
     * 根绝studentId删除学生
     *
     * @param studentId
     */
    void delete(int studentId);

    /**
     * 修改Student
     *
     * @param student
     */
    void update(Student student);

    /**
     * 根据学生id查询学生
     *
     * @param studentId
     */

    /**
     * 根据studentId查询学生
     * @param studentId
     * @return
     */
    Student getStudentById(int studentId);

    /**
     * 批量新增
     * @param students
     * @return
     */
    int batchInsert(@Param("students") List<Student> students);

    /**
     * 批量删除
     * @param idList
     * @return
     */
    int batchDelete(@Param("idList") List<Integer> idList);

    /**
     * 批量修改
     * @param updateList
     * @return
     */
    int batchUpdate(@Param("updateList") List<Student> updateList);

    /**
     * 单表(带两个指定条件) 查询
     * @return
     */
    List<Student> selectLimit();

    /**
     * 单表指定条件查询（结合动态SQL）
     * @param student
     * @return
     */
    List<Student> selectLimitByDynamicSql(Student student);

    /**
     * 查询所有学生，按生日排序，多对一关联查询学生所在班级的信息
     * @return
     */
    List<Student> selectAll();
}

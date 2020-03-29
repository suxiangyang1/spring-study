package com.soft1851.spring.sprig.orm.appTest;

import com.soft1851.spring.sprig.orm.config.SpringDataSource;
import com.soft1851.spring.sprig.orm.entity.Forum;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SpringDataSourceConfigTest {
    public static void main(String[] args) {
        //生成基注解的配置应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDataSource.class);
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate);
        String sql = "SELECT * FROM t_forum ";
        List<Forum> forumList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Forum.class));
        System.out.println(forumList);
    }
}

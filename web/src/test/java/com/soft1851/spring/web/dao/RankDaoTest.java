package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.config.SpringDataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class RankDaoTest {
    @Resource
    private RankDao rankDao;


    @Test
    public void selectAll() {
    }

    @Test
    public void batchInsert() {
    }

    @Test
    public void insert() {
    }
}
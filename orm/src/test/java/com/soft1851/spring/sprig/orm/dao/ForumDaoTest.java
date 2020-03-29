package com.soft1851.spring.sprig.orm.dao;

import com.soft1851.spring.sprig.orm.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ForumDaoTest {

    @Autowired
    private ForumDao forumDao;

    @Test
    public void insert() {
        Forum forum = Forum.builder().forumName("CF").build();
        int n = forumDao.insert(forum);
        assertEquals(1,n);
    }

    @Test
    public void batchInsert() {
        Forum[] forums = {Forum.builder().forumName("CF1").build(),
                Forum.builder().forumName("CF2").build(),Forum.builder().forumName("CF3").build()
        };
        List<Forum> forumList = Arrays.asList(forums);
        int [] rows = forumDao.batchInsert(forumList);
        System.out.println(rows.length);
    }

    @Test
    public void delete() {
        int n = forumDao.delete(9);
        System.out.println(n);
    }

    @Test
    public void update() {
        Forum forum = forumDao.get(1);
        forum.setForumName("SC");
        int n =forumDao.update(forum);
    }

    @Test
    public void get() {
        Forum forum = forumDao.get(1);
    }

    @Test
    public void selectAll() {
        List<Forum> forums = forumDao.selectAll();
        System.out.println(forums);
    }
}
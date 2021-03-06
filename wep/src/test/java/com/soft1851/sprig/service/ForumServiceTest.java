package com.soft1851.sprig.service;

import com.soft1851.sprig.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ForumServiceTest {
    @Autowired
    private ForumService forumService;

    @Test
    public void selectAll() {
        List<Forum> forumList = forumService.selectAll();
        System.out.println(forumList);
    }

    @Test
    public void get() {
        Forum forum = forumService.get(2);
        System.out.println(forum);
    }
}
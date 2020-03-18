package com.soft1851.spring.ioc.dao;

import com.soft1851.spring.ioc.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PostDaoTest {
    @Autowired
    private PostDao postDao;

    @Test
    public void batchInsert() throws IOException {
        byte soundbyte[]=null;
        File file = new File("H:\\girl9.jpg");
        FileInputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int len = 0;
        byte[] tem= new byte[1024];
        while ((len=inputStream.read(tem))!=-1){
            outputStream.write(tem,0,len);
        }
        inputStream.close();
        outputStream.flush();
        outputStream.close();
        soundbyte= outputStream.toByteArray();

        Post[] posts = {Post.builder().forumId(1).title("123").content("123").thumbnail(soundbyte).createTime(Timestamp.valueOf(LocalDateTime.now())).build(),
                Post.builder().forumId(2).title("ed").content("12").thumbnail(soundbyte).createTime(Timestamp.valueOf(LocalDateTime.now())).build()
        };
        List<Post> postList = Arrays.asList(posts);
        int [] rows = postDao.batchInsert(postList);
        System.out.println(rows.length);
    }

    @Test
    public void batchDelete() {
        List<Integer> postIds = new ArrayList<>();
        postIds.add(5);
        postIds.add(6);
        int [] rows = postDao.batchDelete(postIds);
        System.out.println(rows.length);
    }

    @Test
    public void delete() {
        int n = postDao.delete(1);
        System.out.println(n);
    }

    @Test
    public void get() {
        Post post = postDao.get(1);
        System.out.println(post);
    }

    @Test
    public void count() {
        int post= postDao.count(1);
        System.out.println(post);
    }

    @Test
    public void insert() throws IOException {
        byte soundbyte[]=null;
        File file = new File("H:\\girl9.jpg");
        FileInputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int len = 0;
        byte[] tem= new byte[1024];
        while ((len=inputStream.read(tem))!=-1){
            outputStream.write(tem,0,len);
        }
        inputStream.close();
        outputStream.flush();
        outputStream.close();
        soundbyte= outputStream.toByteArray();
        Post post = Post.builder().forumId(1).title("123").content("123").thumbnail(soundbyte).createTime(Timestamp.valueOf(LocalDateTime.now())).build();
        int n = postDao.insert(post);
        System.out.println(n);

    }
}
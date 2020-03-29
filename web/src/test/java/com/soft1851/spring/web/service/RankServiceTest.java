package com.soft1851.spring.web.service;
import com.soft1851.spring.web.config.SpringDataSourceConfig;
import com.soft1851.spring.web.entity.Rank;
import com.soft1851.spring.web.spider.BiLiBiLiSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class RankServiceTest {
    @Resource
    private RankService rankService;


    @Test
    public void selectAll() {
        System.out.println(rankService.selectAll().size());
    }

    @Test
    public void addRack() {
        Rank rank=Rank.builder().author("wzw").pic("2.png")
                .title("hello world")
                .duration("2min").build();
        rankService.addRack(rank);
    }

    @Test
    public void batchInsert() {
        int [] inserts = rankService.batchInsert(BiLiBiLiSpider.getRanks());
        System.out.println(inserts.length);
    }
}
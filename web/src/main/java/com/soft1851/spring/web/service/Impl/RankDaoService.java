package com.soft1851.spring.web.service.Impl;

import com.soft1851.spring.web.dao.RankDao;
import com.soft1851.spring.web.entity.Rank;
import com.soft1851.spring.web.service.RankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RankDaoService implements RankService {
    @Resource
    private RankDao rankDao;


    @Override
    public List<Rank> selectAll() {
        return rankDao.selectAll();
    }

    @Override
    public void addRack(Rank rank) {
        rankDao.insert(rank);
    }

    @Override
    public int[] batchInsert(List<Rank> ranks) {
        return rankDao.batchInsert(ranks);
    }
}

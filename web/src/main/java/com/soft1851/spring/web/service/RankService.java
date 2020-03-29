package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entity.Rank;

import java.util.List;

public interface RankService {
    /**
     * 查询所有
     * @return List<Rank>
     */
    List<Rank> selectAll();

    /**
     * 新增单个
     * @param rank
     */
    void addRack(Rank rank);

    /**
     * 批量新增
     * @param ranks
     * @return
     */
    int [] batchInsert(List<Rank> ranks);
}

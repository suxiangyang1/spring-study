package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.entity.Rank;

import java.util.List;

public interface RankDao {
    /**
     * 搜索全部
     * @return List<Rank>
     */
    List<Rank> selectAll();

    /**
     * 批量新增
     * @param ranks
     * @return
     */
    int [] batchInsert(List<Rank> ranks);

    /**
     * 新增单个
     * @param rank
     * @return
     */
    int insert(Rank rank);

}

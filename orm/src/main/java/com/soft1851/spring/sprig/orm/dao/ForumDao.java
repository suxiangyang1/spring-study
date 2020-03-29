package com.soft1851.spring.sprig.orm.dao;

import com.soft1851.spring.sprig.orm.entity.Forum;

import java.util.List;

public interface ForumDao {
    /**
     * 新增Forum
     * @param forum
     * @return
     */
    int insert(Forum forum);

    /**
     * 批量新增
     * @param forums
     * @return
     */
    int[] batchInsert(List<Forum> forums);

    /**
     * 根据Id删除forum
     * @param forumId
     * @return
     */
    int delete(int forumId);

    /**
     * 修改forum
     * @param forum
     * @return
     */
    int update(Forum forum);

    /**
     * 根据Id查询forum
     * @param forumId
     * @return
     */
    Forum get(int forumId);

    /**
     * 查询所有论坛信息
     * @return
     */
    List<Forum> selectAll();

}

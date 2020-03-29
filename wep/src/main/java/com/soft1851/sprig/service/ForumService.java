package com.soft1851.sprig.service;

import com.soft1851.sprig.entity.Forum;

import java.util.List;

/**
 * @author ysx
 * @date 2020 / 3 / 20
 */

public interface ForumService {
    /**
     * 查询所有
     * @return
     */
    List<Forum> selectAll();

    /**
     * 根据Id查询forum
     * @param forumId
     * @return
     */
    Forum get(int forumId);

}

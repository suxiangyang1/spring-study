package com.soft1851.spring.ioc.dao;

import com.soft1851.spring.ioc.entity.Post;

import java.util.List;

public interface PostDao {
    /**
     * 新增
     * @param post
     * @return
     */
    int insert(Post post);

    /**
     * 批量新增
     * @param posts
     * @return
     */
    int[] batchInsert(List<Post> posts);

    /**
     *批量删除 posts
     * @param postId
     * @return
     */
    int[] batchDelete(List<Integer> postId);

    /**
     * 根据Id删除post
     * @param postId
     * @return
     */
    int delete(int postId);

    /**
     * 根据ID查询post
     * @param postId
     * @return
     */
    Post get(int postId);

    /**
     * 统计
     * @param forumId
     * @return
     */
    int count(int forumId);


}

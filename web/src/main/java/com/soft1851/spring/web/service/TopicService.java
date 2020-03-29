package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entity.Topic;

import java.util.List;

public interface TopicService {
    /**
     * 查询所有
     *
     * @return
     */
    List<Topic> selectAll();

    /**
     * 新增一个
     * @param topic
     */
    void  addTopic(Topic topic);

    /**
     * 批量新增
     * @param topics
     * @return
     */
    int [] batchInsert(List<Topic> topics);

}

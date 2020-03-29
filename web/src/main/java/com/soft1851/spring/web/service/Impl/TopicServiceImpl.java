package com.soft1851.spring.web.service.Impl;

import com.soft1851.spring.web.dao.TopicDao;
import com.soft1851.spring.web.entity.Topic;
import com.soft1851.spring.web.service.TopicService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TopicServiceImpl implements TopicService {
    @Resource
    private TopicDao topicDao;

    @Override
    public List<Topic> selectAll() {
        return topicDao.selectAll();
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insert(topic);
//            int a = 1 / 0;
    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        return topicDao.batchInsrt(topics);
    }
}

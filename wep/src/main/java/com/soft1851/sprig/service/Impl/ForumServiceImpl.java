package com.soft1851.sprig.service.Impl;

import com.soft1851.sprig.dao.ForumDao;
import com.soft1851.sprig.entity.Forum;
import com.soft1851.sprig.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ForumServiceImpl implements ForumService {
    @Autowired
    private ForumDao forumDao;

    @Override
    public List<Forum> selectAll() {
        return forumDao.selectAll();
    }

    @Override
    public Forum get(int forumId) {
        return forumDao.get(forumId);
    }
}

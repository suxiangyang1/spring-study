package com.soft1851.sprig.controller;

import com.alibaba.fastjson.JSON;
import com.soft1851.sprig.service.ForumService;
import com.soft1851.sprig.util.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "forum")
public class ForumController {
    @Autowired
    private ForumService forumService;
    @RequestMapping(value = "/list",produces = "application/json;charset=UTF-8")
    public String getForms(){
        ResponseObject ro = new ResponseObject(1,"成功",forumService.selectAll());
        return JSON.toJSONString(ro);
    }
    @RequestMapping(value = "/getId",produces = "application/json;charset=UTF-8")
    public String getforumsById(){
        ResponseObject rc = new ResponseObject(1,"成功",forumService.get(1));
        return JSON.toJSONString(rc);
    }
}

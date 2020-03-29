package com.soft1851.spring.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.service.TopicService;
import com.soft1851.spring.web.util.ResponseObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/")
public class TropicController {
    @Resource
    private TopicService topicService;

    @GetMapping(value = "topics",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getTopics(){
        ResponseObject rc = new ResponseObject(1,"succeesful",topicService.selectAll());
        return JSONObject.toJSONString(rc);
    }

    @GetMapping("/topic")
    public String topic(Model model) {
        model.addAttribute("topics",topicService.selectAll());
        return "topic";
    }

}

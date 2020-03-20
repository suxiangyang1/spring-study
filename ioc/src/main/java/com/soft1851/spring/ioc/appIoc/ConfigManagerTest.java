package com.soft1851.spring.ioc.appIoc;

import com.soft1851.spring.ioc.entity.ConfigManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ConfigManagerTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        ConfigManager configManager = (ConfigManager) context.getBean("configManager");
        List<String> list = configManager.getList();
        Map<String, String> map = configManager.getMap();
        Properties properties = configManager.getProperties();
        Set<String> set = configManager.getSet();
        System.out.println("list:"+list+" map:"+map+" properties:"+properties+" set:"+set);
    }
}

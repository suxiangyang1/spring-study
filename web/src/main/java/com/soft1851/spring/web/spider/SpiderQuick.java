package com.soft1851.spring.web.spider;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author ysx
 * @date 2020 / 3 / 26
 */

public class SpiderQuick {
    public static void main(String[] args) throws Exception {
       try(CloseableHttpClient closeableHttpClient = HttpClients.createDefault()) {
           HttpGet httpGet = new HttpGet("https://www.zhihu.com/");
           try(CloseableHttpResponse response1 = closeableHttpClient.execute(httpGet)) {
               System.out.println(response1.getStatusLine());
               HttpEntity entity = response1.getEntity();
               EntityUtils.consume(entity);
               System.out.println(entity);
           }
       }
    }
}

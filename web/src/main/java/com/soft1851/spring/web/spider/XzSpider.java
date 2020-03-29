package com.soft1851.spring.web.spider;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.entity.Xz;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XzSpider {
    private static  final  Integer SUCCESS=200;
    public static List<Xz> getTopics(){
        List<Xz> topics=new ArrayList<>();
        //目标地址
        String url="https://xiaoce-timeline-api-ms.juejin.im/v1/getListByLastTime?uid=5e3004dae51d454d310fb75e&client_id=1585375994666&token=eyJhY2Nlc3NfdG9rZW4iOiJoNDd6YUlyN2xhZ3NmMUNzIiwicmVmcmVzaF90b2tlbiI6Ik0wQ09laTZMdkhjeGJlQ3kiLCJ0b2tlbl90eXBlIjoibWFjIiwiZXhwaXJlX2luIjoyNTkyMDAwfQ%3D%3D&src=web&alias=&pageNum=1";
        //创建HttpClient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //创建get请求
        HttpGet get=new HttpGet(url);
        //创建context请求
        HttpClientContext context=HttpClientContext.create();
        //创建response对象
        CloseableHttpResponse response=null;
        try{
            response=httpclient.execute(get,context);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(response.getStatusLine());
        if (response.getStatusLine().getStatusCode()==SUCCESS){
            HttpEntity entity=response.getEntity();
            String res=null;
            try {
                res= EntityUtils.toString(entity,"UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            JSONObject jsonObject=JSONObject.parseObject(res);
            JSONArray list=jsonObject.getJSONArray("d");
            list.forEach(o -> {
                JSONObject json=JSONObject.parseObject(o.toString());
                Xz xz = Xz.builder()
                        .id(json.getString("_id"))
                        .desc(json.getString("desc"))
                        .price(json.getDouble("price"))
                        .title(json.getString("title"))
                        .buyCount(json.getInteger("buyCount")).build();
                topics.add(xz);
                System.out.println(topics);
            });
        }else {
            System.out.println("请求失败");

        }try{
            response.close();
            httpclient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  topics;
    }

    public static void main(String[] args) {
        getTopics();
    }
}

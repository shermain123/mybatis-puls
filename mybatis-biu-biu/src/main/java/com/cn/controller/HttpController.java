package com.cn.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sher on 2020/11/26.
 */

@Api("测试httpClient")
@RestController
@RequestMapping("/myhttp")
public class HttpController {

    @ApiOperation("测试httpClit发送GET请求")
    @ApiImplicitParam(name = "id",value = "id",required = true,dataType = "String")
    @GetMapping("/http-get/{id}")
    public void  httpGet(String id) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            //创建httpget
            HttpGet httpGet = new HttpGet("http://127.0.0.1:8081/loanApprove/loanApproveFirst?id="+id);
            System.out.println("executing request:"+httpGet.getURI());
            //执行get请求
            CloseableHttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            System.out.println("---------------------------------");
            //打印响应状态
            System.out.println(response.getStatusLine());
            if (entity != null){
                //打印响应内容长度
                System.out.println("Response content length:"+entity.getContentLength());
                //打印响应内容
                System.out.println("Response content :" + EntityUtils.toString(entity));
                System.out.println("---------------------------------");
            }
            response.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭连接，释放资源
            try {
                httpClient.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @ApiOperation("测试httpClient发送post请求")

    @PostMapping("/httpPost")
    public void httpPost(){
        // 创建默认的httpClient实列
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建httpPost
        HttpPost httpPost = new HttpPost("http://127.0.0.1:8081/user/login");
        // 创建参数队列
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add(new BasicNameValuePair("account","admin"));
        formparams.add(new BasicNameValuePair("password","admin@123"));
        UrlEncodedFormEntity uefEntity;
        try{
            uefEntity = new UrlEncodedFormEntity(formparams);
            httpPost.setEntity(uefEntity);
            System.out.println("executing request " + httpPost.getURI());
            CloseableHttpResponse response = httpClient.execute(httpPost);
            try {
                HttpEntity entity = response.getEntity();
                if (entity != null){
                    System.out.println("------------------------");
                    System.out.println("Response content:" + EntityUtils.toString(entity,"utf-8"));
                    System.out.println("------------------------");
                }
            }finally {
                response.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}

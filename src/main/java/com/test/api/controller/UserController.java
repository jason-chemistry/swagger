package com.test.api.controller;


import com.alibaba.fastjson.JSONObject;
import com.test.api.mapper.UserMapper;
import com.test.api.service.UserService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.springframework.core.io.ResourceLoader;

@RestController
@RequestMapping(value="/get")
public class UserController {

    @Resource
    private ResourceLoader resourceLoader;

    @Autowired
    UserService userService;


    @ResponseBody
    @RequestMapping(value = "/ExportUsers/{date}",method = RequestMethod.GET)
    @ApiOperation(value = "获取新冠病毒", notes = "")
    @ApiImplicitParam(name = "date", value = "日期", required = true, dataType = "String", paramType = "path")
    public String get (@PathVariable String date,HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.get(date);
        String fileName = "export.xls";
        //设置为png格式的文件
        response.setHeader("content-type", "image/png");
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        byte[] buff = new byte[1024];
        //创建缓冲输入流
        BufferedInputStream bis = null;
        OutputStream outputStream = null;

        try {
            outputStream = response.getOutputStream();

            //这个路径为待下载文件的路径
            bis = new BufferedInputStream(new FileInputStream(new File("D:/" + fileName )));
            int read = bis.read(buff);

            //通过while循环写入到指定了的文件夹中
            while (read != -1) {
                outputStream.write(buff, 0, buff.length);
                outputStream.flush();
                read = bis.read(buff);
            }
        } catch ( IOException e ) {
            e.printStackTrace();
            //出现异常返回给页面失败的信息

        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return JSONObject.toJSONString(userService.get(date).get(0));

    }
    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String gets (@PathVariable int id){
       return "1";
    }




}
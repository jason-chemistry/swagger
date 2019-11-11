package com.test.api.controller;


import com.alibaba.fastjson.JSONObject;
import com.test.api.mapper.UserMapper;
import com.test.api.service.UserService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


@RestController
@RequestMapping(value="/users")
public class UserController {


    @Autowired
    UserService userService;

    //获取微信openId

    @ResponseBody
    @RequestMapping(value = "v2/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户编号(必填)", required = true, dataType = "Long", paramType = "path")
    public String get (@PathVariable int id){
        return JSONObject.toJSONString(userService.get().get(0));
    }
    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String gets (@PathVariable int id){
       return "1";
    }









}
package com.software.management.controller;

import com.software.management.dao.model.UserModel;
import com.software.management.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息控制类
 *
 * @author spy
 */
@Api(value = "用户控制器")
@RestController
@RequestMapping(value = "/User")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 获取所有人员
     *
     * @return 所有人员信息
     */
    @ApiOperation(value = "获取全部用户信息")
    @RequestMapping(value = {"/getAll"}, method = RequestMethod.GET)
    public ResponseEntity<List<UserModel>> getAll() {
        List<UserModel> result = userService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

package com.software.management.controller;

import com.software.management.dao.model.UserModel;
import com.software.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 用户信息控制类
 *
 * @author spy
 */
@Controller
@RequestMapping(value = "/User")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"/getAll"}, method = RequestMethod.GET)
    public ResponseEntity<List<UserModel>> getAll() {
        List<UserModel> result = userService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

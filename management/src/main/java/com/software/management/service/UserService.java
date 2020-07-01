package com.software.management.service;

import com.software.management.dao.model.UserModel;

import java.util.List;

/**
 * 用户接口
 *
 * @author spy
 */
public interface UserService {

    /**
     * 获取全部用户
     * @return 用户信息
     */
    List<UserModel> getAll();
}

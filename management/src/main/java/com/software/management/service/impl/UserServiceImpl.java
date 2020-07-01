package com.software.management.service.impl;

import com.software.management.dao.mapper.UserModelMapper;
import com.software.management.dao.model.UserModel;
import com.software.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户实现类
 *
 * @author spy
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserModelMapper userModelMapper;

    @Override
    public List<UserModel> getAll() {
        return userModelMapper.getAll();
    }
}

package com.software.management.service.impl;

import com.software.management.dao.mapper.LeasePointModelMapper;
import com.software.management.dao.model.LeasePointModel;
import com.software.management.service.LeasePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 租赁点信息
 *
 * @author spy
 */
@Service
public class LeasePointServiceImpl implements LeasePointService {

    @Autowired
    LeasePointModelMapper leasePointModelMapper;

    /**
     * 获取全部租赁点信息
     *
     * @return List<LeasePointModel>
     */
    @Override
    public List<LeasePointModel> getAll() {
        return leasePointModelMapper.getAll();
    }
}

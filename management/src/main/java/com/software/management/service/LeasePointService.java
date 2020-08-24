package com.software.management.service;

import com.software.management.dao.model.LeasePointModel;

import java.util.List;

/**
 * 租赁点接口
 *
 * @author spy
 */
public interface LeasePointService {
    /**
     * 获取全部租赁点信息
     *
     * @return List<LeasePointModel>
     */
    List<LeasePointModel> getAll();
}

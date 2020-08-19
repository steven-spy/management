package com.software.management.service;

import com.software.management.dao.model.BicycleModel;

import java.util.List;

/**
 * 自行车信息
 *
 * @author spy
 */
public interface BicycleService {
    /**
     * 获取自行车数量
     *
     * @return int
     */
    int getBicycleCount();

    /**
     * 获取部分自行车信息
     *
     * @param pageSize
     * @param pageIndex
     * @return List<BicycleModel>
     */
    List<BicycleModel> getAllWithPaging(int pageSize, int pageIndex);

    /**
     * 根据条件查询自行车信息
     *
     * @param biName
     * @return List<BicycleModel>
     */
    List<BicycleModel> searchBicycleByName(String biName);
}

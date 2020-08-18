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
     * 获取全部自行车信息
     *
     * @return List<BicycleModel>
     */
    List<BicycleModel> getAll();

    /**
     * 获取部分自行车信息
     *
     * @param pageSize
     * @param pageIndex
     * @return List<BicycleModel>
     */
    List<BicycleModel> getAllWithPaging(int pageSize, int pageIndex);
}

package com.software.management.service.impl;

import com.software.management.dao.mapper.BicycleModelMapper;
import com.software.management.dao.model.BicycleModel;
import com.software.management.service.BicycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 自行车信息
 *
 * @author spy
 */
@Service
public class BicycleServiceImpl implements BicycleService {

    @Autowired
    BicycleModelMapper bicycleModelMapper;

    /**
     * 获取自行车数量
     *
     * @return int
     */
    @Override
    public int getBicycleCount() {
        return bicycleModelMapper.getBicycleCount();
    }

    /**
     * 获取自行车分页信息
     *
     * @param pageSize
     * @param pageIndex
     * @return List<BicycleModel>
     */
    @Override
    public List<BicycleModel> getAllWithPaging(int pageSize, int pageIndex) {
        return bicycleModelMapper.getAllWithPaging(pageSize, pageIndex);
    }

    /**
     * 获取维修中自行车分页信息
     *
     * @return List<BicycleModel>
     */
    @Override
    public List<BicycleModel> getAllWithCondition() {
        return bicycleModelMapper.getAllWithCondition();
    }

    /**
     * 根据条件查询自行车信息
     *
     * @param biName
     * @return List<BicycleModel>
     */
    @Override
    public List<BicycleModel> searchBicycleByName(String biName) {
        return bicycleModelMapper.searchBicycleByName(biName);
    }

    /**
     * 根据biId维修自行车
     *
     * @param biId
     * @return int
     */
    @Override
    public int repairBicycle(int biId) {
        return bicycleModelMapper.repairBicycle(biId);
    }
}

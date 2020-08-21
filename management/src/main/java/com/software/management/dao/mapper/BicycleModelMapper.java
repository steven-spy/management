package com.software.management.dao.mapper;

import com.software.management.dao.model.BicycleModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自行车信息xml接口
 *
 * @author spy
 */
public interface BicycleModelMapper {
    /**
     * 获取自行车数量
     *
     * @return List<BicycleModel>
     */
    int getBicycleCount();

    /**
     * 获取自行车分页信息
     *
     * @param pageSize
     * @param pageIndex
     * @return List<BicycleModel>
     */
    List<BicycleModel> getAllWithPaging(@Param("pageSize") int pageSize, @Param("pageIndex") int pageIndex);

    /**
     * 获取维修中自行车分页信息
     *
     * @return List<BicycleModel>
     */
    List<BicycleModel> getAllWithCondition();

    /**
     * 根据条件查询自行车信息
     *
     * @param biName
     * @return List<BicycleModel>
     */
    List<BicycleModel> searchBicycleByName(String biName);

    /**
     * 根据biId维修自行车
     *
     * @param biId
     * @return int
     */
    int repairBicycle(int biId);

    /**
     * 根据biId删除自行车
     *
     * @param biId
     * @return int
     */
    int deleteBicycleById(int biId);
}

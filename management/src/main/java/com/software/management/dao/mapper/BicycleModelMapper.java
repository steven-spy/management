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
     * 获取部分自行车信息
     *
     * @param pageSize
     * @param pageIndex
     * @return List<BicycleModel>
     */
    List<BicycleModel> getAllWithPaging(@Param("pageSize") int pageSize, @Param("pageIndex") int pageIndex);
}

package com.software.management.dao.mapper;

import com.software.management.dao.model.BicycleModel;

import java.util.List;

/**
 * 自行车信息xml接口
 *
 * @author spy
 */
public interface BicycleModelMapper {
    List<BicycleModel> getAll();
}

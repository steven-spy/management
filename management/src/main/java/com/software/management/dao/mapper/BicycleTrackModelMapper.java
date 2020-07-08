package com.software.management.dao.mapper;

import com.software.management.dao.model.BicycleTrackModel;

import java.util.List;

/**
 * 自行车轨迹xml接口
 *
 * @author spy
 */
public interface BicycleTrackModelMapper {
    /**
     * 获取全部自行车轨迹
     *
     * @return 全部自行车轨迹
     */
    List<BicycleTrackModel> getAll();
}

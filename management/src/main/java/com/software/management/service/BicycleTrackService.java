package com.software.management.service;

import com.software.management.dao.model.BicycleTrackModel;

import java.util.List;

/**
 * @author admin
 */
public interface BicycleTrackService {
    /**
     * 获取全部自行车轨迹
     *
     * @return 全部自行车轨迹
     */
    List<BicycleTrackModel> getAll();
}

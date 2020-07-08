package com.software.management.service.impl;

import com.software.management.dao.mapper.BicycleTrackModelMapper;
import com.software.management.dao.model.BicycleTrackModel;
import com.software.management.service.BicycleTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BicycleTrackServiceImpl implements BicycleTrackService {

    @Autowired
    BicycleTrackModelMapper bicycleTrackModelMapper;

    /**
     * 获取全部自行车轨迹
     *
     * @return 全部自行车轨迹
     */
    @Override
    public List<BicycleTrackModel> getAll() {
        return bicycleTrackModelMapper.getAll();
    }
}

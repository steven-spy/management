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

    @Override
    public List<BicycleTrackModel> getAll() {
        return bicycleTrackModelMapper.getAll();
    }
}

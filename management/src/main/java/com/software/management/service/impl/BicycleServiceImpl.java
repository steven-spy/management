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

    @Override
    public List<BicycleModel> getAll() {
        return bicycleModelMapper.getAll();
    }

    @Override
    public List<BicycleModel> getAllWithPaging(int pageSize, int pageIndex) {
        return bicycleModelMapper.getAllWithPaging(pageSize, pageIndex);
    }
}

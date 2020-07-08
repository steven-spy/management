package com.software.management.service;

import com.software.management.dao.model.BicycleModel;

import java.util.List;

/**
 * 自行车信息
 *
 * @author spy
 */
public interface BicycleService {
    List<BicycleModel> getAll();
}

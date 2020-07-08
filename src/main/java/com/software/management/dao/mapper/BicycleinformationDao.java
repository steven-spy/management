package com.software.management.dao.mapper;

import com.software.management.dao.model.Bicycleinformation;

public interface BicycleinformationDao {
    int deleteByPrimaryKey(Long biId);

    int insert(Bicycleinformation record);

    int insertSelective(Bicycleinformation record);

    Bicycleinformation selectByPrimaryKey(Long biId);

    int updateByPrimaryKeySelective(Bicycleinformation record);

    int updateByPrimaryKey(Bicycleinformation record);
}
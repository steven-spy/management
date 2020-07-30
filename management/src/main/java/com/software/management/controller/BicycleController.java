package com.software.management.controller;

import com.software.management.dao.model.BicycleModel;
import com.software.management.service.BicycleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 自行车信息
 *
 * @author spy
 */
@Api(value = "自行车信息控制器")
@RestController
@RequestMapping(value = "/Bicycle")
public class BicycleController {

    @Autowired
    BicycleService bicycleService;

    @ApiOperation(value = "获取所有自行车全部信息")
    @RequestMapping(value = {"/getAll"}, method = RequestMethod.GET)
    public ResponseEntity<List<BicycleModel>> getAll() {
        List<BicycleModel> result = bicycleService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

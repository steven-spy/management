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

    /**
     * 获取自行车数量
     *
     * @return int
     */
    @ApiOperation(value = "获取所有自行车全部信息")
    @RequestMapping(value = {"/getBicycleCount"}, method = RequestMethod.GET)
    public ResponseEntity<Integer> getBicycleCount() {
        int result = bicycleService.getBicycleCount();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * 获取部分自行车信息
     *
     * @param pageSize
     * @param pageCount
     * @return List<BicycleModel>
     */
    @ApiOperation(value = "获取自行车部分全部信息")
    @RequestMapping(value = {"/getAllWithPaging"}, method = RequestMethod.GET)
    public ResponseEntity<List<BicycleModel>> getAllWithPaging(int pageSize, int pageCount) {
        int pageIndex = (pageCount - 1) * pageSize;
        List<BicycleModel> result = bicycleService.getAllWithPaging(pageSize, pageIndex);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

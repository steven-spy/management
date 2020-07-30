package com.software.management.controller;

import com.software.management.dao.model.BicycleTrackModel;
import com.software.management.service.BicycleTrackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 自行车轨迹
 *
 * @author spy
 */
@Api(value = "自行车轨迹控制器")
@RestController
@RequestMapping(value = "/BicycleTrack")
public class BicycleTrackController {

    @Autowired
    BicycleTrackService bicycleTrackService;

    /**
     * 获取所有自行车轨迹信息
     *
     * @return 所有自行车轨迹
     */
    @ApiOperation(value = "获取所有自行车全部轨迹")
    @RequestMapping(value = {"/getAll"}, method = RequestMethod.GET)
    public ResponseEntity<List<BicycleTrackModel>> getAll() {
        List<BicycleTrackModel> result = bicycleTrackService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * 获取指定自行车轨迹
     *
     * @param btBicycleName
     * @return 自行车轨迹
     */
    @ApiOperation(value = "获取指定自行车轨迹")
    @RequestMapping(value = {"/getAppointBicycleTrack"}, method = RequestMethod.GET)
    public ResponseEntity<List<BicycleTrackModel>> getAppointBicycleTrack(@RequestParam @ApiParam(value = "自行车名称")
                                                                                  String btBicycleName) {
        List<BicycleTrackModel> result = bicycleTrackService.getAppointBicycleTrack(btBicycleName);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

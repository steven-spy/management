package com.software.management.controller;

import com.software.management.dao.model.BicycleTrackModel;
import com.software.management.service.BicycleTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 自行车轨迹
 *
 * @author spy
 */
@Controller
@RequestMapping(value = "/BicycleTrack")
public class BicycleTrackController {

    @Autowired
    BicycleTrackService bicycleTrackService;

    /**
     * 获取所有自行车轨迹信息
     *
     * @return 所有自行车轨迹
     */
    @RequestMapping(value = {"/getAll"}, method = RequestMethod.GET)
    public ResponseEntity<List<BicycleTrackModel>> getAll() {
        List<BicycleTrackModel> result = bicycleTrackService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

package com.software.management.controller;

import com.software.management.dao.model.LeasePointModel;
import com.software.management.service.LeasePointService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 租赁点信息
 *
 * @author spy
 */
@RestController
@RequestMapping(value = "/LeasePoint")
@Api(value = "租赁点信息控制器")
public class LeasePointController {

    @Autowired
    LeasePointService leasePointService;

    /**
     * 获取全部租赁点信息
     *
     * @return List<LeasePointModel>
     */
    @RequestMapping(value = {"/getAll"}, method = RequestMethod.GET)
    public ResponseEntity<List<LeasePointModel>> getAll() {
        List<LeasePointModel> result = leasePointService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

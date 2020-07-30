package com.software.management.dao.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 自行车信息实体类
 *
 * @author spy
 */
@ApiModel(value = "自行车信息实体类")
public class BicycleModel {
    @ApiModelProperty(value = "自行车信息唯一标识")
    private int biId;
    @ApiModelProperty(value = "自行车名称")
    private String biName;
    @ApiModelProperty(value = "自行车所在租赁点")
    private String biPoint;
    @ApiModelProperty(value = "自行车状态")
    private Boolean biState;
    @ApiModelProperty(value = "自行车当前经度")
    private String biJd;
    @ApiModelProperty(value = "自行车当前纬度")
    private String biWd;

    public int getBiId() {
        return biId;
    }

    public void setBiId(int biId) {
        this.biId = biId;
    }

    public String getBiName() {
        return biName;
    }

    public void setBiName(String biName) {
        this.biName = biName;
    }

    public String getBiPoint() {
        return biPoint;
    }

    public void setBiPoint(String biPoint) {
        this.biPoint = biPoint;
    }

    public Boolean getBiState() {
        return biState;
    }

    public void setBiState(Boolean biState) {
        this.biState = biState;
    }

    public String getBiJd() {
        return biJd;
    }

    public void setBiJd(String biJd) {
        this.biJd = biJd;
    }

    public String getBiWd() {
        return biWd;
    }

    public void setBiWd(String biWd) {
        this.biWd = biWd;
    }
}

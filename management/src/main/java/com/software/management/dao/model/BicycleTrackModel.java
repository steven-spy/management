package com.software.management.dao.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 自行车轨迹实体类
 *
 * @author spy
 */
@ApiModel(value = "自行车轨迹实体类")
public class BicycleTrackModel {
    @ApiModelProperty(value = "自行车轨迹唯一标识")
    private int btId;
    @ApiModelProperty(value = "自行车名称")
    private String btBicycleName;
    @ApiModelProperty(value = "自行车原始经度")
    private String btOrJd;
    @ApiModelProperty(value = "自行车原始纬度")
    private String btOrWd;
    @ApiModelProperty(value = "自行车当前经度")
    private String btPrJd;
    @ApiModelProperty(value = "自行车当前纬度")
    private String btPrWd;

    public int getBtId() {
        return btId;
    }

    public void setBtId(int btId) {
        this.btId = btId;
    }

    public String getBtBicycleName() {
        return btBicycleName;
    }

    public void setBtBicycleName(String btBicycleName) {
        this.btBicycleName = btBicycleName;
    }

    public String getBtOrJd() {
        return btOrJd;
    }

    public void setBtOrJd(String btOrJd) {
        this.btOrJd = btOrJd;
    }

    public String getBtOrWd() {
        return btOrWd;
    }

    public void setBtOrWd(String btOrWd) {
        this.btOrWd = btOrWd;
    }

    public String getBtPrJd() {
        return btPrJd;
    }

    public void setBtPrJd(String btPrJd) {
        this.btPrJd = btPrJd;
    }

    public String getBtPrWd() {
        return btPrWd;
    }

    public void setBtPrWd(String btPrWd) {
        this.btPrWd = btPrWd;
    }
}

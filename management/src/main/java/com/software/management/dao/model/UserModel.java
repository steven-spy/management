package com.software.management.dao.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户实体类
 *
 * @author spy
 */
@ApiModel(value = "用户实体类")
public class UserModel {
    @ApiModelProperty(value = "用户唯一标识")
    private int uId;
    @ApiModelProperty(value = "用户姓名")
    private String uName;
    @ApiModelProperty(value = "用户年龄")
    private int uAge;
    @ApiModelProperty(value = "用户性别")
    private String uSex;
    @ApiModelProperty(value = "用户电话")
    private String uPhone;
    @ApiModelProperty(value = "用户身份证")
    private String uCard;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuCard() {
        return uCard;
    }

    public void setuCard(String uCard) {
        this.uCard = uCard;
    }
}

package com.honor.model;

import javax.persistence.Id;
import java.util.Date;

/**
 * 用户
 *
 * @author rongyaowen
 * @create 2018-10-28 20:56
 **/
public class SysUser {
    @Id
    private Integer sysUserId;
    private String userName;
    private String email;
    private String headImg;
    private Date createTime;
    private String password;

    public Integer getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "sysUserId=" + sysUserId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", headImg='" + headImg + '\'' +
                ", createTime=" + createTime +
                ", password='" + password + '\'' +
                '}';
    }
}

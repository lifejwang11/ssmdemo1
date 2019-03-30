package com.ssm.demo.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

public class Description  implements Serializable{
    private Long id;
    private  String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Date createTime;

    @Override
    public String toString() {
        return "Description{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}

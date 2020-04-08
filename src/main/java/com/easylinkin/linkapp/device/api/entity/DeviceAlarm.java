package com.easylinkin.linkapp.device.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import org.hibernate.validator.constraints.Length;

/**
 * <p>设备告警Demo</p>
 *
 * @author TongJie
 * @since 2020/4/7 17:33
 */
@TableName("device_name")
public class DeviceAlarm extends Model<DeviceAlarm> {

    @TableId
    @Length(max = 32, message = "id 超长")
    private String id;

    @TableField("name")
    @Length(max = 50, message = "schemeName超长")
    private String name;

    @TableField("type")
    private Integer type;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}

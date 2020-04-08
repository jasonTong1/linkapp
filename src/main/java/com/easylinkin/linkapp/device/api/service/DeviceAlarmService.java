package com.easylinkin.linkapp.device.api.service;

import com.baomidou.mybatisplus.core.metadata.IPage;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.easylinkin.linkapp.device.api.entity.DeviceAlarm;
import java.util.List;

/**
 * <p></p>
 *
 * @author TongJie
 * @since 2020/4/7 20:25
 */
public interface DeviceAlarmService extends IService<DeviceAlarm> {

    boolean addDeviceAlarm(DeviceAlarm deviceAlarm);


    List<DeviceAlarm> selectDeviceAlarm(DeviceAlarm deviceAlarm);

    Page<DeviceAlarm> selectDeviceAlarm(Page<DeviceAlarm> page, DeviceAlarm deviceAlarm);


    List<DeviceAlarm> getDeviceAlarm(DeviceAlarm deviceAlarm);

    /**
     * 分页查询
     * @param page
     * @param deviceAlarm
     * @return
     */
    IPage<DeviceAlarm> getDeviceAlarm(Page<DeviceAlarm> page, DeviceAlarm deviceAlarm);
}

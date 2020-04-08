package com.easylinkin.linkapp.device.api.service;

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

    List<DeviceAlarm> getDeviceAlarmPage();

    List<DeviceAlarm> getDeviceAlarm();
}

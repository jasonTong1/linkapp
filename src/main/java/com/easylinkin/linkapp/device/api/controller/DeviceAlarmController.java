package com.easylinkin.linkapp.device.api.controller;

import com.easylinkin.linkapp.device.api.entity.DeviceAlarm;
import com.easylinkin.linkapp.device.api.service.DeviceAlarmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author TongJie
 * @since 2020/4/7 17:39
 */
@RestController
@RequestMapping("/api/deviceAlarm")
public class DeviceAlarmController {

    @Autowired
    DeviceAlarmService deviceAlarmService;

    @GetMapping("/get")
    public List<DeviceAlarm> getDeviceAlarm() {
//        EntityWrapper  ew = new EntityWrapper<>();
//        ew.eq("name","aaa");
        return deviceAlarmService.list();

    }

    //    @OperateAction("新增基数方案")
//    @ApiOperation("新增基数方案")
    @GetMapping("/add")
    public boolean addDeviceAlarm() {

        DeviceAlarm deviceAlarm = new DeviceAlarm();
        deviceAlarm.setId("aaaabbb");
        deviceAlarm.setName("aaaabbb");
        deviceAlarm.setType(2);
        return deviceAlarmService.addDeviceAlarm(deviceAlarm);
    }


    @GetMapping("getPage")
    public List<DeviceAlarm> getDeviceAlarmPage() {
        return deviceAlarmService.getDeviceAlarmPage();
    }
}

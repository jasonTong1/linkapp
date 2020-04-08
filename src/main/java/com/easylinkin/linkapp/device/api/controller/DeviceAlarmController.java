package com.easylinkin.linkapp.device.api.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.easylinkin.linkapp.device.api.entity.DeviceAlarm;
import com.easylinkin.linkapp.device.api.service.DeviceAlarmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getDeviceAlarm")
    public List<DeviceAlarm> getDeviceAlarm(@RequestParam("json") String json) {
        JSONObject jsonObject = JSON.parseObject(json);
        DeviceAlarm deviceAlarm = jsonObject
            .getObject("customQueryParams", DeviceAlarm.class);
        Page<DeviceAlarm> page = jsonObject.getObject("page", Page.class);
        Assert.notNull(deviceAlarm, "customQueryParams 不能为空");
        return deviceAlarmService.getDeviceAlarm(deviceAlarm);

    }

    @GetMapping("/getDeviceAlarmPage")
    public IPage<DeviceAlarm> getDeviceAlarmPage(@RequestParam("json") String json) {

        JSONObject jsonObject = JSON.parseObject(json);
        DeviceAlarm deviceAlarm = jsonObject
            .getObject("customQueryParams", DeviceAlarm.class);
        Page<DeviceAlarm> page = jsonObject.getObject("page", Page.class);

        Assert.notNull(deviceAlarm, "customQueryParams 不能为空");
        Assert.notNull(page, "page 不能为空");
        return deviceAlarmService.getDeviceAlarm(page, deviceAlarm);

    }

    //  @OperateAction("新增基数方案")
    @PostMapping("/add")
    public boolean addDeviceAlarm(@RequestBody DeviceAlarm deviceAlarm) {
        return deviceAlarmService.addDeviceAlarm(deviceAlarm);
    }


    @GetMapping("selectDeviceAlarm")
    public List<DeviceAlarm> selectDeviceAlarm(@RequestParam("json") String json) {
        JSONObject jsonObject = JSON.parseObject(json);
        DeviceAlarm deviceAlarm = jsonObject
            .getObject("customQueryParams", DeviceAlarm.class);
        Assert.notNull(deviceAlarm, "customQueryParams 不能为空");
        return deviceAlarmService.selectDeviceAlarm(deviceAlarm);
    }

    @GetMapping("selectDeviceAlarmPage")
    public Page<DeviceAlarm> selectDeviceAlarmPage(@RequestParam("json") String json) {

        JSONObject jsonObject = JSON.parseObject(json);
        DeviceAlarm deviceAlarm = jsonObject
            .getObject("customQueryParams", DeviceAlarm.class);
        Page<DeviceAlarm> page = jsonObject.getObject("page", Page.class);

        Assert.notNull(deviceAlarm, "customQueryParams 不能为空");
        Assert.notNull(page, "page 不能为空");

        return deviceAlarmService.selectDeviceAlarm(page, deviceAlarm);
    }
}

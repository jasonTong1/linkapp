package com.easylinkin.linkapp.device.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easylinkin.linkapp.device.api.dao.DeviceAlarmMapper;
import com.easylinkin.linkapp.device.api.entity.DeviceAlarm;
import com.easylinkin.linkapp.device.api.service.DeviceAlarmService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author TongJie
 * @since 2020/4/7 20:25
 */
@Service
public class DeviceAlarmServiceImpl extends ServiceImpl<DeviceAlarmMapper, DeviceAlarm> implements DeviceAlarmService {

    @Override
    public boolean addDeviceAlarm(DeviceAlarm deviceAlarm) {
        baseMapper.insert(deviceAlarm);
        return true;
    }

    @Override
    public List<DeviceAlarm> selectDeviceAlarm(DeviceAlarm deviceAlarm) {
        return baseMapper.selectDeviceAlarm(deviceAlarm);
    }

    @Override
    public Page<DeviceAlarm> selectDeviceAlarm(Page<DeviceAlarm> page, DeviceAlarm deviceAlarm) {
        List<DeviceAlarm> records = baseMapper.selectDeviceAlarm(page, deviceAlarm);
        page.setRecords(records);
        return page;
    }

    @Override
    public List<DeviceAlarm> getDeviceAlarm() {
        QueryWrapper<DeviceAlarm> qw = new QueryWrapper();
        qw.like("name", "aa");
        qw.eq("type", 1);
        return baseMapper.selectList(qw);
    }

    @Override
    public IPage<DeviceAlarm> getDeviceAlarm(Page<DeviceAlarm> page, DeviceAlarm deviceAlarm) {
        QueryWrapper<DeviceAlarm> qw = new QueryWrapper();
        qw.like("name", "aa");
        qw.eq("type", 1);
        return baseMapper.selectPage(page, qw);
    }

}

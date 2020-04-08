package com.easylinkin.linkapp.device.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.easylinkin.linkapp.device.api.dao.DeviceAlarmMapper;
import com.easylinkin.linkapp.device.api.entity.DeviceAlarm;
import com.easylinkin.linkapp.device.api.service.DeviceAlarmService;
import java.util.Collection;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author TongJie
 * @since 2020/4/7 20:25
 */
@Service
public class DeviceAlarmServiceImpl extends ServiceImpl<DeviceAlarmMapper, DeviceAlarm>  implements DeviceAlarmService {

    @Override
    public boolean addDeviceAlarm(DeviceAlarm deviceAlarm) {
         baseMapper.insert(deviceAlarm);
         return true;
//        return saveOrUpdate(deviceAlarm);
    }

    @Override
    public List<DeviceAlarm> getDeviceAlarmPage() {
        return baseMapper.getDeviceAlarmPage();
    }

    @Override
    public List<DeviceAlarm> getDeviceAlarm() {
//        EntityWrapper ew = new EntityWrapper();
//        ew.like("name","aa");

        return list();
    }

}

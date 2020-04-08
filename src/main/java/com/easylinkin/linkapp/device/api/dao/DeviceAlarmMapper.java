package com.easylinkin.linkapp.device.api.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.easylinkin.linkapp.device.api.entity.DeviceAlarm;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * <p></p>
 *
 * @author TongJie
 * @since 2020/4/7 21:10
 */
@Repository
public interface DeviceAlarmMapper extends BaseMapper<DeviceAlarm> {

    List<DeviceAlarm> getDeviceAlarmPage();
}

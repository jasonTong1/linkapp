package com.easylinkin.linkapp.device.api.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.easylinkin.linkapp.device.api.entity.DeviceAlarm;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p></p>
 *
 * @author TongJie
 * @since 2020/4/7 21:10
 */
@Repository
public interface DeviceAlarmMapper extends BaseMapper<DeviceAlarm> {

    List<DeviceAlarm> selectDeviceAlarm(@Param("entity") DeviceAlarm deviceAlarm);

    List<DeviceAlarm> selectDeviceAlarm(Page<DeviceAlarm> page, @Param("entity") DeviceAlarm deviceAlarm);
}

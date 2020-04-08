package com.easylinkin.linkapp.device.api.util;

import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

/**
 * <p>基数重核的工具类</p>
 *
 * @author TongJie
 * @since 2020/3/19 11:36
 */
public class BaseNumberUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseNumberUtil.class);

    /**
     * 对 bigDecimal值进行校验，校验大小范围，校验小数位的位数
     *
     * @param paramValue 要校验的数值
     * @param maxValue 最大值
     * @param minValue 最小值
     * @param digit 小数位的位数最大值
     */
    public static void validBigDecimalParam(BigDecimal paramValue, BigDecimal maxValue, BigDecimal minValue, int digit) {

        Assert.notNull(paramValue, "参数值不能为空");
        if (paramValue.compareTo(minValue) < 0 || paramValue.compareTo(maxValue) > 0) {
            throw new RuntimeException(paramValue + " 不为" + minValue + "-" + maxValue + "的数，请重新输入");
        }
        String doubleValueStr = String.valueOf(paramValue.subtract(new BigDecimal(paramValue.toBigInteger())));
        doubleValueStr = doubleValueStr.substring(doubleValueStr.indexOf(".") + 1);
        if ("0".equals(doubleValueStr)) {
            return;
        }
        if (doubleValueStr.length() > digit) {
            throw new RuntimeException(paramValue + "小数部分位数不能大于" + digit + "，请重新输入");
        }
    }
}

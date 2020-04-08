package com.easylinkin.linkapp.device.api.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * <p>基数重核的工具类 将 BigDecimal 类型转换为 string 并去掉尾部.0000 不丢失精度</p>
 *
 * @author TongJie
 * @since 2020/3/19 11:36
 */
public class BigDecimalToStr extends JsonSerializer<BigDecimal> {

    /**
     * 对尾部去0，再转成字符串,字符串为平行形式而非科学计数法形式
     *
     * @param bigDecimal 要被转变的参数
     */
    @Override
    public void serialize(BigDecimal bigDecimal, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(bigDecimal.stripTrailingZeros().toPlainString());
    }

}

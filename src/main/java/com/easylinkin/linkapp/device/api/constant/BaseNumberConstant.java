package com.easylinkin.linkapp.device.api.constant;

import java.math.BigDecimal;

/**
 * <p>
 * 基数重合常量 1.展期 1 2 3 ;基数方案状态 101 未提交(已保存),201 已提交,301 审批不通过,302 审批通过,303 审批状态-其他，401 已公示，501 已公布，601 废弃
 * </p>
 *
 * @author TongJie
 * @since 2020/2/23 17:01
 */
public interface BaseNumberConstant {

    int EXHIBITIONPERIOD_TOTAL = 3;
    int REGION_TYPE_TOTAL = 5;
    /**
     * 表设计 Decimal (25,5)
     */
    BigDecimal DECIMAL_18X9_5X9 = new BigDecimal("999999999999999999.99999");
    BigDecimal DECIMAL_18X9 = new BigDecimal("999999999999999999");
    /**
     * 小数位最多5位 0.99999
     */
    int DIGIT_5 = 5;

    enum ExhibitionperiodEnum {

        /**
         * 1, 第1期
         */
        PHASE_1(1, "第1期"),
        /**
         * 2, 第2期
         */
        PHASE_2(2, "第2期"),
        /**
         * 3, 第3期
         */
        PHASE_3(3, "第3期");


        private final Integer type;
        private final String name;

        ExhibitionperiodEnum(Integer type, String name) {
            this.type = type;
            this.name = name;
        }

        public Integer getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        /**
         * 通过 type 获取类型枚举
         */
        public static ExhibitionperiodEnum valueOf(Integer type) {
            if (null == type) {
                return null;
            }
            switch (type) {
                case 1:
                    return PHASE_1;
                case 2:
                    return PHASE_2;
                case 3:
                    return PHASE_3;
                default:
                    return null;
            }
        }

    }


    /**
     * 基数方案状态 101 未提交(已保存),201 已提交,301 审批不通过,302 审批通过,303 审批状态-其他，401 已公示，501 已公布，601 废弃
     */
    enum SchemePlanStatusEnum {

        /**
         * 类型 101 未提交(已保存)
         */
        NOT_SUBMITTED(101, "未提交(已保存)"),

        /**
         * 类型 201 已提交
         */
        SUBMITTED(201, "已提交"),

        /**
         * 类型 301 审批不通过
         */
        AUDIT_FAILED(301, "审批不通过"),

        /**
         * 类型 301 审批通过
         */
        AUDIT_PASS(302, "审批通过"),

        /**
         * 类型 303 审批状态-其他
         */
        AUDIT_OTHER(303, "审批状态-其他"),

        /**
         * 类型 401 已公示
         */
        PUBLICITY(401, "已公示"),

        /**
         * 类型 501 已公布
         */
        PUBLISH(501, "已公布"),

        /**
         * 类型 601 废弃
         */
        ABANDON(601, "废弃");


        private final Integer type;
        private final String name;

        SchemePlanStatusEnum(Integer type, String name) {
            this.type = type;
            this.name = name;
        }

        public Integer getType() {
            return type;
        }

        public String getName() {
            return name;
        }


        /**
         * 通过 type 获取类型枚举
         */
        public static SchemePlanStatusEnum valueOf(Integer type) {
            if (null == type) {
                return null;
            }
            switch (type) {
                case 101:
                    return NOT_SUBMITTED;
                case 201:
                    return SUBMITTED;
                case 301:
                    return AUDIT_FAILED;
                case 302:
                    return AUDIT_PASS;
                case 303:
                    return AUDIT_OTHER;
                case 401:
                    return PUBLICITY;
                case 501:
                    return PUBLISH;
                case 601:
                    return ABANDON;
                default:
                    return null;
            }
        }
    }

    /**
     * 方案类型 ：101 自定义生成，201 编辑自定义的方案另存为，301 导入方案，401 编辑导入方案另存为
     */
    enum SchemePlanTypeEnum {

        /**
         * 类型 101 自定义生成)
         */
        CUSTOM_BUILD(101, "自定义生成"),

        /**
         * 类型 201 编辑自定义的方案另存为
         */
        EDIT_CUSTOM_BUILD_SAVE_AS(201, "编辑自定义的方案另存为"),
        /**
         * 类型 301 导入方案
         */
        IMPORT_SCHEME(301, "导入方案"),

        /**
         * 类型 401 编辑导入方案另存为
         */
        EDIT_IMPORT_SCHEME_SAVE_AS(401, "编辑导入方案另存为");


        private final Integer type;
        private final String name;

        SchemePlanTypeEnum(Integer type, String name) {
            this.type = type;
            this.name = name;
        }

        public Integer getType() {
            return type;
        }

        public String getName() {
            return name;
        }


        /**
         * 通过 type 获取类型枚举
         */
        public static SchemePlanTypeEnum valueOf(Integer type) {
            if (null == type) {
                return null;
            }
            switch (type) {
                case 101:
                    return CUSTOM_BUILD;
                case 201:
                    return EDIT_CUSTOM_BUILD_SAVE_AS;
                case 301:
                    return IMPORT_SCHEME;
                case 401:
                    return EDIT_IMPORT_SCHEME_SAVE_AS;
                default:
                    return null;
            }
        }
    }


    /**
     * 基数来源类型 ：101 基数重核得出，201 导入结果
     */
    enum BaseNumberOriginFlagEnum {

        /**
         * 类型 101 基数重核得出
         */
        RECHECK_RESULT(101, "基数重核得出"),

        /**
         * 类型 201 导入结果
         */
        IMPORT_RESULT(201, "导入结果");

        private final Integer type;
        private final String name;

        BaseNumberOriginFlagEnum(Integer type, String name) {
            this.type = type;
            this.name = name;
        }

        public Integer getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        /**
         * 通过 type 获取类型枚举
         */
        public static BaseNumberOriginFlagEnum valueOf(Integer type) {
            if (null == type) {
                return null;
            }
            switch (type) {
                case 101:
                    return RECHECK_RESULT;
                case 201:
                    return IMPORT_RESULT;
                default:
                    return null;
            }
        }
    }
}

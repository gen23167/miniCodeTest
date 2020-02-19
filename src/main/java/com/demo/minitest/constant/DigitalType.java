package com.demo.minitest.constant;

/**
 * 参数类型
 * @param null
 * @return
 * @author zgg
 * @date 2020-02-19
 */
public enum DigitalType {
    NumberType(0), ArrayType(1);

    private int value;

    DigitalType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

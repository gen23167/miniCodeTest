package com.demo.minitest;

import com.demo.minitest.constant.DigitalType;
import com.demo.minitest.service.DigitalMapService;
import com.demo.minitest.service.impl.DigitalMapServiceArrayImpl;
import com.demo.minitest.service.impl.DigitalMapServiceNumberImpl;

public class DigitalMapServiceFactory {

    /**
     * get service instance by digitalType
     * @param digitalType
     * @return com.demo.minitest.service.DigitalMapService
     * @author zgg
     * @date 2020-02-19
     */
    public static DigitalMapService getInstance(DigitalType digitalType) {
        if (digitalType.equals(DigitalType.NumberType)) {
            return new DigitalMapServiceNumberImpl();
        } else if (digitalType.equals(DigitalType.ArrayType)) {
            return new DigitalMapServiceArrayImpl();
        } else {
            return null;
        }
    }

}

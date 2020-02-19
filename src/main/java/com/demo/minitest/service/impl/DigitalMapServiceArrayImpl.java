package com.demo.minitest.service.impl;

import com.demo.minitest.constant.LetterMap;
import com.demo.minitest.service.DigitalMapService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitalMapServiceArrayImpl implements DigitalMapService {

    /**
     * get letter list
     * @param obj
     * @return java.util.List<java.lang.String>
     * @author zgg
     * @date 2020-02-19
     */
    public List<String> getMapLetter(Object obj) {
        List<Integer> list = Arrays.asList((Integer[])obj);
        return getLetterList(list, 0, null);
    }

    /**
     * get letter list by integer list
     * @param numList
	 * @param index
	 * @param list
     * @return java.util.List<java.lang.String>
     * @author zgg
     * @date 2020-02-19
     */
    private List<String> getLetterList(List<Integer> numList, int index, List<String> list) {
        // index over bound
        if (index >= numList.size()) {
            return list;
        }

        // get letter
        List<String> letterList = LetterMap.mp.get(numList.get(index));
        List<String> result = new ArrayList<>();

        // if list is not initiated, return current digit map letters;
        if (list == null || list.size() == 0) {
            result = letterList;
        } else {
            StringBuilder builder;
            if (letterList == null || letterList.size() == 0) {
                return list;
            }
            for (String s : list) {
                for (String newLetter : letterList) {
                    builder = new StringBuilder();
                    builder.append(s);
                    builder.append(newLetter);
                    result.add(builder.toString());
                }
            }
        }

        index = index + 1;
        result = getLetterList(numList, index, result);

        return result;
    }

}

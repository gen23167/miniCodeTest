package com.demo.minitest.service.impl;

import com.demo.minitest.constant.LetterMap;
import com.demo.minitest.service.DigitalMapService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitalMapServiceNumberImpl implements DigitalMapService {

    /**
     * get letter list
     * @param num
     * @return java.util.List<java.lang.String>
     * @author zgg
     * @date 2020-02-19
     */
    @Override
    public List<String> getMapLetter(Object num) {
        Integer param = (Integer)num;
        String[] textArr = String.valueOf(param).split("");
        Integer[] intArr = Arrays.stream(textArr).map(e -> new Integer(e)).toArray(Integer[]::new);


        return getLetterList(intArr, 0, null);
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
    private List<String> getLetterList(Integer[] numList, int index, List<String> list) {
        // index over bound
        if (index >= numList.length) {
            return list;
        }

        // get letter
        List<String> letterList = LetterMap.mp.get(numList[index]);
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

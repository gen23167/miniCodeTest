package com.demo.minitest.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterMap {

    // 数字映射字母表
    public static Map<Integer, List<String>> mp = new HashMap<>();

    // 初始化字母表
    static {
        if (mp == null) {
            mp = new HashMap<>();
        }

        mp.put(0, new ArrayList<>());
        mp.put(1, new ArrayList<>());

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        mp.put(2, list);

        list = new ArrayList<>();
        list.add("d");
        list.add("e");
        list.add("f");
        mp.put(3, list);

        list = new ArrayList<>();
        list.add("g");
        list.add("h");
        list.add("i");
        mp.put(4, list);

        list = new ArrayList<>();
        list.add("j");
        list.add("k");
        list.add("l");
        mp.put(5, list);

        list = new ArrayList<>();
        list.add("m");
        list.add("n");
        list.add("o");
        mp.put(6, list);

        list = new ArrayList<>();
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        mp.put(7, list);

        list = new ArrayList<>();
        list.add("t");
        list.add("u");
        list.add("v");
        mp.put(8, list);

        list = new ArrayList<>();
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");
        mp.put(9, list);
    }
}

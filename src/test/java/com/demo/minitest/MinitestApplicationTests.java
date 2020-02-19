package com.demo.minitest;

import com.demo.minitest.constant.DigitalType;
import com.demo.minitest.service.DigitalMapService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class MinitestApplicationTests {

    @Test
    public void test0() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(0);

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);

        for (String s : mapLetter) {
            System.out.println(s + ", ");
        }
    }

    @Test
    public void test1() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(1);

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);

        for (String s : mapLetter) {
            System.out.print(s + ", ");
        }
    }

    @Test
    public void test9() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(9);

        assertNotNull("结果不为空", mapLetter != null && mapLetter.size() > 0);

        for (String s : mapLetter) {
            System.out.print(s + ", ");
        }
        assertEquals("结果匹配", "[w, x, y, z]", mapLetter.toString());
    }

    @Test
    public void test0_1() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.ArrayType);
        List<String> mapLetter = digitalMapService.getMapLetter(new Integer[]{0, 1});

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);

        for (String s : mapLetter) {
            System.out.print(s + ", ");
        }
    }

    @Test
    public void test10_11() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.ArrayType);
        List<String> mapLetter = digitalMapService.getMapLetter(new Integer[]{10, 11});

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);
    }

    @Test
    public void test2_3() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.ArrayType);
        List<String> mapLetter = digitalMapService.getMapLetter(new Integer[]{2, 3});

        assertNotNull("结果不为空", mapLetter != null && mapLetter.size() > 0);

        if (mapLetter != null && mapLetter.size() > 0) {
            for (String s : mapLetter) {
                System.out.print(s + ", ");
            }
        }
        assertEquals("结果匹配", "[ad, ae, af, bd, be, bf, cd, ce, cf]", mapLetter.toString());
    }

    @Test
    public void test9_9() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.ArrayType);
        List<String> mapLetter = digitalMapService.getMapLetter(new Integer[]{9, 9});

        assertNotNull("结果不为空", mapLetter != null && mapLetter.size() > 0);

        if (mapLetter != null && mapLetter.size() > 0) {
            for (String s : mapLetter) {
                System.out.print(s + ", ");
            }
        }
        assertEquals("结果匹配", "[ww, wx, wy, wz, xw, xx, xy, xz, yw, yx, yy, yz, zw, zx, zy, zz]", mapLetter.toString());
    }

    @Test
    public void test10() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(10);

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);
    }

    @Test
    public void test11() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(11);

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);
    }

    @Test
    public void test23() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(23);

        assertNotNull("结果不为空", mapLetter != null && mapLetter.size() > 0);

        if (mapLetter != null && mapLetter.size() > 0) {
            for (String s : mapLetter) {
                System.out.print(s + ", ");
            }
        }
        assertEquals("结果匹配", "[ad, ae, af, bd, be, bf, cd, ce, cf]", mapLetter.toString());
    }

    @Test
    public void test99() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(99);

        assertNotNull("结果不为空", mapLetter != null && mapLetter.size() > 0);

        if (mapLetter != null && mapLetter.size() > 0) {
            for (String s : mapLetter) {
                System.out.print(s + ", ");
            }
        }
        assertEquals("结果匹配", "[ww, wx, wy, wz, xw, xx, xy, xz, yw, yx, yy, yz, zw, zx, zy, zz]", mapLetter.toString());
    }

}

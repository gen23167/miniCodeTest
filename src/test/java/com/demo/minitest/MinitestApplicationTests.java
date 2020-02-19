package com.demo.minitest;

import com.demo.minitest.constant.DigitalType;
import com.demo.minitest.service.DigitalMapService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class MinitestApplicationTests {
    /**
     * 测试{0}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test0() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(0);

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);

        for (String s : mapLetter) {
            System.out.println(s + ", ");
        }
    }

    /**
     * 测试{1}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test1() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(1);

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);

        for (String s : mapLetter) {
            System.out.print(s + ", ");
        }
    }

    /**
     * 测试{9}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
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

    /**
     * 测试{0,1}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test0_1() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.ArrayType);
        List<String> mapLetter = digitalMapService.getMapLetter(new Integer[]{0, 1});

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);

        for (String s : mapLetter) {
            System.out.print(s + ", ");
        }
    }

    /**
     * 测试{1,2}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test1_2() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.ArrayType);
        List<String> mapLetter = digitalMapService.getMapLetter(new Integer[]{1, 2});

        assertTrue("结果不为空", mapLetter != null && mapLetter.size() > 0);
    }

    /**
     * 测试{1,3}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test1_3() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.ArrayType);
        List<String> mapLetter = digitalMapService.getMapLetter(new Integer[]{1, 3});

        assertTrue("结果不为空", mapLetter != null && mapLetter.size() > 0);
    }

    /**
     * 测试{10,11}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test10_11() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.ArrayType);
        List<String> mapLetter = digitalMapService.getMapLetter(new Integer[]{10, 11});

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);
    }

    /**
     * 测试{2,3}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
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

    /**
     * 测试{9,0}
     * @param  
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test9_0() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.ArrayType);
        List<String> mapLetter = digitalMapService.getMapLetter(new Integer[]{9, 0});

        assertNotNull("结果不为空", mapLetter != null && mapLetter.size() > 0);

        if (mapLetter != null && mapLetter.size() > 0) {
            for (String s : mapLetter) {
                System.out.print(s + ", ");
            }
        }
        assertEquals("结果匹配", "[w, x, y, z]", mapLetter.toString());
    }

    /**
     * 测试{9,9}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
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

    /**
     * 测试{10}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test10() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(10);

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);
    }

    /**
     * 测试{11}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test11() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(11);

        assertTrue("结果为空", mapLetter == null || mapLetter.size() == 0);
    }

    /**
     * 测试{12}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test12() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(12);

        assertTrue("结果不为空", mapLetter != null && mapLetter.size() > 0);
    }

    /**
     * 测试{13}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test13() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(13);

        assertTrue("结果不为空", mapLetter != null && mapLetter.size() > 0);
    }

    /**
     * 测试{23}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
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

    /**
     * 测试{90}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
    @Test
    public void test90() {
        DigitalMapService digitalMapService = DigitalMapServiceFactory.getInstance(DigitalType.NumberType);
        List<String> mapLetter = digitalMapService.getMapLetter(90);

        assertNotNull("结果不为空", mapLetter != null && mapLetter.size() > 0);

        if (mapLetter != null && mapLetter.size() > 0) {
            for (String s : mapLetter) {
                System.out.print(s + ", ");
            }
        }
        assertEquals("结果匹配", "[w, x, y, z]", mapLetter.toString());
    }

    /**
     * 测试{99}
     * @param
     * @return void
     * @author BenZhang
     * @date 2020-02-19
     */
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

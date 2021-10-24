import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest2 extends TestCase {
    @Test
    public void test1() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 2, 500, 0));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 2, 500, 0.01f));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 2, 500, 0.25f));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 2, 500, 0.49f));
    }

    @Test
    public void test5() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 2, 500, 0.5f));
    }

    @Test
    public void test6() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 30, 2, 0, 0.25f));
    }

    @Test
    public void test7() {
        Assert.assertEquals("Lo!", Calculate.Calculate_L(1, 30, 2, 1, 0.25f));
    }

    @Test
    public void test8() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 2, 999, 0.25f));
    }

    @Test
    public void test9() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 2, 1000, 0.25f));
    }

    @Test
    public void test10() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 1, 500, 0.25f));
    }

    @Test
    public void test11() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 25, 2, 500, 0.25f));
    }

    @Test
    public void test12() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 25.01f, 2, 500, 0.25f));
    }

    @Test
    public void test13() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 34.99f, 2, 500, 0.25f));
    }

    @Test
    public void test14() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 35, 2, 500, 0.25f));
    }

    @Test
    public void test15() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(2, 30, 2, 500, 0.25f));
    }

    // Cac test case cho kiem thu theo bang quyet dinh
    @Test
    public void test1_1() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, -1, 1, 500, 0));
    }

    @Test
    public void test1_2() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 0, 1, 500, 0));
    }

    @Test
    public void test1_3() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 30, 1, -1, 0));
    }

    @Test
    public void test1_4() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 30, 1, 500, -1));
    }

    @Test
    public void test1_5() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 1, 500, 0.25f));
    }

    @Test
    public void test1_6() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 30, 1, 500, 1));
    }

    @Test
    public void test1_7() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 30, 1, 1100, 0));
    }

    @Test
    public void test1_8() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 30, 2, -1, 0));
    }

    @Test
    public void test1_9() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 30, 2, 500, -1));
    }

    @Test
    public void test1_10() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(1, 30, 2, 500, 0.25f));
    }

    @Test
    public void test1_11() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 30, 2, 500, 1));
    }

    @Test
    public void test1_12() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 30, 2, 1100, 0));
    }

    @Test
    public void test1_13() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(1, 36, 1, 500, 0));
    }

    @Test
    public void test1_14() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, -1, 1, 500, 0));
    }

    @Test
    public void test1_15() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 0, 1, 500, 0));
    }

    @Test
    public void test1_16() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 30, 1, -1, 0));
    }

    @Test
    public void test1_17() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 30, 1, 500, -1));
    }

    @Test
    public void test1_18() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(2, 30, 1, 500, 0.25f));
    }

    @Test
    public void test1_19() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 30, 1, 500, 1));
    }

    @Test
    public void test1_20() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 30, 1, 1100, 0));
    }

    @Test
    public void test1_21() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 30, 2, -1, 0));
    }

    @Test
    public void test1_22() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 30, 2, 500, -1));
    }

    @Test
    public void test1_23() {
        Assert.assertEquals("Dat muc tieu!", Calculate.Calculate_L(2, 30, 2, 500, 0.25f));
    }

    @Test
    public void test1_24() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 30, 2, 500, 1));
    }

    @Test
    public void test1_25() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 30, 2, 1100, 0));
    }

    @Test
    public void test1_26() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(2, 36, 1, 500, 0));
    }

    @Test
    public void test1_27() {
        Assert.assertEquals("Input khong hop le!", Calculate.Calculate_L(3, 30, 1, 500, 0));
    }




    public void testCalculate_L() {

    }
}
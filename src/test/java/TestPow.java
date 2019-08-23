import dz_lesson_5.Pow;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPow {
    @Before
    public void init(){
        System.out.println("init");
    }

    @Test
    public void Test1(){
        double actual = Pow.pow_recursive(2,3);
        double expected = 8.0;
        double delta = 0.00001;
        Assert.assertEquals("совсем не то что мы ожидали",expected,actual,delta);
    }

    @Test
    public void Test2(){
        double actual = Pow.pow_recursive(2,0);
        double expected = 1;
        double delta = 1;
        Assert.assertEquals("совсем не то что мы ожидали",expected,actual,delta);
    }

    @Test
    public void Test3(){
        double actual = Pow.pow_recursive(2,-3);
        double expected = 0.125;
        double delta = 0.0001;
        Assert.assertEquals("совсем не то что мы ожидали",expected,actual,delta);
    }


    @After
    public void end(){
        System.out.println("the end");
    }
}

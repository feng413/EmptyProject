import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;



import org.mockito.Mockito;

import java.util.Iterator;

/**
 * Created by haofen on 2017/6/17.
 */
public class UnitTest {
    @Test
    public void testfun(){
        MyMain testclass = new MyMain();
        testclass.fun1();
    }

    @Test
    public void testfun2(){
        MyMain testclass = new MyMain();
        testclass.fun2();
    }

    @Test
    public void testMock(){
        Iterator iter = Mockito.mock(Iterator.class);
        Mockito.when(iter.uf).thenReturn("hello ").thenReturn("world");
        String result = iter.next() + " " + iter.next();
        Assert.assertEquals("hello world",result);
    }
}

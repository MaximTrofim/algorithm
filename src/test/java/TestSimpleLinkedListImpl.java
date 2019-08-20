import dz_lesson_4.linkedList.LinkedList;
import dz_lesson_4.linkedList.SimpleLinkedListImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSimpleLinkedListImpl {
    LinkedList<Integer> linkedList;
    @Before
    public void init(){
        System.out.println("init");
        linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(20);
        linkedList.insertFirst(6);
        linkedList.insertFirst(205);
        linkedList.insertFirst(647);
    }

    @Test
    public void Test1(){
        int actual = linkedList.getFirstValue();
        int expected = 647;
        Assert.assertEquals("совсем не то что мы ожидали",expected,actual);
    }

    @Test
    public void Test2(){
        int actual = linkedList.removeFirst();
        int expected = 647;
        Assert.assertEquals("совсем не то что мы ожидали",expected,actual);
    }

    @Test
    public void Test3(){
        int actual = linkedList.size();
        int expected = 4;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Test4(){
        boolean actual = linkedList.contains(205);
        boolean expected = true;
        Assert.assertEquals(expected,actual);
    }


    @After
    public void end(){
        System.out.println("the end");
    }
}

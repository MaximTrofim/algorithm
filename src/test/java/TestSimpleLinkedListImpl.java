import dz_lesson_4.linkedList.LinkedList;
import dz_lesson_4.linkedList.SimpleLinkedListImpl;
import org.junit.Assert;
import org.junit.Test;

public class TestSimpleLinkedListImpl {
    @Test
    public void Test1(){
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(5);
        linkedList.insertFirst(5);

        Assert.assertEquals(true,linkedList.remove(5));
    }
}

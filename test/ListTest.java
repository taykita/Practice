import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    public ListTest() {
        testLList.add("Java");
        testLList.add("C++");
        testLList.add("Python");
    }

    private List<String> testLList = new LinkedList<>();

    @Test
    public void sizeTest() {
        int size = testLList.size();

        assertEquals(3, size);
    }

    @Test
    public void isEmptyTest() {
        boolean isEmpty = testLList.isEmpty();

        assertFalse(isEmpty);
    }

    @Test
    public void containsKeyTest() {
        boolean contain = testLList.contains("Java");
        assertTrue(contain);

        contain = testLList.contains("Oberon-2");
        assertFalse(contain);
    }

    @Test
    public void toArrayTest() {
        Object[] listStrings = testLList.toArray();
        Object[] strings = {"Java", "C++", "Python"};

        assertArrayEquals(strings, listStrings);
    }

    @Test
    public void addTest() {
        List<String> testLList1 = testLList;
        testLList1.add("Oberon-2");
        Object[] listStrings = testLList.toArray();
        Object[] strings = {"Java", "C++", "Python", "Oberon-2"};

        assertArrayEquals(strings, listStrings);
    }

    @Test
    public void removeTest() {
        List<String> tmpLList1 = testLList;
        tmpLList1.remove("C++");
        Object[] listStrings = testLList.toArray();
        Object[] strings = {"Java", "Python"};

        assertArrayEquals(strings, listStrings);
    }

    @Test
    public void containsAllTest() {
        List<String> tmpLList = new LinkedList<>(Arrays.asList("Java", "C++", "Python"));
        boolean contains = testLList.containsAll(tmpLList);

        assertTrue(contains);
    }

    @Test
    public void equalsTest() {
        List<String> tmpLList = new LinkedList<>(Arrays.asList("Java", "C++", "Python"));
        boolean equals = testLList.equals(tmpLList);

        assertTrue(equals);
    }

    @Test
    public void addAllTest() {
        List<String> tmpLList = new LinkedList<>();
        tmpLList.addAll(testLList);

        assertEquals(testLList, tmpLList);
    }

    @Test
    public void removeAllTest() {
        List<String> tmpLList = testLList;
        tmpLList.removeAll(testLList);
        boolean isEmpty = tmpLList.isEmpty();

        assertTrue(isEmpty);
    }

    @Test
    public void retainAllTest() {
        List<String> tmpLList = new LinkedList<>(Arrays.asList("Java", "C++", "Python", "Oberon-2"));
        tmpLList.retainAll(testLList);

        assertEquals(testLList, tmpLList);
    }

    @Test
    public void getTest() {
        String get = testLList.get(0);

        assertEquals("Java", get);
    }

    @Test
    public void setTest() {
        List<String> tmpLList = testLList;
        String set = tmpLList.set(0, "C#");
        String get = tmpLList.get(0);

        assertEquals("C#", get);
        assertEquals("Java", set);
    }

    @Test
    public void indexOfTest() {
        List<String> tmpLList = testLList;
        tmpLList.add("Java");
        int ind = tmpLList.indexOf("Java");

        assertEquals(0, ind);
    }

    @Test
    public void lastIndexOfTest() {
        List<String> tmpLList = testLList;
        tmpLList.add("Java");
        int ind = tmpLList.lastIndexOf("Java");

        assertEquals(3, ind);
    }

    @Test
    public void subListTest() {
        List<String> tmpLList = testLList.subList(0, 2);
        List<String> equalArr = new LinkedList<>(Arrays.asList("Java", "C++"));

        assertEquals(tmpLList, equalArr);
    }

}

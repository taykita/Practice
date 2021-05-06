import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    public MapTest() {
        //Как инициализировать это через конструктор мапы?
        testMap.put("Java", 8);
        testMap.put("C++", 17);
        testMap.put("Python", 3);
    }

    private Map<String, Integer> testMap = new HashMap<>();

    @Test
    public void sizeTest() {
        int size = testMap.size();

        assertEquals(3, size);
    }

    @Test
    public void isEmptyTest() {
        boolean isEmpty = testMap.isEmpty();

        assertFalse(isEmpty);
    }

    @Test
    public void clearTest() {
        Map<String, Integer> tmpMap = testMap;
        tmpMap.clear();
        boolean isEmpty = tmpMap.isEmpty();

        assertTrue(isEmpty);
    }

    @Test
    public void containsKeyTest() {
        boolean contain = testMap.containsKey("Java");
        assertTrue(contain);

        contain = testMap.containsKey("Oberon-2");
        assertFalse(contain);
    }

    @Test
    public void containsValue() {
        boolean contain = testMap.containsValue(8);
        assertTrue(contain);

        contain = testMap.containsValue(2);
        assertFalse(contain);
    }

    @Test
    public void getTest() {
        int get = testMap.get("Java");

        assertEquals(8, get);
    }

    @Test
    public void putTest() {
        // Как это более точно проверить?
        Integer put = testMap.put("Oberon-2", 2);

        assertNull(put);
        testMap.remove("Oberon-2");
    }

    @Test
    public void removeTest() {
        testMap.put("Oberon-2", 2);
        boolean remove = testMap.remove("Oberon-2", 2);
        assertTrue(remove);

        remove = testMap.remove("Oberon-2", 2);
        assertFalse(remove);
    }

    @Test
    public void keySetTest() {
        //Как оно работает?!?!?
        Set<String> keySet = testMap.keySet();
        Set<String> set = new HashSet<>(Arrays.asList("Java", "C++", "Python"));

        assertEquals(set, keySet);
    }

    // Как это протестировать?
/*
    @Test
    public void valuesTest() {
        Collection<Integer> valuesSet = testMap.values();
        Collection<Integer> set = new ArrayList<>(Arrays.asList(8, 17, 3));

        assertEquals(set, valuesSet);
    }
*/

    @Test
    public void isEqualTest() {
        Map<String, Integer> testMap1 = testMap;
        boolean isEqual = testMap.equals(testMap1);

        assertTrue(isEqual);
    }

    @Test
    public void putAllTest() {
        Map<String, Integer> testMap1 = new HashMap<>();
        testMap1.putAll(testMap);
        boolean isEqual = testMap.equals(testMap1);

        assertTrue(isEqual);
    }

    // ?????
    @Test
    public void entrySetTest() {
        Set<Map.Entry<String, Integer>> entrySet = testMap.entrySet();
        int sizeEntrySet = entrySet.size();

        assertEquals(3, sizeEntrySet);
    }

}

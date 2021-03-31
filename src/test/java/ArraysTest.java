import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    private Arrays arrays;

    @BeforeEach
    public void init() {
        arrays = new Arrays();
    }

    @Test
    public void testArrHomeWork() {
        Assertions.assertArrayEquals(new int[]{1, 7}, arrays.arrHomeWork(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void testArrHomeWork1() {
        Assertions.assertArrayEquals(new int[]{1, 7}, arrays.arrHomeWork(new int[]{1, 2, 4, 4, 2, 3, 3, 1, 7}));
    }

    @Test
    public void testArrHomeWork2() {
        Assertions.assertArrayEquals(new int[]{1, 7}, arrays.arrHomeWork(new int[]{1, 2, 3, 3, 2, 3, 3, 1, 7}));
    }

    @Test
    public void testArrHomeWorkTwo() {
        Assertions.assertTrue(arrays.arrHomeWorkTwo(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    public void testArrHomeWorkTwo2() {
        Assertions.assertTrue(arrays.arrHomeWorkTwo(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testArrHomeWorkTwo3() {
        Assertions.assertTrue(arrays.arrHomeWorkTwo(new int[]{4, 4, 4, 4}));
    }

    @Test
    public void testArrHomeWorkTwo4() {
        Assertions.assertTrue(arrays.arrHomeWorkTwo(new int[]{1, 4, 4, 1, 1, 4, 3}));
    }
}

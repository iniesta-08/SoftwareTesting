import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HeapsortTest {
    @Test
    public void HeapSortTest() {

        int arr[] =  new int[]{134, 3, 54, 5, 7};
        Heapsort.sort(arr);
        assertArrayEquals(arr, new int[]{3, 5, 7, 54, 134});

        arr =  new int[]{13, 544, 23, -4, -1};
        Heapsort.sort(arr);
        assertArrayEquals(arr, new int[]{-4, -1, 13, 23, 544});

        arr =  new int[]{13, 12, 13, 0, 0};
        Heapsort.sort(arr);
        assertArrayEquals(arr, new int[]{0, 0, 12, 13, 13});
    }

    @Test
    public void HeapifyTest() {

        int arr[] =  new int[]{3, 134, 54, 5, 7};
        Heapsort.Heapify(arr, 0, arr.length);
        assertEquals(134, arr[0]);

        arr =  new int[]{-100, 0, 0, 0, 100};
        Heapsort.Heapify(arr, 0, arr.length);
        assertEquals(0, arr[0]);
    }
}

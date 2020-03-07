import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTest {
    @Test
    //main tester
    public void sortOfSortTest(){
        int[] A = {4, 14, 2, 6, 0, 18, 12, 10};
        int[] results = {12, 10, 2, 0, 4, 6, 14, 18};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(results, A);
    }
    @Test
    //tester tries for duplicates numbers
    public void sortOfSortTest2(){
        int[] A = {9, 7, 3, 3, 7, 9, 6, 6};
        int[] results = {7, 7, 3, 3, 6, 6, 9, 9};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(results, A);
    }

    @Test
    //tester tries for one single number
    public void sortOfSortTest3(){
        int[] A = {0};
        int[] results = {0};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(results, A);
    }

    @Test
    //tester tries for negatives numbers
    public void sortOfSortTest4(){
        int[] A = {-6, -12, 6, 4, 0, -2, 8, 16};
        int[] results = {6, 4, -6, -12, -2, 0, 8, 16};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(results, A);
    }

    @Test
    //tester tries to see if (duplicates, negatives) applies.
    public void sortOfSortTest5(){
        int[] A = {14, 14, -2, -14, -16, 0, 8, 6, 6, -12, 10};
        int[] results = {10, 8, 0, -2, -16, -14, -12, 6, 6, 14, 14};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(results, A);
    }
}
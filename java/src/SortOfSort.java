public class SortOfSort {
    // A = array
    public static int[] sortOfSort(int[] A) {
        int temp;
        int skip = 0; //skips through the index/placement of the array
        int first = 0;
        int last = A.length - 1;
        int n;

        //this "for loop" iterates the array
        for (int i = 0; i < A.length-1; i++){
            temp = i;
            int max = A[first];
            for (int j = first; j <= last; j++) {
                if (A[j] >= max) {
                    max = A[j];
                    temp = j;
                }
            }
            //This "if statement" places a numbers into given location.
            if (skip < 2) {
                n = A[temp];
                A[temp] = A[last];
                A[last] = n;
                skip++;
                last--;
            }
            //this "else if" statement skips from one side of the array to the other.
            else if (skip == 4) {
                skip = 0;
            }
            else {//This "if statement" is like the first "if statement" it sets the number into a given location.
                n = A[temp];
                A[temp] = A[first];
                A[first] = n;
                first = first + 1;
                skip++;
            }
        }
        //prints array
        print(A);
        return A;
    }
    //prints array
    public static void print(int A[]) {
        for(int i = 0; i < A.length; ++i)
            System.out.print(A[i] + " ");
    }
    public static void main(String[] args) {
        int[] A = {2, 7, 1, 3, 0, 9, 6, 5};
        sortOfSort(A);
    }
}

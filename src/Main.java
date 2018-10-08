public class Main {

    public static void main(String[] args) {
        int[][] arr1 = {
                {11, 22, 33},
                {41, 51, 61},
                {72, 82, 92}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };
        int[][] arr3 = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };

        ArrayComparator comparator = new ArrayComparator();
        System.out.println("arr1 == arr2 " + comparator.compare(arr1, arr2));
        System.out.println("arr2 == arr3 " + comparator.compare(arr2, arr3));
    }
}
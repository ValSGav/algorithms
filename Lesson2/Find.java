package Lesson2;

public class Find {

    public static void main(String[] args) {
        int[] array = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        int numb = 10;
        System.out.println(find(array, numb));
        System.out.println(binaryFindInSortedArray(array, numb));
    }

    public static int find(int[] arrray, int value) {
        for (int i = 0; i < arrray.length; i++) {
            if (arrray[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binaryFindInSortedArray(int[] array, int value) {
        return binaryFindInSortedArray(array, value, 0, array.length-1);
    };

    public static int binaryFindInSortedArray(int[] array, int value, int min, int max) {

        int midpoint;
        if (max < min)
            return -1;
        else
            midpoint = (max - min) / 2 + min;

        if(array[midpoint] < value) 
            return binaryFindInSortedArray(array, value, midpoint + 1, max);
        else{
            if(array[midpoint] > value)
                return binaryFindInSortedArray(array, value, min, midpoint - 1 );
            else{
                return midpoint;
            }
        }
    }


}

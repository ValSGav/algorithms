package Lesson2;

/**
 * Sort
 */
public class Sort {

    public static void bubbleSort(int[] arrray) {
        boolean isFinish;

        do {
            isFinish = true;
            for (int i = 0; i < arrray.length - 1; i++) {
                if (arrray[i] > arrray[i + 1]) {
                    int temp = arrray[i];
                    arrray[i] = arrray[i + 1];
                    arrray[i + 1] = temp;
                    isFinish = false;
                }
            }
        } while (!isFinish);
    }

    public static void directSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    minPos = j;
                }
            }
            if (i != minPos) {
                int temp = array[i];
                array[i] = array[minPos];
                array[minPos] = temp;
            }
        }

    }

    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public static void quiqSort(int[] array, int startPosition, int endPosition){
        int pivot = (startPosition + endPosition)/2;
        int rightPosition = endPosition;
        int leftPosition = startPosition;
        do{
            

        } while (leftPosition <= rightPosition);
    }



}
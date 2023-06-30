package Lesson2;

public class Find {

    public static void main(String[] args) {
        int[] array = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        System.out.println(find(array, 5));
    }

    public static int find(int[] arrray, int value){
        for (int i = 0; i < arrray.length; i++) {
            if(arrray[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int binaryFind(int[] array, int value) {
        
        

        return -1;        
    }
    
}

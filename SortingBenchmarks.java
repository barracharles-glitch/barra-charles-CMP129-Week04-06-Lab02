import java.util.*;
public class SortingBenchmarks {
    static public void main(String[]args){
        int[] test_array = new int[20];
        Random int_rand = new Random();

        for (int i=0; i<test_array.length; i++){
            test_array[i] = int_rand.nextInt(0,9);
        }

        System.out.print("Original Array: ");
        for (int i=0; i<test_array.length; i++){
            System.out.print(test_array[i]);
        }
        System.out.println();
        
        bubbleSort(test_array);
        selectionSort(test_array);
    }

    public static void bubbleSort(int[] a){
        int tmp_num = 0, ex_num = 0;
        boolean sorting = true, swap_this_run;
        while (sorting){
            swap_this_run = false;
            for (int i=0; i<a.length-1; i++){
                if (a[i] > a[i+1]){
                    tmp_num = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp_num;
                    ex_num++;
                    swap_this_run = true;
                }
            }
            if (swap_this_run == false)
                sorting = false;
        }
        System.out.println("Bubble Sorted Number of exchanges: "+ ex_num);
        System.out.print("Bubble Sorted Array: ");
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int[] a){
        int tmp_num = 0, ex_num = 0;
        boolean sorting = true;
        while (sorting){
            for (int i=0; i<a.length; i++){
            }
        }
    }
}

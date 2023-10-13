import java.util.ArrayList;

import java.util.List;

public class DisappearedArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        //disappearedArray(arr);
        // System.out.println(Arrays.toString(disappearedArray(arr)));

        List<Integer> missIntegers = disappearedArray(arr);
        System.out.println(missIntegers);
    }

    static List<Integer> disappearedArray(int[] arr){
        int i = 0;
        while(i<arr.length){
            int currentIndex = arr[i]-1;
            if (arr[i] != arr[currentIndex]) {
                swap(arr,i,currentIndex);
            } else {
                i++;
            }
        }
        List<Integer> missingnumbers = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                missingnumbers.add(j+1);
            }
        }
        return missingnumbers;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

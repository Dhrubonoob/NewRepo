import java.util.Arrays;

public class FirstandLastPos {
    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 7;

        System.out.println(Arrays.toString(searchInRange(arr, target)));
        
    }

    static int[] searchInRange(int[] arr, int target){
        int[] ans = {-1, -1};

        int start = search(arr, target, true);
        int end = search(arr, target, false);

        return new int[]{start, end};
    }

    static int search(int[] arr, int target, boolean findstartindex){
        int s = 0;
        int e = arr.length - 1;

        int ans = -1;

        while (s<=e) {
            int mid = s + (e-s)/2;

            if(target > arr[mid]){
                s = mid + 1;
            }else if(target < arr[mid]){
                e = mid - 1;
            }else{
                ans = mid;

                if(findstartindex){
                    e = mid-1;
                }else{
                    s= mid+1;
                }

            }
        }
        return ans;
    }
}

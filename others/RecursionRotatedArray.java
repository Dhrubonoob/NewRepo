public class RecursionRotatedArray {
    public static void main(String args[]){
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(search(arr, 0, 0, arr.length-1));

    }

    static int search(int[] arr, int key, int s, int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if(arr[mid] == key){
            return mid;
        }

        if(arr[s] < arr[mid]){
            if(key >= arr[s] && key <= arr[mid]){
                return search(arr, key, s, mid-1);
            }
            return search(arr, key, mid+1, e);
        }

        if(key >= arr[mid] && key <= arr[e]){
            return search(arr, key, mid+1, e);
        }
        return search(arr, key, s, mid-1);
    }
}

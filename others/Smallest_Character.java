public class Smallest_Character {
    public static void main(String[] args) {
        
        char[] arr = {'c','f','g'};
        char target = 'd';

        char ans = nextGreatestLetter(arr, target);
        // nextGreatestLetter(arr, target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] arr, char target){
        int s = 0;
        int e = arr.length-1 ;

        while(s<=e){
            int mid = s + (e-s)/2;

            

            if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid -1;
            }
        }
        return arr[s];
    }
}

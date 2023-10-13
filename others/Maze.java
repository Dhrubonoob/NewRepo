public class Maze {
    public static void main(String[] args) {
       int result = count(3, 3);
       System.out.println(result); 
       path("", 3, 3);
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return (left + right);
    }

    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        //for the diagonal movement....
        if(r>1 && c>1){
            path(p+'d', r-1, c-1);
        }

        if(r>1){
            path(p+'D', r-1, c);
        }

        if(c>1){
            path(p+'R', r, c-1);
        }
    }
}

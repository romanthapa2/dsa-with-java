public class recursion {
    public static  void hanoiTower(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Move disk " + n  + " from "+ src + " to " + dest);
            return;
        }
        hanoiTower(n-1, src, dest, helper);
        System.out.println("moved disk "+ n + " from " + src + " to " + dest);
        hanoiTower(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        hanoiTower(n, "s", "h", "d");
    }
}

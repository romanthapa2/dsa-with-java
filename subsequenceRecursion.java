public class subsequenceRecursion {
    public static void subsequence(String s1, String s2,int index){
        if (index == s1.length()){
            System.out.println(s2);
            return;

        
        }
        subsequence(s1, s2 + s1.charAt(index),index + 1 );
        subsequence(s1, s2, index + 1);
    }
    public static void main(String[] args){
        String s = "roman";
        subsequence(s,"",0);
    }
}

public class permutation {
    public static void permute(String s1, String s2){

        // base case
        if (s1.isEmpty()){
            System.out.println(s2);
            return;
        }

        // remove element from index i so that we dont get the repeat the same word which is already been in the first postion
        for (int i=0; i< s1.length(); i++){
            String rem= s1.substring(0, i) + s1.substring(i+1);
            permute(rem, s2 + s1.charAt(i));
                }
    }
    public static void main(String[] args){
        String str="abcd";
        permute(str,"");
    }
}

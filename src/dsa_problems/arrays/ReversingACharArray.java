package dsa_problems.arrays;

public class ReversingACharArray {
    public static void main(String[] args){
        char[] s = {'s','w','a','g','a','t'};
        reverse(s);
    }

    public static void reverse(char[] s){
        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.print("{");
        for(int i = 0; i< s.length; i++){
            System.out.print("\""+s[i]+"\",");
        }
        System.out.print("}");
    }
}

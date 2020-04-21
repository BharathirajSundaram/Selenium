public class ReverseString {

    public static void main(String[] args) {
        String s= "Selenium";
        int len=s.length();
        String s1= "";
        for(int i=len-1;i>=0;i--){
             s1=s1+s.charAt(i);


        }
        System.out.println(s1);
    }
}

public class RemoveJunk {
    public static void main(String[] args) {
        String str = "!@^&%#%J$&A%@V#$A&(***&)(*)*)j23a32432v23423a2343";
       String str1= str.replaceAll("[$0-9]","");
        System.out.println(str1);

    }


}

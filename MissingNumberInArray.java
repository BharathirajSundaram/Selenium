

public class MissingNumberInArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,9};

        int sum =0;
        for(int i=0; i< a.length;i++){
            sum= sum +a[i];
        }
        System.out.println(sum);

        int sum1=0;
        for (int j=0;j<=9;j++){
            sum1=sum1+j;


        }

        System.out.println(sum1-sum);




    }



}

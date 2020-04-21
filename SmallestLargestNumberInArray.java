public class SmallestLargestNumberInArray {

    public static void main(String[] args) {

        int a[]={8,9,76,97, 64,-2,3,4,-5,6,89};
        int small=a[0];
        int large=a[0];
        for (int i=1;i<a.length;i++) {
             if(a[i]<small){

                 small=a[i];


             }
             else if (a[i]>large){
                 large=a[i];

             }
        }
        System.out.println(large);
        System.out.println(small);

    }
}

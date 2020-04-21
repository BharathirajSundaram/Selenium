import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInArray {

    public static void main(String[] args) {

        String name[]={"java","C#","PHP","java","PHP"};

        for(int i=0;i<name.length;i++) {
            for(int j=i+1;j<name.length;j++){
            if(name[i].equals(name[j])){
               // System.out.println(name[i]);
            }

        }}


        Set<String> map= new HashSet<String>();
        for(String s:name){
if(map.add(s)==false) {
    System.out.println(s);
}
        }



    }
}

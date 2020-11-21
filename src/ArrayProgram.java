import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.abbreviate;

public class ArrayProgram {

    public int[] init_array(int n){
        int[] array;
        if(n==0){
            array=new int[1];
            array[0]= 1;
        }
        else {
            array=new int[n];
            for (int i=0;i<n;i++){
                array[i]= (int)Math.pow(n,i);
            }
        }
        return array;
    }

    public String init_string(String string){
        string=StringUtils.upperCase(string);
        return string;
    }

    public String arrayToString(int[] array){
        StringBuilder stringBuilder=new StringBuilder();
        int len=array.length;//获取数组长度
        int i=0;
        while(i<len){
            stringBuilder.append(array[i]);
            i++;
        }
        return stringBuilder.toString();
    }

    String abbrevPrint(String str){
        int len=str.length();
        String string;
        if(len>=10)
            string=abbreviate(str,"...",5);
        else
            string=str;
        return string;
    }

    String stringTail(String str){
        return StringUtils.appendIfMissingIgnoreCase(str,"cby");
    }

    int arrayToInt(int[] array){
        int len=array.length;
        int num=0;
        for(int i=0;i<len;i++){
            num*=10;
            num+=array[i];
        }
        return num;
    }

    public boolean is_same(int[] array1,int [] array2) {
        int len = ArrayUtils.getLength(array1);
        int i=0;
        while(i<len) {
            if(array1[i]==array2[i])
                i++;
            else
                break;
        }
        if(i==len||i==ArrayUtils.getLength(array2))
            return true;
        else
            return false;
    }

    /*
    public boolean is_same(int[] array1,int[] array2){
        System.out.println("not the same");
        return false;
    }*/

    public int[] addAll(int[] array1,int[] array2) {
        boolean flag = is_same(array1,array2);
        if(flag) return array1;
        else {
            return ArrayUtils.addAll(array1, array2);
        }
    }

}

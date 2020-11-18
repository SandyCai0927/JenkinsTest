import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.abbreviate;

public class ArrayProgram {

    /*
     * 给整型数组初始化，若n=0，则建立一个长度为1的数组，对于数组的值，则分别赋值为n的i次方
     */
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

    /*
     * 给字符串初始化，将所有小写字母转为大写
     */
    public String init_string(String string){
        string=StringUtils.upperCase(string);
        return string;
    }

    /*
     * 将整型数组转为字符串
     */
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

    /*
     * 将长度超过10的字符串进行缩略输出，输出长度为5
     */
    String abbrevPrint(String str){
        int len=str.length();
        String string;
        if(len>=10)
            string=abbreviate(str,"...",5);
        else
            string=str;
        return string;
    }

    /*
     * 如果字符串不是以cby结尾，则在字符串末尾添加cby
     */
    String stringTail(String str){
        return StringUtils.appendIfMissingIgnoreCase(str,"cby");
    }

    /*
     * 将数组转为整数
     */
    int arrayToInt(int[] array){
        int len=array.length;
        int num=0;
        for(int i=0;i<len;i++){
            num*=10;
            num+=array[i];
        }
        return num;
    }

    /*
     * 判断两个数组是否相等
     */
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

    /*
     * 将两个数组合并
     */
    public int[] addAll(int[] array1,int[] array2) {
        boolean flag = is_same(array1,array2);
        if(flag) return array1;
        else {
            return ArrayUtils.addAll(array1, array2);
        }
    }

}

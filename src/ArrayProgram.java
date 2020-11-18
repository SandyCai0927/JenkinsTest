import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.RandomUtils.nextInt;
import static org.apache.commons.lang3.StringUtils.abbreviate;

public class ArrayProgram {

    /*
     * 给整型数组初始化，若n=0，则建立一个长度为1的数组，对于数组的值，则调用RandomUtils的nextInt方法进行随机赋值
     */
    public int[] init_array(int n){
        int[] array;
        if(n==0){
            array=new int[1];
            array[0]= nextInt()%100;
        }
        else {
            array=new int[n];
            for (int i=0;i<n;i++){
                array[i]= nextInt()%100;
            }
        }
        return array;
    }

    /*
     * 给字符串初始化，若length不为0，则调用RandomUtils的randomAlphanumeric方法进行随机赋值
     */
    public String init_string(int length){
        String str;
        if(length==0)
            str="";
        else{
            str=org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(length);
        }
        return str;
    }

    /*
     * 将整型数组转为字符串
     */
    public String intToString(int[] array){
        StringBuilder stringBuilder=new StringBuilder();
        int len=array.length;//获取数组长度
        int i=len-1;
        while(i>=0){
            stringBuilder.append(array[i]);
            i--;
        }
        return stringBuilder.toString();
    }

    /*
     * 将长度超过10的字符串进行缩略输出，输出长度为5
     */
    void abbrevPrint(String str){
        int len=str.length();
        if(len>=10)
            System.out.println(abbreviate(str,"...",5));
        else
            System.out.println(str);
    }

    /*
     * 如果字符串不是以cby结尾，则在字符串末尾添加cby
     */
    String stringTail(String str){
        return StringUtils.appendIfMissingIgnoreCase(str,"cby");
    }
}

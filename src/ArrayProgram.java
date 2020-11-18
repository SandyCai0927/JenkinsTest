public class ArrayProgram {

    /*
     * 给整型数组初始化，若n=0，则建立一个长度为1的数组，对于数组的值，则调用RandomUtils的nextInt方法进行随机赋值
     */
    public int[] init_array(int n){
        int[] array;
        if(n==0){
            array=new int[1];
            array[0]= org.apache.commons.lang3.RandomUtils.nextInt()%100;
        }
        else {
            array=new int[n];
            for (int i=0;i<n;i++){
                array[i]= org.apache.commons.lang3.RandomUtils.nextInt()%100;
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
     * 将整型字符
     */
}

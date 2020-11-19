import org.testng.annotations.Test;

import static junit.framework.TestCase.assertEquals;

public class ArrayProgramTest {

    ArrayProgram program=new ArrayProgram();

    @Test
    public void init_array() {
        int[] arr1=program.init_array(3);
        int[] arr2={1,3,9};
        assertEquals(arr1,arr2);
    }

    @Test
    public void init_string() {
        String str1="soiHIFS";
        String str2="SOIHIFS";
        assertEquals(program.init_string(str1),str2);
    }

    @Test
    public void arrayToString() {
        int[] arr=program.init_array(4);
        String str="141664";
        assertEquals(str,program.arrayToString(arr));
    }

    @Test
    public void abbrevPrint() {
        String str="abbreviate";
        String str1="ab...";
        assertEquals(str1,program.abbrevPrint(str));
    }

    @Test
    public void stringTail() {
        String str1="osdhg";
        String str2="osdhgcby";
        assertEquals(str2,program.stringTail(str1));
    }

    @Test
    public void arrayToInt(){
        int[] array={2,56,36};
        int num=796;
        assertEquals(num,program.arrayToInt(array));
    }

    @Test
    public void test_is_same(){
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        int[] arr3={2,4,5};
        assertEquals(true,program.is_same(arr1,arr2));
        assertEquals(false,program.is_same(arr1,arr3));
    }

    @Test
    public void test_toString(){
        int[] array=program.init_array(5);
        String str=program.arrayToString(array);
        boolean flag=true;
        assertEquals(5,array.length);
        if(!str.equals("1525125625"))
            flag=false;
        assertEquals(true,flag);
    }

    @Test
    public void test_addAll(){
        int[] arr1={1,2,3};
        int[] arr2={3,5};
        int[] arr3={1,2,3,3,5};
        int[] arr4=program.addAll(arr1,arr2);
        assertEquals(arr3.length,arr4.length);
        int i=0;
        for(;i<arr3.length;i++)
            assertEquals(arr3[i],arr4[i]);
    }
}
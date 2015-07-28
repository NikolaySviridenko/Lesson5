package com.company;

public class Main {

    public static void main(String[] args) {
        int [] notstrings = {1,1,1,1,1,1,1,1,1,1,1,1,1,55,5555,1111,1};
        int target = 1;
        int x = m(notstrings, target);
        System.out.println(x);
        int s = square(9);
        System.out.println(s);
        int tasktwo = 9;
        String tasktwodef = "Hi Everyone";
        String tasktwoRes = tasktwo(tasktwodef, tasktwo);

        int [] task3_1 = {1,1,1,1,1,1,1,1,1};
        int [] task3_2 = {1,1,1,1,1,1,1,1,1};
        boolean result4 = taskThree (task3_1, task3_2);
        System.out.println(result4);
        // write your code here
        int [] task4_1 = {1,1,1,1,1,1,1,1,1,1,1,1,1};
        int [] task4_2 = {1,1,1,1,1,1,1,1,1,1,1,1};
        boolean result4_1 = taskFour (task4_1, task4_2);
        System.out.println(result4_1);
    }
    public static int m (int [] ns, int t)
    {
        int result = 0;
        for (int i = 0; i<11; i++)
        {
            if(ns[i] == t)
            {
                result++;
            }
        }
        return result;
    }
    public static int square (int i)
    {
        return i*i;
    }
    public static String tasktwo (String s, int p)
    {
        for (int i = 0; i<=p; i++)
        {
            System.out.println(s);
        }
            return s;
    }
    public static boolean taskThree (int [] arr1, int [] arr2)
    {
        boolean result4 = true;
        for(int i = 0; i< arr1.length; i++)
        {
            if(arr1[i] == arr2[i]) result4 = true;
            else result4 =false;
        }
        return result4;
    }
    public static boolean taskFour (int [] arr1,int  [] arr2)
    {
        int x= arr1.length;
        int y = arr2.length;
        boolean result4 = true;
        for(int i = 0; i< arr1.length; i++)
        {
            if(((x==y))&&(arr1[i] == arr2[i])) result4 = true;
            else result4 =false;
        }
        return result4;



    }
}

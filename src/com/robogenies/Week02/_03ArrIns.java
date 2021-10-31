package com.robogenies.Week02;

public class _03ArrIns {

    public static void main(String[] args) {
        int arr[]=new int[100];

        //arr[0]=200;
        //arr[1]=201;


        for(int i=0;i<100;i++)
        {
            arr[i]=i+200;
        }

        for(int i=0;i<100;i++)
        {
            System.out.println(arr[i]);
        }

    }
}

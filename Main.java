package com.company;

public class Main {

    public static void main(String[] args) {
       int result=0;
        int m [] = {15,25,5,16,24,35};
       for (int i = 0; i<m.length;i++)
           result+=m[i];
        System.out.println(result);
        System.out.println(result/6);
        int index=0;
        for (int i = 0; i <m.length ; i++) {
            if(m[i]==5)
             index=i;

        }
        System.out.println(index);
        System.out.println(m[index]);

        int min=m[0];
        for (int i = 0; i <m.length; i++) {
            if(min>m[i])
                min=m[i];

        }
        System.out.println(min);
        int max=m[0];
        for (int i = 0; i < m.length; i++) {
            if (max<m[i])
                max=m[i];
        }
        System.out.println(max);
    }
}

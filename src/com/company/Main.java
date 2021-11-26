package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "Ik ben aan het programmeren in java.\nHallo ik ben Seebe";
        String[] split = str.split("\n");
        String str1 = split[0];
        String str2 = split[1];
        String[] split1= str1.split(" ");
        String[] split2= str2.split(" ");
        for(int i = 0; i<200;i++){
            if (i < 0 || i >= split1.length) {
                System.out.println("   "+split2[i]);
            }
            else if (i < 0 || i >= split2.length) {
                System.out.println(split1[i]);
            }
            else
                System.out.println(split1[i]+" "+split2[i]);
        }
    }
}
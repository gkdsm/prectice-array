package com.ohgiraffers.practice;

public class Application1 {

    public static void main(String[] args) {

        // 변수 1, 3, 7, 5, 9를 선언한 값을 출력하고 5와 7의 두 값을 변경한 사항을 출력하시오.

        int num1= 1;
        int num2= 3;
        int num3= 7;
        int num4= 5;
        int num5= 9;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);

        System.out.println();


        int temp;
        temp = num4;
        num4 = num3;
        num3 = temp;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);




    }
}

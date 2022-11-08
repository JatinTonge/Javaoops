package CorejavaExamples;

import java.util.Scanner;

class Avg
{
    static double a,b,c,d,e;
    static double f;
    void avgValue(double a1,double a2,double a3,double a4,double a5)
    {
        a=a1;
        b=a2;
        c=a3;
        d=a4;
        e=a5;

        f=(a+b+c+d+e)/5;

        System.out.println("Average value = "+f);

    }

    static void sqrValue()

    {
        System.out.println("Square of aerage value = "+(f*f));
    }
}

class AvgValue
{
    public static void main(String[] amit)
    {
        Scanner sc=new Scanner(System.in);
        Avg o1=new Avg();

        System.out.println("Enter 5 numbers : ");
        double a1=sc.nextInt();
        double a2=sc.nextInt();
        double a3=sc.nextInt();
        double a4=sc.nextInt();
        double a5=sc.nextInt();

        o1.avgValue(a1,a2,a3,a4,a5);
         Avg.sqrValue();
    }
}
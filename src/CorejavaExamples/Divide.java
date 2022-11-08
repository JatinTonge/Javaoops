package CorejavaExamples;

import java.util.*;

class Divide
{
    public static void main(String[] amit)

    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number : - ");
        int a=sc.nextInt();

        if(a%3==0)
        {
            if(a%5==0)
            {
                System.out.println("Number is divisible by 3 & 5");
            }else
                System.out.println("Number is divisible by only 3");
        }else if(a%5==0)
            System.out.println("Number is divisible by only 5");
        else
            System.out.println("Number is not divisible by 3 & 5");

    }
}
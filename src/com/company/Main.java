package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double pi = Math.PI;
        double x = 3*pi/2;
        double summ = 0;

        int tochnost = 5000;

        for (int n = 0; n <= tochnost; n++)
        {
            summ += pow (-1, n) * pow (x, 2*n+1) / fct (2*n+1);
        }
        System.out.println(summ);
        System.out.println(Math.sin(x));
    }

    public  static double pow (double a, int n)
    {
        double st = 1;
        for (int i = 1; i<=n; i++)
        {
             st *= a;
        }
        return st;
    }

    public static double fct (double a)
    {
        double ft = 1;
        for (int i = 1; i <=a; i++)
        {
            ft *= i;
        }
        return ft;
    }
}

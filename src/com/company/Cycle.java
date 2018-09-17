package com.company;

public class Cycle
{
    static byte b=2;
    static void cycle(int n)
    {
        int Calculation=1;
        for (int i = 0; i < n; i++)
        {
            Calculation*= b;
        }
        System.out.println(Calculation);
    }
}
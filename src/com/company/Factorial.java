package com.company;

public class Factorial
{
    static void factorial(int n)
    {
        int Calculation=1;
        for (int i = 1; i <= n; i++)
        {
            Calculation*= i;
        }
        if (n < 10)
        {
            System.out.println(Calculation);
        }
        else
            System.out.println("Вывод факториала невозможен, ввиду ограничения переменной");
    }
}

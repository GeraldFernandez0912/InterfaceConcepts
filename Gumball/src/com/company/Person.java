package com.company;

public class Person
{
    private int coins;

    public Person(int coins)
    {
        this.coins = coins;
    }
    public void insertCoin(Coinable coinable, int i)
    {
        System.out.println("Coin Inserted");
        coins=coins-3;
        if (!coinable.insertCoin())
        {
            coins++;
            System.out.println("Coin Refunded");
        }
        System.out.println("Coin count : " + coins);
    }
}
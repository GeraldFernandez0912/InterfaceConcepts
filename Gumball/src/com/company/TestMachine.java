package com.company;

public class TestMachine
{
    public static void main (String[] args)
    {
        GumballMachine gumballmachine = new GumballMachine();
        Person person = new Person(35);

        System.out.println("One Gumball is worth 3 pesos");

        person.insertCoin(gumballmachine,3);
        person.insertCoin(gumballmachine, 4);
        person.insertCoin(gumballmachine, 5);
        person.insertCoin(gumballmachine, 3);
        person.insertCoin(gumballmachine, 5);
        person.insertCoin(gumballmachine, 4);
        person.insertCoin(gumballmachine, 3);
    }
}
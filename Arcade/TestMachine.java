package com.company;

public class TestMachine
{
    public static void main (String[] args)
    {
        ArcadeMachine arcademachine = new ArcadeMachine();
        Person person = new Person(100);

        System.out.println("Each Game is worth 5 pesos");

        person.insertCoin(arcademachine,5);
        person.insertCoin(arcademachine, 10);
        person.insertCoin(arcademachine, 5);
        person.insertCoin(arcademachine, 15);
        person.insertCoin(arcademachine, 5);
        person.insertCoin(arcademachine, 5);
        person.insertCoin(arcademachine, 10);
    }
}
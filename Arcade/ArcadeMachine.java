package com.company;

public class ArcadeMachine implements Coinable, Dispensable
{
    double arcgame = 0;

    public ArcadeMachine()
    {
        this.arcgame = Double.POSITIVE_INFINITY;
    }
    @Override
    public boolean insertCoin ()
    {
        if (this.arcgame>0)
        {
            this.dispense();
            return true;
        }
        System.out.println("Return Coin");
        return false;
    }
    @Override
    public void dispense()
    {
        this.arcgame--;
        System.out.println("Game Start");
    }
    @Override
    public void reload(int count)
    {
        this.arcgame += count;
    }
}


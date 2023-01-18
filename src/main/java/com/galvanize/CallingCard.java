package com.galvanize;

public class CallingCard
{
    int rate;
    int balance;

    public CallingCard(int rate)
    {
        this.rate = rate;
    }

    public void addDollars(int funds)
    {
         balance += (funds * 100) / rate;
    }
    public int getRemainingMinutes()
    {
        return balance;
    }
    public void useMinutes(int minutes)
    {
        balance -= minutes;

        if (balance < 0)
        {
            balance = 0;
        }
    }
}

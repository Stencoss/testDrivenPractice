package com.galvanize;

public class CellPhone
{
    boolean active = false;
    CallingCard card;
    String history;
    int duration;

    public CellPhone(CallingCard card)
    {
        this.card = card;
    }

    public int getRate()
    {
        return card.rate;
    }

    public void call(String number)
    {
        history = number;
        active = true;
    }

    public boolean isTalking()
    {
       return active;
    }
    public void tick()
    {
        card.balance--;
        duration++;
    }
    public void endCall()
    {
        active = false;

        history += " (" + duration + " minute)";
    }
    public String getHistory()
    {
        return history;
    }
}

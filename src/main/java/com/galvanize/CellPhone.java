package com.galvanize;

public class CellPhone
{
    boolean active = false;
    CallingCard card;

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
        active = true;
    }

    public boolean isTalking()
    {
       return active;
    }
    public void tick()
    {
        card.balance--;
    }
    public void endCall()
    {
        active = false;
    }

}

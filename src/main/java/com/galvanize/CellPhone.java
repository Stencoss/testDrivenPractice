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
        if (history == null)
        {
            history = number;
        }
        else
        {
            history += ", " + number;
        }

        duration = 0;
        active = true;

    }

    public boolean isTalking()
    {
       return active;
    }
    public void tick()
    {
        if(card.balance <= 0)
        {
            endCall();
        }
        else
        {
            card.balance--;
            duration++;
        }
    }

    public void endCall()
    {
        active = false;
        if(duration > 1)
        {
            history += " (" + duration + " minutes)";
        }
        else
        {
            history += " (" + duration + " minute)";
        }
    }
    public String getHistory()
    {
        return history;
    }
}

package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CallingCardTest
{

    @Test

    public void CallingCardAcceptsACostPerMinute()
    {
        //Setup
        CallingCard card = new CallingCard(10);
        CallingCard card2 = new CallingCard(15);
        //Enact
        int current = card.rate;
        int current2 = card2.rate;
        //Assert
        assertEquals(10,current);
        assertEquals(15, current2);
    }
    @Test
    public void addDollarsToCallingCard()
    {
        //Setup
        CallingCard card = new CallingCard(10);
        //Enact
        card.addDollars(1);
        int check = card.balance;
        card.addDollars(1);
        int check2 = card.balance;
        //Assert
        assertEquals(10,check);
        assertEquals(20,check2);

    }
    @Test
    public void checkHowManyMinutesAreLeft()
    {
        //Setup
        CallingCard card = new CallingCard(10);
        CallingCard card2 = new CallingCard(20);
        //Enact
        int actual= card.getRemainingMinutes();
        card2.addDollars(1);
        int check = card2.getRemainingMinutes();
        //Assert
        assertEquals(0, actual );
        assertEquals(5, check);
    }
    @Test
    public void verifyThatMinutesAreDecreasedOnCard()
    {
        //Setup
        CallingCard card = new CallingCard(20);
        //Enact
        card.addDollars(1);
        card.useMinutes(3);
        int current = card.getRemainingMinutes();
        //Assert
        assertEquals(2,current);
        card.useMinutes(5);
        current = card.getRemainingMinutes();
        assertEquals(0,current);
    }
    @Test
    public void verifyThatAddingDollarsIgnoresFractionsOfMinutes()
    {
        //Setup
        CallingCard card = new CallingCard(17);
        //Enact
        card.addDollars(3);
        int test = card.getRemainingMinutes();
        //Assert
        assertEquals(17,test);
    }


}

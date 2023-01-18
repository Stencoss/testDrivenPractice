package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellPhoneTest
{
    @Test
    public void verifyCellPhoneCanTakeACallingCard()
    {
        //Setup
        CallingCard card = new CallingCard(20);
        CellPhone phone = new CellPhone(card);

        CallingCard card2 = new CallingCard(10);
        CellPhone phone2 = new CellPhone(card2);
        //Enact
        int test = phone.getRate();
        int test2 = phone2.getRate();
        //Assert
        assertEquals(20, test);
        assertEquals(10, test2);

    }
    @Test
    public void verifyCellPhoneCanStartACall()
    {
        //Setup
        CallingCard card = new CallingCard(20);
        CellPhone phone = new CellPhone(card);

        CallingCard card2 = new CallingCard(10);
        CellPhone phone2 = new CellPhone(card2);
        //Enact
        phone.call("555-5555");
        phone2.call("552-2121");


        //Assert
        assertTrue(phone.active);
        assertTrue(phone2.active);

    }
    @Test
    public void verifyCanCheckThereIsAnActiveCall()
    {
        //Setup
        CallingCard card = new CallingCard(20);
        CellPhone phone = new CellPhone(card);

        CallingCard card2 = new CallingCard(10);
        CellPhone phone2 = new CellPhone(card2);

        //Enact
        phone.call("555-5555");

        //Assert
        assertTrue(phone.isTalking());
        assertFalse(phone2.isTalking());
    }
    @Test
    public void verifyMinutesCanTickFromACellPhone()
    {
        //Setup
        CallingCard card = new CallingCard(20);
        card.addDollars(1);
        CellPhone phone = new CellPhone(card);

        //Enact
        phone.tick();
        int test = card.getRemainingMinutes();
        phone.tick();
        int toast = card.getRemainingMinutes();
        //Assert
        assertEquals(4,test);
        assertEquals(3,toast);
    }
    @Test
    public void verifyCellPhoneCanEndACall()
    {
        //Setup
        CallingCard card = new CallingCard(20);
        CellPhone phone = new CellPhone(card);
        phone.call("555-5555");

        //Enact
        phone.endCall();
        boolean test = phone.isTalking();
        //Assert
        assertFalse(test);
    }

}
//Setup
//Enact
//Assert

package com.service;

import android.telephony.SmsManager;

import java.io.Serializable;

/**
 * Created by Joao Nogueira on 09/09/2015.
 */
public class MessageEvent extends Event implements Serializable {

    private String destinationNumber;
    private String textMessage;

    public MessageEvent(String nr, String text) {
        super(EventType.MESSAGE);

        destinationNumber = nr;
        textMessage = text;
    }

   public void sendMessage() {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(destinationNumber, null, textMessage, null, null);
   }

    public String getDestinationNumber()
    {
        return destinationNumber;
    }

    public String getTextMessage()
    {
        return textMessage;
    }

}

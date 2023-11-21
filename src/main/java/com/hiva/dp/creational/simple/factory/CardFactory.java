package com.hiva.dp.creational.simple.factory;

public class CardFactory {

    // Method to get a card instance based on card type
    public Card getCard(String cardType) {
        if (cardType.equalsIgnoreCase("credit")) {
            return new CreditCard();
        } else if (cardType.equalsIgnoreCase("debit")) {
            return new DebitCard();
        } else if (cardType.equalsIgnoreCase("prepaid")) {
            return new PrepaidCard();
        }
        return null;
    }

}

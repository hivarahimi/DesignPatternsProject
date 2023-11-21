package com.hiva.dp.creational.simple.factory;

public class MainOfSimpleFactoryPattern {

    // Main class demonstrating the usage of the CardFactory
    public static void main(String[] args) {
        CardFactory cardFactory = new CardFactory();

        // Creating different types of cards using the factory
        Card creditCard = cardFactory.getCard("credit");
        Card debitCard = cardFactory.getCard("debit");
        Card prepaidCard = cardFactory.getCard("prepaid");

        // Displaying the card types
        System.out.println("Type of Credit Card: " + creditCard.getCardType());
        System.out.println("Type of Debit Card: " + debitCard.getCardType());
        System.out.println("Type of Prepaid Card: " + prepaidCard.getCardType());
    }
}

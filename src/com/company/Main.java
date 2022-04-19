package com.company;

public class Main {

    public static void main(String[] args) {

        CreditCard card = new CreditCard();

        card.cardNumber = "123234345";
        card.owner = "Ilon Mask";
        card.type = "VISA";

        switch (card.type) {
            case "VISA":
            case "MASTERCARD":
                System.out.println("Dr. " + card.owner + " congratulations, your card is approved");
                break;
            case "MIR":
                System.out.println(card.owner + "go fu#k with your russian warship!!");
                break;
            default:
                System.out.println("Unknown type of card: " + card.type + "Glory to Ukraine");

        }
    }
}

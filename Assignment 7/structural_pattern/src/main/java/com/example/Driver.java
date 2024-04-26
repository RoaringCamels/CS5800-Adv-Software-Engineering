package com.example;

public class Driver {
    public static void main(String[] args) {
        CharacterPropertiesFactory propertiesFactory = new CharacterPropertiesFactory();
        Document document = new Document();

        document.addCharacter('H', propertiesFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('e', propertiesFactory.getCharacterProperties("Arial", "Blue", 8));
        document.addCharacter('l', propertiesFactory.getCharacterProperties("Calibri", "Black", 5));
        document.addCharacter('l', propertiesFactory.getCharacterProperties("Calibri", "Green", 34));
        document.addCharacter('o', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('W', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('o', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('r', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('l', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('d', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('C', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('S', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('5', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('8', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('0', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        document.addCharacter('0', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));

        document.display();
        System.out.println("-------------------------------");

        document.saveToFile("myDocument.txt");

        document.addCharacter('!', propertiesFactory.getCharacterProperties("Verdana", "Black", 12));
        System.out.println("Edited Document:");
        document.saveToFile("myDocument.txt");
        document.display();
        System.out.println("-------------------------------");

        document = new Document();
        document.loadFromFile("myDocument.txt");

        document.display();
    }
}
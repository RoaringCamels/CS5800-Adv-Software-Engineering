package com.example;
import java.io.Serializable;

public class Character implements Serializable{
    private char value;
    private CharacterProperties properties;

    public Character(char newVlaue, CharacterProperties newProperties){
        this.value = newVlaue;
        this.properties = newProperties;
    }

    public void display(){
        System.out.println("Character: " + value + 
        "\nFont: " + properties.getFont() + 
        "\nColor: " + properties.getColor() +
        "\nSize: " + properties.getSize());
    }

    public char getValue() {return value;}
    public CharacterProperties getProperties() {return properties;}
}

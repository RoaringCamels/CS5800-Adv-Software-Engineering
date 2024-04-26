package com.example;
import java.io.Serializable;

public class CharacterProperties implements Serializable{
    private String font;
    private String color;
    private int size;

    public CharacterProperties(String newFont, String newColor, int newSize){
        this.font = newFont;
        this.color = newColor;
        this.size = newSize;
    }
    
    public String getFont(){return this.font;}
    public String getColor() {return color;}
    public int getSize() {return size;}

    public void setFont(String newFont){this.font = newFont;}
    public void setColor(String newColor){this.color = newColor;}
    public void setSize(int newSize){this.size = newSize;}
}

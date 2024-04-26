package com.example;
import java.io.*;
import java.util.*;

class Document {
    private final List<Character> characters = new ArrayList<>();

    public void addCharacter(char value, CharacterProperties properties) {
        characters.add(new Character(value, properties));
    }

    public void display() {
        System.out.println("----- Displaying characters and properties -----");
        for (Character character : characters) {
            character.display();
        }
        System.out.println("----- END -----");
    }

    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Character character : characters) {
                writer.println(character.getValue() + "," +
                        character.getProperties().getFont() + "," +
                        character.getProperties().getColor() + "," +
                        character.getProperties().getSize());
            }
            System.out.println("Document saved to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(String filename) {
        characters.clear(); // Clear existing characters before loading
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    char value = parts[0].charAt(0);
                    String font = parts[1];
                    String color = parts[2];
                    int size = Integer.parseInt(parts[3]);
                    CharacterProperties properties = new CharacterProperties(font, color, size);
                    characters.add(new Character(value, properties));
                }
            }
            System.out.println("Document loaded from file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
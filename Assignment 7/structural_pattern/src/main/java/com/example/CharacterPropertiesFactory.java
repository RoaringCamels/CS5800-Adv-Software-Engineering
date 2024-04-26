package com.example;

import java.util.*;

public class CharacterPropertiesFactory {
    private Map<String, CharacterProperties> charPropertiesMap = new HashMap<>();

    public CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + color + size;
        if (!charPropertiesMap.containsKey(key)) {
            charPropertiesMap.put(key, new CharacterProperties(font, color, size));
        }
        return charPropertiesMap.get(key);
    }
}

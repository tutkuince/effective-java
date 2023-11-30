package io.tince._01creatinganddestroyingobjects.item05;

import java.util.ArrayList;
import java.util.List;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public static boolean isValid(String word) {
        return false;
    }
    public static List<String> suggestions(String typo) {
        return new ArrayList<>();
    }
}

package io.tince._01creatinganddestroyingobjects.item05;

import java.util.ArrayList;
import java.util.List;

public class SingletonSpellChecker {
    private static final Lexicon dictionary = new Lexicon("Turkish");
    public static final SingletonSpellChecker INSTANCE = new SingletonSpellChecker();
    private SingletonSpellChecker() {}


    public static boolean isValid(String word) {
        return false;
    }
    public static List<String> suggestions(String typo) {
        return new ArrayList<>();
    }
}

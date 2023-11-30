package io.tince._01creatinganddestroyingobjects.item05;

import java.util.ArrayList;
import java.util.List;

// Inappropriate use of static utility - inflexible & untestable!
public class StaticUtilitySpellChecker {
    private static final Lexicon dictionaryTurkish = new Lexicon("Turkish");

    private StaticUtilitySpellChecker() { // Noninstantiable
    }

    public static boolean isValid(String word) {
        return false;
    }
    public static List<String> suggestions(String typo) {
        return new ArrayList<>();
    }
}

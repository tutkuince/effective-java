package io.tince._01creatinganddestroyingobjects.item05;

public class Lexicon {
    private String language;

    public Lexicon(String language) {
        this.language = language;
    }
    @Override
    public String toString() {
        return "Lexicon{" +
                "language='" + language + '\'' +
                '}';
    }
}

package com.domain.stream.beautifier;

public class PoemMain {

    public static void main(String[] args) {

        System.out.println("beautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("test text", PoemBeautifier::decorate);
        poemBeautifier.beautify("test text", PoemBeautifier::decorate1);
        poemBeautifier.beautify("test text", PoemBeautifier::decorate2);
        poemBeautifier.beautify("test text", PoemBeautifier::decorate3);
    }
}
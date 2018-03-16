package com.domain.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }

    public static String decorate(String text) {
        return String.valueOf(text.toCharArray());
    }

    public static String decorate1(String text) {
        return String.valueOf(text.toUpperCase());
    }

    public static String decorate2(String text) {
        return String.valueOf(text + " decor2");
    }

    public static String decorate3(String text) {
        return String.valueOf(text.substring(2));
    }
}

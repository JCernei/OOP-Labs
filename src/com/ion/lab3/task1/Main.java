package com.ion.lab3.task1;

public class Main {
    public static void main(String[] args) {
        String text = "Object-oriented programming (OOP) is a programming paradigm based on the concept of " +
                "\"objects\", which can contain data and code: data in the form of fields (often known as attributes " +
                "or properties), and code, in the form of procedures (often known as methods).\n" +
                "\n" +
                "A feature of objects is that an object's own procedures can access and often modify the data fields " +
                "of itself (objects have a notion of this or self). In OOP, computer programs are designed by making " +
                "them out of objects that interact with one another.[1][2] OOP languages are diverse, but the most " +
                "popular ones are class-based, meaning that objects are instances of classes, which also determine " +
                "their types.\n" +
                "\n" +
                "Many of the most widely used programming languages (such as C++, Java, Python, etc.) are " +
                "multi-paradigm and they support object-oriented programming to a greater or lesser degree, typically" +
                " in combination with imperative, procedural programming. Significant object-oriented languages " +
                "include: Java, C++, C#, Python, R, PHP, Visual Basic.NET, JavaScript, Ruby, Perl, SIMSCRIPT, Object " +
                "Pascal, Objective-C, Dart, Swift, Scala, Kotlin, Common Lisp, MATLAB, and Smalltalk.";

        System.out.println(TextManipulator.getNrOfSentences(text));
        System.out.println(TextManipulator.getNrOfWords(text));
        System.out.println(TextManipulator.getNrOfVowels(text));
        System.out.println(TextManipulator.getNrOfConsonants(text));
        System.out.println(TextManipulator.getMostOftenWords(text, 5));
        System.out.println(TextManipulator.getLongestWord(text));
    }
}

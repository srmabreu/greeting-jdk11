package com.features;

public class LocalVariableSyntax {

    public static void main(String[] args) {
        // OK
        // (var s1, var s2) -> s1 + s2;
        // No skipping allowed
        // (var s1, s2) -> s1 + s2;
        // No mixing allowed
        // (var s1, String y) -> s1 + y
        // Need paranthesis if you use var in lambda
        // var s1 -> s1
    }

}

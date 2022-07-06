package com.epam.spring.homework2.beans;

public class FieldsValidator {
    public static boolean validate(String name, int value) {
        return name != null && value > 0;
    }
}

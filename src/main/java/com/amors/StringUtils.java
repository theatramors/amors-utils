package com.amors;

/**
 * @author theatramors
 */
public class StringUtils {

    public static boolean isEmpty(String value) {
        return value == null;
    }

    public static boolean isBlank(String value) {
        return value == null || value.equals("");
    }
}

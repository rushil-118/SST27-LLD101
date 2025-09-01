package com.example.orders;

import java.util.List;
import java.util.Objects;

public final class Validation {
    private Validation() {}

    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static void requireNonBlank(String val, String name) {
        if (isBlank(val)) throw new IllegalArgumentException(name + " must not be blank");
    }

    public static void requireEmail(String email) {
        Objects.requireNonNull(email, "email");
        if (!email.contains("@")) throw new IllegalArgumentException("invalid email");
    }

    public static void requireNumberInRange(int val, int min, int max, String fieldName) {
        if (val < min || val > max) {
            throw new IllegalArgumentException(
                String.format("%s should be within [%d, %d]", fieldName, min, max)
            );
        }
    }

    public static void requireOrderLine(List<OrderLine> orderLines) {
        if (orderLines == null || orderLines.isEmpty()) {
            throw new IllegalArgumentException("An order must contain at least one item");
        }
    }

}

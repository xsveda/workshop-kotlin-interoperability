package com.cleverlance.workshop;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Java {

    static void voidFunction() {
    }

    static @Nullable Integer intFunction(int a, @NotNull Integer b) {
        return 0;
    }

    public static void main(String[] args) {
        Kotlin.unitFunction();

        Kotlin.intFunction(0, 0).longValue();
    }
}

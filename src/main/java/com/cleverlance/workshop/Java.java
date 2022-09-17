package com.cleverlance.workshop;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Java {

    static void voidFunction() {
    }

    static @Nullable Integer intFunction(int a, @NotNull Integer b) {
        return 0;
    }

    static @NotNull List<String> listFunction() {
        return new ArrayList<>();
    }

    String field = "";

    String getProperty() {
        return "";
    }

    void setProperty(String value) {
    }

    public static void main(String[] args) {
        Kotlin.unitFunction();

        Kotlin.intFunction(0, 0).longValue();

        Kotlin.listFunction().add("");
        Kotlin.mutableListFunction().add("");

        Kotlin.getReadOnlyProperty();
        Kotlin.getMutableProperty();
        Kotlin.setMutableProperty(null);
    }
}

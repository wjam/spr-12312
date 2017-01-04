package com.example;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Foo {

    @NotNull
    @Size(min = 1)
    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(final String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "item='" + item + '\'' +
                '}';
    }
}

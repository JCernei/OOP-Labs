package com.ion.lab5.task2;

public class E extends D {
    protected String e;

    public E(String s, X x) {
        super(s, x);
        this.e = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + e;
    }
}

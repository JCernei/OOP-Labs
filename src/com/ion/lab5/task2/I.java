package com.ion.lab5.task2;

public class I extends H {
    protected String i;

    public I(String s, X x) {
        super(s, x);
        this.i = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + i;
    }
}

package com.ion.lab5.task3;

public class F extends E {
    protected String f;

    public F(String s, X x) {
        super(s, x);
        this.f = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + f;
    }
}

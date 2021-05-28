package com.example.tools;

public class Wrench implements Tools {
    @Override
    public String getTool() {
        return "Wrench";
    }

    @Override
    public String getSize() {
        return "6";
    }
}

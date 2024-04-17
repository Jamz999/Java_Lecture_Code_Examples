package org.example.week10_java_api;

import kong.unirest.Unirest;

public class CatFactAPI {

    public static void main(String[] args) {
        final String url = "https://catfact.ninja/fact";

        CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody();
        System.out.println("Here's a cat fact:\n" + catFact.getFact());
        System.out.println(catFact.getLength());
    }
}

class CatFact {
    private String fact;
    private int length;

    public String getFact() {
        return fact;
    }

    public int getLength() {
        return length;
    }
}
package com.marysugar.dagger2_retrofit2_sample_java;

public class Country {

    private String name;
    private String capital;



    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }


}

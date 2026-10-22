package com.example.notatkabb;

import java.util.Date;

public class Notatka {
    public String tytulNotatki;
    public String trescNotatki;
    public boolean priorytet;


    public Notatka(String tytulNotatki, String trescNotatki, boolean priorytet) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
        this.priorytet = priorytet;
    }

    public Notatka(String tytulNotatki) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = "";
        this.priorytet = false;
    }

    @Override
    public String toString() {
        return tytulNotatki + '\n' +
                trescNotatki;
    }

}

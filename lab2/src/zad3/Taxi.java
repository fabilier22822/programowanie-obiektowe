package zad3;

import java.util.Random;

public class Taxi extends Auto {
    final float[] zarobki = new float[12];

    public Taxi() {
        super();
        Random rand = new Random();
        for (int i = 0; i < zarobki.length; i++) {
            zarobki[i] = rand.nextFloat()*1000;
        }
    }

    public float srZarobki() {
        float suma = 0;
        for (float zarobek : zarobki) {
            suma += zarobek;
        }
        return suma / zarobki.length;
    }

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        System.out.println("Średni przebieg: " + taxi.srPrzebieg());
        System.out.println("Średnie zarobki: " + taxi.srZarobki());
    }
}


package zad3;

import java.util.Random;

public class Auto {
    final float[] przebieg = new float[12];

    public Auto() {
        Random rand = new Random();
        for (int i = 0; i < przebieg.length; i++) {
            przebieg[i] = rand.nextFloat() * 1000;
        }
    }

    public float srPrzebieg() {
        float suma = 0;
        for (float km : przebieg) {
            suma += km;
        }
        return suma / przebieg.length;
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        System.out.println("Średni przebieg: " + auto.srPrzebieg());
    }
}

package zad3;

public class Taxi extends Auto {
    final float[] zarobki;

    public Taxi() {
        super();
        zarobki = new float[]{1,2,3,4,5,6,7, 80};
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


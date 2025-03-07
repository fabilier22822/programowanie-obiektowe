package zad3;  // Ensure the correct package declaration

public class Auto {
    final float[] przebieg;

    public Auto() {
        przebieg = new float[]{1, 2, 3};  // Initialize przebieg array
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

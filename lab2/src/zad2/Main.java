package zad2;

public class Main {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Błąd: Podaj co najmniej 4 argumenty.");
            return;
        }

        String[] words = new String[4];

        for (int i = 0; i < 4; i++) {
            words[i] = args[i];
        }

        System.out.println("Podane słowa:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

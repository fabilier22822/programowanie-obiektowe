package zad1;

public class Hello {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Błąd: Nie podano argumentu!");
            return;
        }

        int number = Integer.parseInt(args[0]);

        System.out.println("Witaj!");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float liczbaGodz;
        double stawkaGodz;
        double premia;
        String rodzajUm;
        int liczbaRoboczychDniMies;
        double liczGodzWeek;
        int liczbaDniNaUrlopie;
        int liczbaDniNaZwolnienuLek;
        int liczbaDniWolnych;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę przepracowanych godzin");
        liczbaGodz = scan.nextFloat();
        System.out.println("Podaj stawkę godzinową");
        stawkaGodz = scan.nextDouble();
        System.out.println("Ile dodatków/premii");
        premia = scan.nextDouble();
        System.out.println("rodzajUm");
        rodzajUm = scan.nextLine();
        rodzajUm = scan.nextLine();
        System.out.println("Podaj liczbę dni roboczych w miesiącu");
        liczbaRoboczychDniMies = scan.nextInt();
        System.out.println("Podaj liczbę godzin weekendowych");
        liczGodzWeek = scan.nextDouble();
        System.out.println("Podaj liczbę dni przebytych na urlopie");
        liczbaDniNaUrlopie = scan.nextInt();
        System.out.println("Podaj liczbę dni przebytych na zwolnieniu lekarskim");
        liczbaDniNaZwolnienuLek = scan.nextInt();
        System.out.println("Podaj liczbę dni wolnych");
        liczbaDniWolnych = scan.nextInt();

        System.out.println("zakończyć?");
        String wybor = scan.next();

        if (wybor.equals("tak")) {
            System.out.println(liczbaGodz * stawkaGodz + premia);
            System.out.println(liczbaGodz);
            System.out.println(stawkaGodz);
            System.out.println(premia);
            System.out.println(rodzajUm);
            System.out.println(liczbaRoboczychDniMies);
            System.out.println(liczGodzWeek);
            System.out.println(liczbaDniNaUrlopie);
            System.out.println(liczbaDniNaZwolnienuLek);
            System.out.println(liczbaDniWolnych);
        }



    }
}

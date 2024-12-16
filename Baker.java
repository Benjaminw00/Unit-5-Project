import java.util.Scanner;

public class Baker {
    public static void main(String[] args) {
        System.out.println("Welcome to Russian Roulette Cookies");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 or 2");
        String number = scanner.nextLine();

        while (!(number.equals("1")) && !(number.equals("2"))) {
            System.out.println("Type 1 or 2");
            number = scanner.nextLine();
        }

        if (number.equals("1")) {
            ZeroSugarRaisinWheatCookie newCookie = new ZeroSugarRaisinWheatCookie(5);
            System.out.println(newCookie);
            System.out.println("What do you want to do: \"eat\" or \"hear\"?");
            String answer = scanner.nextLine();
            if (answer.equals("eat")) {
                newCookie.eatCookie();
            } else if (answer.equals("hear")) {
                newCookie.makeNoise();
            } else {
                System.out.println("Answer with \"eat\" or \"hear\"");
                String redo = scanner.nextLine();
            }
        }

        if (number.equals("2")) {
            GingerbreadCookie newCookie = new GingerbreadCookie(5);
            System.out.println(newCookie);
            System.out.println("What do you want to do: \"eat\" or \"hear\"?");
            String answer = scanner.nextLine();
            if (answer.equals("eat")) {
                newCookie.eatCookie();
            } else if (answer.equals("hear")) {
                newCookie.makeNoise();
            } else {
                System.out.println("Answer with \"eat\" or \"hear\"");
                String redo = scanner.nextLine();
            }
        }



    }
}

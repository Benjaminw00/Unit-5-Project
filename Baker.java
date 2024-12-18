import java.util.Scanner;


public class Baker {
    public static void main(String[] args) {
        System.out.println("Welcome to Russian Roulette Cookies");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want a cookie? Type \"yes\" or \"no\"");
        String yesOrNo = scanner.nextLine();
        while (yesOrNo.equals("yes")){

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

                while (!(answer.equals("eat"))) {
                    while (!(answer.equals("eat")) && !(answer.equals("hear"))) {
                        System.out.println("Answer with \"eat\" or \"hear\"");
                        answer = scanner.nextLine();
                    }
                    if (answer.equals("hear")) {
                        newCookie.makeNoise();
                        System.out.println("What do you want to do: \"eat\" or \"hear\"?");
                        answer = scanner.nextLine();
                    }
                }
                if (answer.equals("eat")) {
                    newCookie.eatCookie();
                    System.out.println("Would you like to start again? \"yes\" or \"no\"");
                    yesOrNo = scanner.nextLine();
                }
            }

            if (number.equals("2")) {
                GingerbreadCookie newCookie = new GingerbreadCookie(5);
                System.out.println(newCookie);
                System.out.println("What do you want to do: \"eat\" or \"hear\"?");
                String answer = scanner.nextLine();
                while (!(answer.equals("eat"))) {
                    while (!(answer.equals("eat")) && !(answer.equals("hear"))) {
                        System.out.println("Answer with \"eat\" or \"hear\"");
                        answer = scanner.nextLine();
                    }
                    if (answer.equals("hear")) {
                        newCookie.makeNoise();
                        System.out.println("What do you want to do: \"eat\" or \"hear\"?");
                        answer = scanner.nextLine();
                    }
                }
                if (answer.equals("eat")) {
                    RussianRouletteCookie.printHunger();
                    newCookie.eatCookie();
                    System.out.println("Do you want another cookie? \"yes\" or \"no\"");
                    yesOrNo = scanner.nextLine();
                }
            }


        }


    }
}

import java.util.Scanner;

public class Baker {
    public static void main(String[] args) {
        //introduction
        System.out.println("Welcome to Russian Roulette Cookies");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want a cookie? Type \"yes\" or \"no\""); //no automatically ends game
        String yesOrNo = scanner.nextLine();

        while (yesOrNo.equals("yes")){ //while user wants to play the game, start the game.

            System.out.println("1 or 2");
            String number = scanner.nextLine();
            while (!(number.equals("1")) && !(number.equals("2"))) { //keep asking the user to give a valid input: "1" or "2"
                System.out.println("Type 1 or 2");
                number = scanner.nextLine();
            }


            if (number.equals("1")) { //choice 1 gives you a ZeroSugarRaisinWheatCookie
                ZeroSugarRaisinWheatCookie newCookie = new ZeroSugarRaisinWheatCookie(5);
                System.out.println(newCookie);
                System.out.println("What do you want to do: \"eat\" or \"hear\"?"); //initial choice
                String answer = scanner.nextLine();

                while (!(answer.equals("eat"))) {
                    while (!(answer.equals("eat")) && !(answer.equals("hear"))) { //repeat choices until valid choice is given
                        System.out.println("Answer with \"eat\" or \"hear\"");
                        answer = scanner.nextLine();
                    }
                    if (answer.equals("hear")) { //runs when "hear" choice is properly selected
                        newCookie.makeNoise();
                        System.out.println("What do you want to do: \"eat\" or \"hear\"?"); //yes restarts game; no ends game
                        answer = scanner.nextLine();
                    }
                }
                if (answer.equals("eat")) { //runs when "eat" choice is properly selected
                    newCookie.eatCookie();
                    System.out.println("Would you like to start again? \"yes\" or \"no\""); //yes restarts game; no ends game
                    yesOrNo = scanner.nextLine();
                }
            }


            if (number.equals("2")) { //choice 2 gives you a GingerbreadCookie
                GingerbreadCookie newCookie = new GingerbreadCookie(5);
                System.out.println(newCookie);
                System.out.println("What do you want to do: \"eat\" or \"hear\"?");
                String answer = scanner.nextLine();
                while (!(answer.equals("eat"))) {
                    while (!(answer.equals("eat")) && !(answer.equals("hear"))) { //repeat choices until valid choice is given
                        System.out.println("Answer with \"eat\" or \"hear\"");
                        answer = scanner.nextLine();
                    }
                    if (answer.equals("hear")) { //runs when "hear" choice is properly selected
                        newCookie.makeNoise();
                        System.out.println("What do you want to do: \"eat\" or \"hear\"?");
                        answer = scanner.nextLine();
                    }
                }
                if (answer.equals("eat")) { //runs when "eat" choice is properly selected
                    RussianRouletteCookie.printHunger();
                    newCookie.eatCookie();
                    System.out.println("Do you want another cookie? \"yes\" or \"no\""); //yes restarts game; no ends game
                    yesOrNo = scanner.nextLine();
                }
            }


        }


    }
}

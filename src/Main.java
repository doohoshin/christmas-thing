import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<ArrayList<String>> personArray = new ArrayList<ArrayList<String>>();

    public static void main(String[] args) {
        String Estelle, Dhen, Will, Dooho;
        Scanner scan = new Scanner(System.in);



        for (int i = 0; i < 4; i++) {
            System.out.print("\nWho is this!? Santa? ");
            String Santa = scan.nextLine();
            method(Santa);
        }


    }

    private static void method(String name) {
        Scanner scan = new Scanner(System.in);
        if (name.equals("Dhen"))        {
            System.out.println("hey country girl");
            System.out.println("just type in who you'd like to give to. Won't affect the programme, I promise ");
            String wowEstelle = scan.nextLine();
            System.out.println("ok, unfortunately " + wowEstelle + " is not an option. Let's get to the business");
            System.out.println("Instead, you will get: ");
            int randomInt;

            do {
                randomInt = (int)(Math.random() * personArray.size());
            }
            while (personArray.get(randomInt).equals("Dhen"));

            System.out.print(personArray.get(randomInt));
            personArray.remove(randomInt);
        }
        if (name.equals("Estelle"))        {
            System.out.println("hey country girl");
            System.out.println("just type in who you'd like to give to. Won't affect the programme, I promise ");
            String wowEstelle = scan.nextLine();
            System.out.println("ok, unfortunately " + wowEstelle + " is not an option. Let's get to the business");
            System.out.println("Instead, you will get: ");
            int randomInt;
            do {
                randomInt = (int)(Math.random() * personArray.size());
            }
            while (personArray.get(randomInt).equals("Estelle"));
            System.out.print(personArray.get(randomInt));
            personArray.remove(randomInt);
        }
        if (name.equals("Dooho"))        {
            System.out.println("hey country girl");
            System.out.println("just type in who you'd like to give to. Won't affect the programme, I promise ");
            String wowEstelle = scan.nextLine();
            System.out.println("ok, unfortunately " + wowEstelle + " is not an option. Let's get to the business");
            System.out.println("Instead, you will get: ");
            int randomInt;
            do {
                randomInt = (int)(Math.random() * personArray.size());
            }
            while (personArray.get(randomInt).equals("Dooho"));
            System.out.print(personArray.get(randomInt));
            personArray.remove(randomInt);
        }
        if (name.equals("Will"))        {
            System.out.println("hey country girl");
            System.out.println("just type in who you'd like to give to. Won't affect the programme, I promise ");
            String wowEstelle = scan.nextLine();
            System.out.println("ok, unfortunately " + wowEstelle + " is not an option. Let's get to the business");
            System.out.println("Instead, you will get: ");
            int randomInt;
            do {
                randomInt = (int)(Math.random() * personArray.size());
            }
            while (personArray.get(randomInt).equals("Will"));
            System.out.print(personArray.get(randomInt));
            personArray.remove(randomInt);
        }
    }
}

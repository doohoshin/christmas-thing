import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static ArrayList<ArrayList<String>> personArray = new ArrayList<>();
    private static ArrayList<ArrayList<String>> santasPersonArray = new ArrayList<>(personArray);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        fillArray();

        while (true) {
            System.out.print("\nWho is this!? Santa? ");
            String input;
            input = scan.nextLine();
            if (input.equals("exit")) System.exit(0);
            santa(input);

        }

    }

    private static void fillArray() {
        Scanner scanFile = null;
        try {
            scanFile = new Scanner(new FileInputStream("data.txt")).useDelimiter(",");
        } catch (Exception e) {
            System.out.println("error with file");
            System.exit(0);
        }
        int index = 0;
        while (scanFile.hasNextLine()) {
            personArray.add(new ArrayList<>());
            while (scanFile.hasNext()) {
                personArray.get(index).add(scanFile.next());
            }
            index++;
        }
    }

    private static void santa(String name) {
        ArrayList<ArrayList<String>> santasPersonArray = new ArrayList<>(personArray);

        if (name.equals("Dhen") || name.equals("dhen")) {
            System.out.println(santasPersonArray.get(3).get(1));
            System.out.println(santasPersonArray.get(3).get(1));
            int randomInt;
            do {
                randomInt = (int) (Math.random() * santasPersonArray.size());
            }
            while (santasPersonArray.get(randomInt).get(0).equals("Dhen"));
            System.out.print(santasPersonArray.get(randomInt).get(0));
            santasPersonArray.remove(randomInt);
        }
        if (name.equals("Estelle")) {
            System.out.println(santasPersonArray.get(2).get(1));
            System.out.println(santasPersonArray.get(2).get(1));
            int randomInt;
            do {
                randomInt = (int) (Math.random() * santasPersonArray.size());
            }
            while (santasPersonArray.get(randomInt).get(0).equals("Estelle"));
            System.out.print(santasPersonArray.get(randomInt).get(0));
            santasPersonArray.remove(randomInt);
        }
        if (name.equals("Dooho")) {
            System.out.println(santasPersonArray.get(1).get(1));
            System.out.println(santasPersonArray.get(1).get(1));
            int randomInt;
            do {
                randomInt = (int) (Math.random() * santasPersonArray.size());
            }
            while (santasPersonArray.get(randomInt).get(0).equals("Dooho"));
            System.out.print(santasPersonArray.get(randomInt).get(0));
            santasPersonArray.remove(randomInt);
        }
        if (name.equals("Will")) {
            System.out.println(santasPersonArray.get(0).get(1));
            System.out.println(santasPersonArray.get(0).get(1));
            int randomInt;
            do {
                randomInt = (int) (Math.random() * santasPersonArray.size());
            }
            while (santasPersonArray.get(randomInt).get(0).equals("Will"));
            System.out.print(santasPersonArray.get(randomInt).get(0));
            santasPersonArray.remove(randomInt);
        }
    }
}

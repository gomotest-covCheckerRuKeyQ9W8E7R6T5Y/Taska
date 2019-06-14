package Task4;

import java.util.HashMap;
import java.util.Scanner;


public class MapPopulation {

    static String checkTheQuantityOfSurnameOrName(HashMap<String, String> census, String surnameAndNameCheck) {
        int count = 0;

            for (String tmp : census.values()) {
                if (surnameAndNameCheck.equals(tmp.toString().substring(0, tmp.toString().indexOf(" ")))) {
                    count++;
                }

                if (surnameAndNameCheck.equals(tmp.toString().substring(tmp.toString().indexOf(" ") + 1))) {

                    count++;
                }
            }
            System.out.println(count+ " element(s) of this application  contain(s) name/surname which you entered.");
            return "There are " + count + " duplicate names.";
        }

    public static void main(String[] args) {
        System.out.println("This application contains ID, surnames and names of 10 people.");
        System.out.println("If you want to check how mach equal names or surnames are contained in  ");
        System.out.println("this application, enter name or surname witch you want. ");

        HashMap<String, String> census = new HashMap<String, String>();
        Citizen citizen1 = new Citizen("Savitskiy Pavel", "1");
        census.put(citizen1.ID, citizen1.surnameAndName);
        Citizen citizen2 = new Citizen("Savitskiy Pavel", "2");
        census.put(citizen2.ID, citizen2.surnameAndName);
        Citizen citizen3 = new Citizen("Fain Yakov", "3");
        census.put(citizen3.ID, citizen3.surnameAndName);
        Citizen citizen4 = new Citizen("Petrov Aleksandr", "4");
        census.put(citizen4.ID, citizen4.surnameAndName);
        Citizen citizen5 = new Citizen("Smith John", "5");
        census.put(citizen5.ID, citizen5.surnameAndName);
        Citizen citizen6 = new Citizen("Bandera Andrey", "6");
        census.put(citizen6.ID, citizen6.surnameAndName);
        Citizen citizen7 = new Citizen("Yakovleva Gary", "7");
        census.put(citizen7.ID, citizen7.surnameAndName);
        Citizen citizen8 = new Citizen("Brown Gary", "8");
        census.put(citizen8.ID, citizen8.surnameAndName);
        Citizen citizen9 = new Citizen("Gusev Pavel", "9");
        census.put(citizen9.ID, citizen9.surnameAndName);
        Citizen citizen10 = new Citizen("Savitskiy Pavel", "10");
        census.put(citizen10.ID, citizen10.surnameAndName);

       while (true) {
           Scanner scanner = new Scanner(System.in);
           String   surnameAndNameCheck = scanner.nextLine();

            if (surnameAndNameCheck.equals("stop"))
                break;
            else checkTheQuantityOfSurnameOrName(census, surnameAndNameCheck);
        }
    }
}
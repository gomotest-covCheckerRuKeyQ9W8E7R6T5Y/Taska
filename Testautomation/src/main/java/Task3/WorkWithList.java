package Task3;

import java.util.*;

public class WorkWithList {
   static String enter;
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<String>();  //основной контейнер
        HashSet<String> setOfUnique = new HashSet<String>();  // вспомогательный контейнер для ввода уник элементов
        while (true){

        Scanner scanner = new Scanner(System.in);
        enter=scanner.nextLine();
            if(enter.startsWith("del")){

                listOfStrings.remove(enter.substring(4));      // при "del" удаляем субстроку из основного листа
                if (!listOfStrings.contains(enter.substring(4))){  // если удаляемый объект уникален, удаляем его и из
                                                                        //вспомогательного сета
                setOfUnique.remove(enter.substring(4));}
                System.out.println(listOfStrings);
                System.out.println("The collection keeps " + setOfUnique.size() + " unique elements.");
                continue;
                }


            else
        listOfStrings.add(enter);
            setOfUnique.add(enter);
        System.out.println(listOfStrings);
        System.out.println("The collection keeps " + setOfUnique.size() + " unique elements.");



    }

}}
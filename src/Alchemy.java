import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Alchemy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите названия элементов через пробел: ");
        String elements = in.nextLine();  // через аргументы командной строки передаются названия элементов
        String[] words = elements.split("\\s+"); // разбиваем на массив отдельных слов

        ArrayList elementList = new ArrayList(); //для переданных аргументов создаются объекты соответствующих классов
        String res = "OK";
        for (int i = 0;i< words.length;i++) {
            switch (words[i]) {
                case "Fire":
                case "Water":
                case "Air":
                case "Earth":
                    res = "OK"; continue;
                default:
                    res = "Close";
                    break;
            }
        }
        System.out.println(res);
        if (res == "Close") System.out.println("Введите названия элементов с большой буквы!");
        else {
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals("Fire")) {
                        elementList.add(NatureElement.create("fire"));
                    } else if (words[j].equals("Air")) {
                        elementList.add(NatureElement.create("air"));
                    } else if (words[j].equals("Earth")) {
                        elementList.add(NatureElement.create("earth"));
                    } else if (words[j].equals("Water")) {
                        elementList.add(NatureElement.create("water"));
                    }
                }
                for (int k = 0; k < elementList.size(); k++) { //Далее попарно объединяются объекты и выводятся соответствующие сообщения.
                    NatureElement first = (NatureElement) elementList.get(k);
                    NatureElement second = (NatureElement) elementList.get(k + 1);
                    NatureElement third = first.connect(second);
                    k = k + 1;
                }
            }
    }
}
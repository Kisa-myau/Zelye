import java.util.ArrayList;
import java.util.Scanner;

public class Alchemy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите названия элементов через пробел: ");
        String elements = in.nextLine();  // через аргументы командной строки передаются названия элементов
        String[] words = elements.split("\\s+"); // разбиваем на массив отдельных слов

        ArrayList elementList = new ArrayList(); //для переданных аргументов создаются объекты соответствующих классов
        for (int i = 0;i< words.length;i++){
            if (words [i].equals("Fire")) {
                elementList.add(new Fire());
            }
            else if (words [i].equals("Air")) {
                elementList.add(new Air());
            }
            else if (words [i].equals("Earth")) {
                elementList.add(new Earth());
            }
            else if (words [i].equals("Water")) {
                elementList.add(new Water ());
            }
            else break; //Если хотя бы для одного из аргументов нельзя создать объект, то программа завершается
        }
        System.out.println(elementList);
        for (int i = 0;i< words.length;i++){
        NatureElement first = (NatureElement) elementList.get(i);
        NatureElement second = (NatureElement) elementList.get(i+1);
        MixedElement result = first.connect(second);
            System.out.println(result);
        }

    }
}
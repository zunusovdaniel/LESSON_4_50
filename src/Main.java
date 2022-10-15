import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Классное задание:
 //        1. Создать два листа из элементов типа String и добавить в первый какие-то элементы
//        2. Добавить во второй лист все элементы из первого и удалить элемент по 3му индексу
//        3. Отсортировать второй лист по алфавиту и напечатать его
//        4. Очистить первый лист и добавить в него все отсортированные элементы из второго
//        5. "Перевернуть" все элементы из первого листа
//        6. Напечатать первый лист
        ArrayList<String> car = new ArrayList<String>();
        ArrayList<String> book = new ArrayList<String>();
        car.add("toyota");
        car.add("BMW");
        car.add("Ford");
        book.addAll(car);
        book.remove(2);
        Collections.sort(book);
        System.out.println(book);
        car.clear();
        System.out.println(car);
        car.addAll(book);
        System.out.println(book);
        Collections.reverse(car);
        System.out.println(car);
        //6 задания не смог сделать





    }
}
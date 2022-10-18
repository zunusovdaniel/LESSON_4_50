import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Классное задание:
        //        1. Создать два листа из элементов типа String и добавить в первый какие-то элементы
//        2. Добавить во второй лист все элементы из первого и удалить элемент по 3му индексу
//        3. Отсортировать второй лист по алфавиту и напечатать его
//        4. Очистить первый лист и добавить в него все отсортированные элементы из второго
//        5. "Перевернуть" все элементы из первого листа
//        6. Напечатать первый лист
//        ArrayList<String> car = new ArrayList<String>();
//        ArrayList<String> book = new ArrayList<String>();
//        car.add("toyota");
//        car.add("BMW");
//        car.add("Ford");
//        book.addAll(car);
//        book.remove(2);
//        Collections.sort(book);
//        System.out.println(book);
//        car.clear();
//        System.out.println(car);
//        car.addAll(book);
//        System.out.println(book);
//        Collections.reverse(car);
//        System.out.println(car);
        //6 задания не смог сделать
//        1. Используйте цикл
//        2. Создайте список "А" и добавьте в него 5 элементов, желательно содержащие буквы
//        2.  Затем отобразить этот список
//        3. Создать список "Б"
//        4. Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//        5. После объединения отобразить в консоли список С
//        6.  В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С.
//
//

        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            A.add("a" + i);
            B.add("b" + i);
        }

        System.out.println(A);
        System.out.println(B);

        Collections.reverse(B);
        System.out.println(B);

        ArrayList<String> C = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            C.add(A.get(i));
            C.add(B.get(i));
        }
        System.out.println(C);

        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();
        Collections.sort(C, comparator);
        System.out.println("Отсортированный список по длине:");
        System.out.println(C);
    }}

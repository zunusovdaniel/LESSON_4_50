import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        �������� �������:
 //        1. ������� ��� ����� �� ��������� ���� String � �������� � ������ �����-�� ��������
//        2. �������� �� ������ ���� ��� �������� �� ������� � ������� ������� �� 3�� �������
//        3. ������������� ������ ���� �� �������� � ���������� ���
//        4. �������� ������ ���� � �������� � ���� ��� ��������������� �������� �� �������
//        5. "�����������" ��� �������� �� ������� �����
//        6. ���������� ������ ����
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
        //6 ������� �� ���� �������





    }
}
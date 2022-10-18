import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        �������� �������:
        //        1. ������� ��� ����� �� ��������� ���� String � �������� � ������ �����-�� ��������
//        2. �������� �� ������ ���� ��� �������� �� ������� � ������� ������� �� 3�� �������
//        3. ������������� ������ ���� �� �������� � ���������� ���
//        4. �������� ������ ���� � �������� � ���� ��� ��������������� �������� �� �������
//        5. "�����������" ��� �������� �� ������� �����
//        6. ���������� ������ ����
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
        //6 ������� �� ���� �������
//        1. ����������� ����
//        2. �������� ������ "�" � �������� � ���� 5 ���������, ���������� ���������� �����
//        2.  ����� ���������� ���� ������
//        3. ������� ������ "�"
//        4. ���������� ������ � �� ������� � � ����� ������ � ��������� ������� {A1,B5,�2,�4,�3,�3,�4,�2,�5,�1}
//        5. ����� ����������� ���������� � ������� ������ �
//        6.  � ����� ������������� �������� ������ � �� ����� �����, ������� ���� String-� � ���������� ����������� ��������, � ����������� ��������������� ������ �.
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
        System.out.println("��������������� ������ �� �����:");
        System.out.println(C);
    }}

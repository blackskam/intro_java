import java.util.ArrayList;
import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        // 1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Белый");
        list1.add("Синий");
        list1.add("Красный");
        System.out.println("Задание №1:");
        System.out.println(list1);
        // 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        for (int i=0; i< list1.size(); i++){
            list1.set(i, list1.get(i) + "!");
        }
        System.out.println("Задание №2:");
        System.out.println(list1);
        // 3. Вставить элемент в список в первой позиции.
        list1.add(0,  "!");
        System.out.println("Задание №3:");
        System.out.println(list1);
        // 4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("Задание №4:");
        System.out.println(list1.get(2));
        // 5. Обновить определенный элемент списка по заданному индексу.
        System.out.println("Задание №5:");
        list1.set(0, "&");
        System.out.println(list1);
        // 6. Удалить третий элемент из списка.
        System.out.println("Задание №6:");
        list1.remove(2);
        System.out.println(list1);
        // 7. Поиска элемента в списке по строке.
        String tmp = new String("&");
        System.out.println("Задание №7:");
        System.out.println(list1.indexOf(tmp));
        // 8. Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(list1.get(1));
        list2.add(list1.get(2));
        System.out.println("Задание №8:");
        System.out.println(list2);
        // 9. Удалить из первого списка все элементы отсутствующие во втором списке.
        System.out.println("Задание №9:");
        list1.add("2");
        System.out.println(list1);
        System.out.println(list2);
        list1.retainAll(list2);
        System.out.println(list1);
        // 10. *Сортировка списка.
        list1.add("Синий");
        list1.add("5");
        list1.add("1");
        list1.add("$");
        list1.add("!");
        Collections.sort(list1);
        System.out.println("Задание №10:");
        System.out.println(list1);
        // 11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        System.out.println("Задание №11:");
        System.out.println("ArrayList:");
        ArrayList<String> list3 = new ArrayList<>();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list3.add(0,  "!");
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        System.out.println("LinkedList");
        LinkedList<String> list4 = new LinkedList<>();
        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list4.add(0,  "!");
        }
        long t4 = System.currentTimeMillis();
        System.out.println(t4 - t3);
    }
}

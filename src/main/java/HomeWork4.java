import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class HomeWork4 {

    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        // 1. Ввод с консоли в формате Ф.И.О Возраст пол
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> pName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Введите данные в формате Ф.И.О. возраст пол, ыыход буква Q:");
        Boolean run = true;
        Boolean runInput = true;
        while (run) {
            while (runInput) {
                // 2. Выход из режима вода по горячей кнопке
                String inputString = scanInput.nextLine();
                if (inputString.equals("q")) {
                    runInput = false;
                } else {
                    String[] data = inputString.split(" ");
                    lastName.add(data[0]);
                    firstName.add(data[1]);
                    pName.add(data[2]);
                    age.add(Integer.parseInt(data[3]));
                    gender.add(data[4]);
                }
            }
            // 3. Вывод несортированного списка в формате Иванов И.И. 32M
            for (int i = 0; i < lastName.size(); i++) {
                System.out.println(lastName.get(i) + " " + firstName.get(i).charAt(0) + "." + pName.get(i).charAt(0) + "." + " " + age.get(i) + gender.get(i).charAt(0));
            }
            // 4. Два варианта продолжения, либо вывод списка сортированного по возрасту либо завершение приложения.
            System.out.println("Для сортировки данных по возрасту введите age, для выхода введите любую клавишу");
            String inputString = scanInput.nextLine();
            if (inputString.equals("old")) {
                LinkedList<Integer> indexAge = new LinkedList<>();
                LinkedList<Integer> tmpAge = new LinkedList<>(age);
                for (int i = 0; i < age.size(); i++) {
                    indexAge.add(i);
                }
                for (int i = 0; i < (tmpAge.size() - 1); i++) {
                    for (int j = 0; j < (tmpAge.size() - i - 1); j++) {
                        if (tmpAge.get(j + 1) < tmpAge.get(j)) {
                            int swap = tmpAge.get(j);
                            tmpAge.set(j,tmpAge.get(j + 1));
                            tmpAge.set((j + 1),swap);
                            int swap2 = indexAge.get(j);
                            indexAge.set(j,indexAge.get(j + 1));
                            indexAge.set((j + 1),swap2);
                        }
                    }
                }
                for (int i:indexAge){
                    System.out.println(lastName.get(i) + " " + firstName.get(i).charAt(0) + "." + pName.get(i).charAt(0) + "." + " " + age.get(i) + gender.get(i).charAt(0));
                }
            }
            run = false;
        }
    }
}

import java.util.HashMap;

public class HomeWork5 {

    public static void main(String[] args) {
        // Создать множество, ключь и значение строки.
        HashMap<String, String> hama = new HashMap<>();

        // Добавить шесть элементов. Вывести в консоль значения.
        hama.put("первый", "самолет");
        hama.put("второй", "автомобиль");
        hama.putIfAbsent("третий", "вертолет");
        hama.put("четвертый", "самосвал");
        hama.put("пятый", "дирижабль");
        hama.put("шестой", "корабль");
        hama.forEach((k, s) -> System.out.println(k + " " + s));

        // Добавить ко всем значениям символ "!".
        for (String key : hama.keySet()) {
            hama.compute(key, (k, v) -> v + "!");
        }


        // Создать второе множество с таким же обобщением.
        // Ключи второго множества частично совпадают с ключеми первого.
        HashMap<String, String> hama2 = new HashMap<>();
        hama2.put("первый", "самолет");
        hama2.put("седьмой", "автомобиль");
        hama2.putIfAbsent("третий", "вертолет");
        hama2.put("четвертый", "самосвал");
        hama2.put("девятый", "дирижабль");
        hama2.put("шестой", "корабль");


        // Объеденить значания во втором множестве и первом если ключи совподают.
        // Вывести результат в консоль.
        for (String key: hama2.keySet()) {
            hama2.merge(key, hama.getOrDefault(key, ""), (k,v) -> k + v);
        }
        System.out.println(hama2);
    }
}

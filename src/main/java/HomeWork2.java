import java.beans.Introspector;

public class HomeWork2 {
    public static String rString(String str) {
        String rStr;
        String lStr;
        int sLength = str.length();
        if (sLength <= 1) {
            return str;
        }
        lStr = str.substring(0, sLength / 2);
        rStr = str.substring(sLength / 2, sLength);
        return rString(rStr) + rString(lStr);
    }
    public static void main(String[] args) {
        // 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        String sLine1 = "123456";
        String sLine2 = "56789";
        if (sLine1.contains(sLine2)) {
            System.out.println("Первая строка содержит все символы второй строки");
        } else {
            System.out.println("Первая строка  не содержит все символы второй строки");
        }
        // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
        // (вхождение в обратном порядке).
        sLine1 = "98765";
        StringBuilder sLine3 = new StringBuilder();
        sLine3.append(sLine2);
        sLine3.reverse();
        if (sLine1.equals(sLine3.toString())) {
            System.out.println("Две строки являются вращением друг друга");
        } else {
            System.out.println("Две строки не являются вращением друг друга");
        }
        // 3. Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        System.out.println(rString(sLine1));
        // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
        // 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        Integer a = 3;
        Integer b = 56;
        System.out.println(sLine3.delete(0, sLine3.length()).append(a.toString()).append(" + ").append(b.toString()).append(" = ")
                .append((a + b)));
        System.out.println(sLine3.delete(0, sLine3.length()).append(a.toString()).append(" - ").append(b.toString()).append(" = ")
                .append((a - b)));
        System.out.println(sLine3.delete(0, sLine3.length()).append(a.toString()).append(" * ").append(b.toString()).append(" = ")
                .append((a * b)));
        // 5. Замените символ “=” на слово “равно”. Используйте методы
        // StringBuilder.insert(),StringBuilder.deleteCharAt().
        StringBuilder sLine4 = new StringBuilder(sLine3);
        System.out.println(sLine3.deleteCharAt(7).insert(7,"равно"));
        // 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(sLine4.replace(7, 8, "равно"));
        // 7. *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов
        // "=" средствами String и StringBuilder.
        StringBuilder sLine5 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sLine5.append("=");
        }
        String sLine6 = new String(sLine5);
        long t3 = System.currentTimeMillis();
        sLine6 = sLine6.replace("=", "равно");
        long t4 = System.currentTimeMillis();
        System.out.println(t4 - t3);
        System.out.println(sLine6);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sLine5.replace(sLine5.indexOf("="), (sLine5.indexOf("=") + 1), "равно");
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        System.out.println(sLine5);

    }
}
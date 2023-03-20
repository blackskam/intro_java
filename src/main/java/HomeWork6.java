import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class HomeWork6 {
// Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент,
// метод toString возвращающий строку с элементами множества и
// метод позволяющий читать элементы по индексу. Формат данных Integer.
    public static void main(String[] args) {
        HasSet set = new HasSet();
        set.add(5);
        set.add(5);
        set.add(7);
        set.add(7);
        set.add(9);
        set.add(11);
        set.add(16);
        System.out.println(set.toString());
        System.out.println(set.contains(6));
        System.out.println(set.get(2));
        System.out.println(set.getArrayList());
        System.out.println(set.tailSet(7));
        System.out.println(set.headSet(7));
        System.out.println(set.subSet(5,9));

    }

}

class HasSet {
    private HashMap<Integer, Object> val = new HashMap();
    private static final Object D = new Object();

    void add(int data) {
        val.put(data, D);
    }

    public String toString() {
        return val.keySet().toString();
    }

    Boolean contains(int data) {
        return val.containsKey(data);
    }

    void clear() {
        val.clear();
    }

    void remove(int data) {
        val.remove(data);
    }

    int size() {
        return val.size();
    }

    int get (int index) {
        return (int) val.keySet().toArray()[index];

    }

    ArrayList getArrayList(){
        ArrayList <Integer> res = new ArrayList<>();
        val.forEach((k,v) -> res.add(k));
        return res;
    }

    HasSet headSet(int data) {
        HasSet res = new HasSet();
        for (int k: val.keySet()){
            res.add(k);
            if (data == k)
                break;
        }
        return res;
    }

    HasSet tailSet(int data) {
        HasSet res = new HasSet();
        boolean ad = false;
        for (int k: val.keySet()){
            if (k == data) ad = true;
            if (ad) {
                res.add(k);
            }
        }
        return res;
    }

    HasSet subSet (int key1, int key2) {
        HasSet res = new HasSet();
        boolean ad = false;
        int stop = key1;
        for (int el: val.keySet()){
            if (el == key1 && !ad){
                ad = true;
                stop = key2;
            }
            if  (el == key2 && !ad){
                ad = true;
            }
            if (ad){
                res.add(el);
                if (el == stop){
                    break;
                }
            }
        }
        return res;

    }
}
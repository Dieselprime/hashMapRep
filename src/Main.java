import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
     HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"qw");
        map.put(1,"wer");
        map.put(2,"rf");
        map.put(3,"Dc");

        System.out.println(map);

    }
}



//    Напишите метод, который получает на вход Map<K, V> и возвращает Map,
//    где ключи и значения поменяны местами. Так как значения могут совпадать,
//    то тип значения в Map будет уже не K, а
//        Collection<K>:
//
//        Map<V, Collection<K>>

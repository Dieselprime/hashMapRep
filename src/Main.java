import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();


    }
}

//    Напишите метод, который получает на вход Map<K, V> и возвращает Map,
//    где ключи и значения поменяны местами. Так как значения могут совпадать,
//    то тип значения в Map будет уже не K, а
//        Collection<K>:
//
//        Map<V, Collection<K>>
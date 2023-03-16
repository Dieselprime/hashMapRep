import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapReverse<K, V> {

    public Map<V, Collection<K>> mapRev(Map<K, V> hashM) {

        Map<V, Collection<K>> hashMapRev = new HashMap<>();

                // hashM.keySet(); // получаем ключи
        for (K k : hashM.keySet()) {
            hashM.get(k);         // получаем значения
                                 // если есть одинаковые значения, выводить их все, а не одно из.
                                // помещать все значения в пустой массив, а затем вводить его
            hashMapRev.put(hashM.get(k), List.of(k));

        }
            return hashMapRev;

    }
}

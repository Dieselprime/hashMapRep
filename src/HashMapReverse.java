import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapReverse<K, V> {

    public HashMapReverse() {
    }

    public Map<V, Collection<K>> mapRev(Map<K, V> hashM) {

        Map<V, Collection<K>> hashMaRrev = new HashMap<>();

       // hashM.keySet(); // получаем ключи
        for (K k : hashM.keySet()) {
            hashM.get(k); // получаем значения

            hashMaRrev.put(hashM.get(k), List.of(k));
        }

        return hashMaRrev;
    }
}

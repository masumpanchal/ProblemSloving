import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class cache{
    int key;
    String value;
    cache(int key, String value){
        this.key = key;
        this.value = value;
    }
}
public class LRUCache {
    static Deque<Integer> q = new LinkedList<>();
    static Map<Integer, cache> map = new HashMap<>();
    int CACHE_CAPACITY = 4;

    public String getElementFromCache(int key){
        if (map.containsKey(key)){
            cache current = map.get(key);
            q.remove(current.key);
            q.addFirst(current.key);
            return current.value;
        }
        return null;
    }

    public void putElementinCache(int key, String value){
        if(map.containsKey(key)){
            cache curr = map.get(key);
            q.remove(curr.key);
        }
        else {
            if (q.size() == CACHE_CAPACITY){
                int t = q.removeLast();
                map.remove(t);
            }
        }
        cache newitem = new cache(key, value);
        q.addFirst(newitem.key);
        map.put(key, newitem);


    }
    public static void main(String args[]){
        LRUCache lru = new LRUCache();
        lru.putElementinCache(1, "Value_100");
        lru.putElementinCache(2, "Value_200");
        lru.putElementinCache(3, "Value_300");
        lru.putElementinCache(4, "Value_400");
        System.out.println(lru.getElementFromCache(2));
        System.out.println();
        System.out.println(q);
        System.out.println();
        lru.putElementinCache(5, "Value_500");
        System.out.println();
        System.out.println(q);
        System.out.println();
    }
}


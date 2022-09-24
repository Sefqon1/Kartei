import java.util.HashMap;

public class Kartei<T extends IIdentifizierbar> {
    HashMap<Integer, T> items = new HashMap<>();

    public void add(T item) {
        items.put(item.getSchlussel(), item);
    }

    public T get(int schlussel) {
        if (items.containsKey(schlussel)) {
            return items.get(schlussel);
        }
        return null;
    }

    public T del(int schlussel) {
        return items.remove(schlussel);
    }

    public int getGesamtzahl() {
        return items.size();
    }
}

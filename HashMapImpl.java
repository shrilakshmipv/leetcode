import java.util.Objects;

public class HashMapImpl<K, V> {
    private int size = 0;
    private int capacity = 16;
    private Entry<K,V>[] entries = new Entry[capacity];
    private double loadFactor = 0.75;

    private static class Entry<K, V> {
        private final K key;
        private V val;
        private Entry<K, V> next = null;

        public Entry(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return size;
    }

    /*This method returns the value V associated with a key K 
     * @params: key: K
     * @return: val: V
    */
    public V get(K key) {
        Entry<K, V> existingEntry = this.entries[indexOf(key)];

        while(existingEntry != null && !Objects.equals(key, existingEntry)){
            existingEntry = existingEntry.next;
        }
        return existingEntry == null ? null : existingEntry.val;
    }

    /*
     * Method doc
     */
    public void put(K key, V val) {
        int index = indexOf(key);

        Entry<K, V> existingEntry = entries[index];
        
        // when key does not exist
        if(existingEntry == null) {
            entries[index] = new Entry(key, val);
            this.size++;
            return;
        }

        // when key exists
        while( !(Objects.equals(key, existingEntry.key)) && existingEntry.next != null) {
            existingEntry = existingEntry.next;
        }
        
        if(Objects.equals(key, existingEntry.key)) {
            existingEntry.val = val;
            return;
        }

        existingEntry.next = new Entry(key, val);
        this.size++;
        return;
    }

    public int indexOf(K object) {
        return object == null ? 0 : getHash(object) & (this.capacity - 1);
    }
    
    public int getHash(Object key) {
        return key.hashCode();
    }

}

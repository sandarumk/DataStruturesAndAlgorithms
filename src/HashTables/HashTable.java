package HashTables;

/**
 * Hash table implementation where both the key and the value are strings
 * Created by dinu on 12/30/16.
 */
public class HashTable {
    HashEntry[] hashmap;
    static int CAPACITY = 100;

    public HashTable(){
        hashmap = new HashEntry[CAPACITY];
    }

    public void insert(String key, String value){
        int index = hash(key);
        if(hashmap[index] == null){
            hashmap[index] = new HashEntry(key,value);
        }else{
            HashEntry current = hashmap[index];
            while(current.next !=null){
                current = current.next;
            }
            current.next = new HashEntry(key,value);
        }

    }

    public String get(String key){
        int index = hash(key);
        HashEntry entry = hashmap[index];
        if(entry == null){
            return null;
        }else{
            while(entry != null){
                if(entry.key == key){
                    return entry.value;
                }else{
                    entry = entry.next;
                }
            }
        }
        return null;
    }

    public boolean containKey(String key){
        int index = hash(key);
        HashEntry entry = hashmap[index];
        if(entry == null){
            return false;
        }else{
            while(entry != null){
                if(entry.key == key){
                    return true;
                }else{
                    entry = entry.next;
                }
            }
        }
        return false;
    }

    private int hash(String key){
        int sum = 0;
        for (int i = 0; i <key.length() ; i++) {
            sum += 31 * key.charAt(i);
        }
        return sum % CAPACITY;
    }
}

class HashEntry{
    String value;
    String key;
    HashEntry next;

    public HashEntry(String key, String value){
        this.key = key;
        this.value = value;
    }
}
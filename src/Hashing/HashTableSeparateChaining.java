package Hashing;

/**
 * @author Micgogi
 * on 2/25/2020  11:32 PM
 * Micgogi
 */
class Entry<K,V>{
    int hash;
    K key; V value;
    public Entry(K key, V value){
        this.key = key;
        this.value = value;
        this.hash = key.hashCode();
    }

    public boolean equals (Entry<K,V> other){
        if(hash!=other.hash)return false;
        return  key.equals(other.key);
    }
    @Override
    public String toString(){
        return  key+"-->"+value;
    }

}
public class HashTableSeparateChaining {

}

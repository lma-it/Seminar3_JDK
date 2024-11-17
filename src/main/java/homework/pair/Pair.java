package homework.pair;

public class Pair<K, V> {
    K key;
    V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getFirst(){
        return this.key;
    }

    public V getSecond(){
        return this.value;
    }

    @Override
    public String toString() {
        // Если будут произвольные классы в качестве ключей или значений,
        // то в самом этом классе должен быть реализован метод toString().
        return String.format("[Ключ: %s, Значение: %s]", getFirst().toString(), getSecond().toString());
    }
}

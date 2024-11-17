package classwork.ex2;

import java.io.DataInput;
import java.io.InputStream;

public class TestClass<T extends Comparable<T>, V extends InputStream & DataInput, K extends Number> {
    T t;
    K k;
    V v;

    TestClass(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }

    public <T, V, K> void printTypes(){
        System.out.println(getT().getClass().getSimpleName());
        System.out.println(getK().getClass().getSimpleName());
        System.out.println(getV().getClass().getSimpleName());
    }
}

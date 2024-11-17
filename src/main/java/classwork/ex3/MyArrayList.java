package classwork.ex3;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> implements MyCollection<T> {
    private static final int DEFAULT_MIN_SIZE = 10;
    private Object[] array;
    private static int INDEX = 0;

    MyArrayList(){
        array = new Object[DEFAULT_MIN_SIZE];
    }

    public void add(T t){
        if(INDEX < array.length){
            array[INDEX] = t;
        }else {
            Object[] temp = new Object[array.length + array.length];
            System.arraycopy(array, 0, temp, 0, array.length);
            temp[INDEX] = t;
            array = new Object[temp.length];
            System.arraycopy(temp, 0, array, 0, array.length);
        }
        INDEX++;
    }

    public void remove(T t) {
        Object[] temp;
        for (int i = 0; i < array.length; i++){
            if (array[i] == t) {
                array[i] = null;
                temp = Arrays.stream(Arrays.stream(array).toArray()).filter(Objects::nonNull).toArray();
                array = Arrays.stream(Arrays.stream(temp).toArray()).filter(Objects::nonNull).toArray();
                INDEX--;
                return;
            }
        }

    }

    public void removeAll(T t) {
        Object[] temp = new Object[0];
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == t) {
                array[i] = null;
                temp = Arrays.stream(Arrays.stream(array).toArray()).filter(Objects::nonNull).toArray();
                count++;
            }
        }
        array = Arrays.stream(Arrays.stream(temp).toArray()).filter(Objects::nonNull).toArray();
        INDEX -= count;
    }


    public int size(){
        return array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(Arrays.stream(array).toArray()).filter(Objects::nonNull).toArray());
    }
}

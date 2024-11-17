package homework.comparator;

import java.util.ArrayList;
import java.util.List;

public class ArrayComparator {

    public <T, U extends Animal> boolean compareArrays(T[] arrT, U[] arrU){
        // Если ДЛИНА массивов НЕ СОВПАДАЕТ, то ОНИ НЕ РАВНЫ и смысла нет сравнивать их содержимое.
        if (arrT.length == arrU.length){
            List<Boolean> equal = new ArrayList<>(arrT.length);
            for(T t : arrT){
                for (U u : arrU){
                    equal.add(t.getClass().getSimpleName().equals(u.getClass().getSimpleName()));
                }
            }
            return !equal.contains(false);
        }
        return false;
    }

}

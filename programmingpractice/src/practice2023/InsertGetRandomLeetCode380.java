package programmingpractice.src.practice2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsertGetRandomLeetCode380 {

    List<Integer> list;
    Map<Integer , Integer> map;

    public InsertGetRandomLeetCode380() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {

        if(map.containsKey(val)){
            return false;
        }
        map.put(val , list.size()-1);
        list.add(val);
        return true;

    }

    public boolean remove(int val) {

        if(!map.containsKey(val)){
            return false;
        }

        int index = map.get(val);
        int  lastElement = list.get(list.size()-1);
        map.put(lastElement , index);
        list.set(index , lastElement);
        map.remove(val);
        list.remove(list.size()-1);

        return  true;
    }

    public int getRandom() {
int randomIndx = (int) (Math.random()* list.size());
return  list.get(randomIndx);
    }

    public static void main(String[] args) {

    }
}

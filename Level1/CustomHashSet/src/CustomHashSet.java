import com.sun.xml.internal.ws.client.ClientSchemaValidationTube;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CustomHashSet {

    private int size;

    private List<TreeSet<Integer>> buckets;


    public CustomHashSet() {
        this.size = 10;
        buckets = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            buckets.add(treeSet);
        }
    }

    public CustomHashSet(int size) {
        this.size = size;
        buckets = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            buckets.add(treeSet);
        }
    }

    public int hashValue(int element) {
        return (hash1(element) + hash2(element)) % size;
    }


    private int hash1(int element) {
        return element % size;
    }

    private int hash2(int element) {
        int sum = 0;
        while (element > 0) {
            sum = sum + element % 10;
            element = element / 10;
        }
        return sum;
    }


    public boolean contains(int element) {
        int index = hashValue(element);
        TreeSet<Integer> treeSet = buckets.get(index);

        if (treeSet.contains(element))
            return true;
        else return false;
    }


    public int find(int element) {
        if (contains(element)) {
            int index = hashValue(element);
            TreeSet<Integer> treeSet = buckets.get(index);

            for (int item : treeSet) {
                if (element == item)
                    return item;
            }
        }
        return -1;
    }

    public boolean add(int element) {
        int index = hashValue(element);

        TreeSet<Integer> treeSet = buckets.get(index);

        if (!contains(element)) {
            treeSet.add(element);
            return true;
        } else
            return false;


    }

    public boolean delete(int element){

        int index=hashValue(element);

        if(contains(element)){
            TreeSet<Integer> treeSet= new TreeSet<>();

            return treeSet.remove(element);
        }

        return false;
    }

    @Override
    public String toString() {
        return buckets.toString();
    }
}
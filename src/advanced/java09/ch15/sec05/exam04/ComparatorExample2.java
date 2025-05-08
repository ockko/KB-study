package advanced.java09.ch15.sec05.exam04;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample2 {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if (o1.price < o2.price) {
                    return -1;
                } else if (o1.price > o2.price) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}

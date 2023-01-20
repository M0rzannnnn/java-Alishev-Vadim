package day19;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("dushi.txt");
        Map<String, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(file);
        sc.useDelimiter("[!\"#$%&'()*+,-./ї:ЕЂ;Ц<Д=>?@\\\\^_`{|}~\\s]+");
        while (sc.hasNext()) {
            map.merge(sc.next(), 1, Integer::sum);
        }
        sc.close();

//        NavigableMap<String, Integer> map2 = new TreeMap<> (Collections.reverseOrder();
//        map2.putAll(map);
//        Comparator cmp =  map2.comparator(Map.Entry.g)
//        };
//        System.out.println(map2);

//        List<Integer> list = new LinkedList<>(map.values());
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        System.out.println(list);

//        Map<String,Integer> sortedMap = new TreeMap<>();
//        sortedMap.putAll(map);
//        System.out.println(sortedMap);
//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                        return o2 - o1;
//                    }
//                }))

// „ичиков = 608
        List <Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Comparator valueComparator = new MaxValueComparator();
        list.sort(valueComparator);
        for (int i = 0; i < 100; i++) {
            System.out.println(list.get(i));
        }
    }
}




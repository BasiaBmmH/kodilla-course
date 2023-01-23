//package Moduł2.Zad4.przykłady;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        //Create and initialize the HashMap HashMap
//        /colors_map = new HashMap();
//        colors_map.put(5, 'B');
//        colors_map.put(11, 'O');
//        colors_map.put(3, 'I');
//        colors_map.put(13, 'R');
//        colors_map.put(7, 'G');
//        colors_map.put(1, 'V');
//        colors_map.put(9, 'Y');
//        //print the HashMap using iterator after converting to set
//        System.out.println('Unsorted HashMap:');
//        Set set = colors_map.entrySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry map_entry = (Map.Entry) iterator.next();
//            System.out.print(map_entry.getKey() + ': ');
//            System.out.println(map_entry.getValue());
//        }
//        //call sortByValues method that returns a sorted Map.
//        Map c_map = sortByValues(colors_map);
//        System.out.println('HashMap sorted on values:');
//        //print the sorted HashMap
//        Set set2 = c_map.entrySet();
//        Iterator iterator2 = set2.iterator();
//        while (iterator2.hasNext()) {
//            Map.Entry map_entry2 = (Map.Entry) iterator2.next();
//            System.out.print(map_entry2.getKey() + ': ');
//            System.out.println(map_entry2.getValue());
//        }
//    }
//
//    private static HashMap sortByValues(HashMap hash_map) {
//        //create a LinkedList from HashMap
//        List list = new LinkedList(hash_map.entrySet());
//        // use Collections.sort method with Comparator to sort the list
//        Collections.sort(list, new Comparator() {
//            public int compare(Object o1, Object o2) {
//                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
//            }
//        });
//        //create a HashMap from linkedlist which preserves the order
//        HashMap sortedHashMap = new LinkedHashMap();
//        for (Iterator it = list.iterator(); it.hasNext(); ) {
//            Map.Entry entry = (Map.Entry) it.next();
//            sortedHashMap.put(entry.getKey(), entry.getValue());
//        }
//        return sortedHashMap;
//    }
//}
//
//public class Zneta {
//
//}

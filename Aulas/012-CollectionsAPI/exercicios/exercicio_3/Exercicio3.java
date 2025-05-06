package exercicios.exercicio_3;

import java.util.*;

public class Exercicio3 {

    public static final int NUM_ITERATIONS = 100000;

    public static long elapseFillCollection(Object collection){
        long start, end;

        start = System.currentTimeMillis();
        String collectionName = collection.getClass().getName().replace("java.util.","");
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            switch (collectionName) {
                case "ArrayList":
                    List<Object> lista = (ArrayList<Object>) collection;
                    lista.add(i);
                    break;
                case "HashSet":
                    Set<Object> set = (HashSet<Object>) collection;
                    set.add(i);
                    break;
                case "HashMap":
                    Map<Object, Object> map = (HashMap<Object, Object>) collection;
                    map.put(i,i);
                    break;
                default:
                    System.out.println("Unkown collection: " + collectionName);
                    break;
            }
        }
        end = System.currentTimeMillis();
        //System.out.println("Times: "+end +" | "+start);
        return end - start;
    }

    public static double elapseSearchCollection(Object collection){
        long start, end;
        start = System.currentTimeMillis();
        String collectionName = collection.getClass().getName().replace("java.util.","");
        switch (collectionName) {
            case "ArrayList":
                ArrayList<Object> lista = (ArrayList<Object>) collection;
                for (int i = 0; i < NUM_ITERATIONS; i++) {
                    lista.contains(i);
                }
                break;
            case "HashSet":
                Set<Object> set = (HashSet<Object>) collection;
                for (int i = 0; i < NUM_ITERATIONS; i++) {
                    set.contains(i);
                }
                break;
            case "HashMap":
                Map<Object, Object> map = (HashMap<Object, Object>) collection;
                for (int i = 0; i < NUM_ITERATIONS; i++) {
                    map.containsKey(i);
                }
        }
        end = System.currentTimeMillis();
        return end - start;
    }


    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        Set<Integer> nums2 = new HashSet<>();
        Map<Integer,Integer> nums3 = new HashMap<>();

        System.out.println("Tempo para inserir ArrayList: "+elapseFillCollection(nums1));
        System.out.println("Tempo para inserir HashSet: "+elapseFillCollection(nums2));
        System.out.println("Tempo para inserir HashMap: "+elapseFillCollection(nums3));

        System.out.println("Tempo para buscar ArrayList: "+elapseSearchCollection(nums1));
        System.out.println("Tempo para buscar HashSet: "+elapseSearchCollection(nums2));
        System.out.println("Tempo para buscar HashMap: "+elapseSearchCollection(nums3));
    }
}

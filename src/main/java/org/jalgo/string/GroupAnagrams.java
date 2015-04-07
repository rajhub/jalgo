package org.jalgo.string;

import java.util.*;

/**
 * Created by rpitchai on 4/6/2015.
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("trees");
        list.add("cars");
        list.add("bike");
        list.add("arcs");
        list.add("steer");
        System.out.println(groupAnagrams(list));
    }

    public static Collection<List<String>> groupAnagrams(List<String> words) {
        final HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String word : words) {
            String key = sort(word);
            if (map.containsKey(key))
                map.get(key).add(word);
            else
                map.put(key, new LinkedList<String>(Arrays.asList(new String[]{word})));
        }
        ;
        return map.values();
    }

    public static String sort(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}

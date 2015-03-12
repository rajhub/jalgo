package main.java.org.jalgo;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    List<String> list = new ArrayList<String>();

    public List<String> permute(String str) {
        list.clear();
        permute("", str);
        return list;
    }

    private void permute(String prefix, String str) {
        if (str.length() == 0) {
            list.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        StringPermutation sp = new StringPermutation();
        System.out.println(sp.permute("123"));
    }
}

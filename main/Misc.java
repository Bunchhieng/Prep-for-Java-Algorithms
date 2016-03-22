package main;

import java.util.*;

public class Misc {
    public HashMap<Integer, String> buildMap(Student[] students) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for (Student s : students) {
            map.put(s.getId(), s);
        }
        return map;
    }

    public ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) {
            sentence.add(w);
        }
        for (String w : more) {
            sentence.add(w);
        }
        return sentence;
    }

    public String joinWords(String[] words) {
        StringBuffer sentence = new StringBuffer();
        for (String w : words) {
            sentence.append(w);
        }
        return sentence.toString();
    }
}

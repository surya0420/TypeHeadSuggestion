package com.comviva.type;

import java.util.ArrayList;
import java.util.List;

public class TypeHeadSearch {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Surya");
        list.add("Prudvi");
        list.add("Comviva");
        list.add("bangalore");
        list.add("Comviva test");
        list.add("bangalore days");
        list.add("Surya test");
        list.add("Prudvi test");
        list.add("bangalore climate");

        List<String> sugg = query("Surya", list);
        sugg.forEach(System.out::println);
    }


    static List<String> query(String queryStr, List<String> list) {
        List<String> suggestion = new ArrayList<>();
        list.forEach(std -> {
            if (isMatched(queryStr, std)) {
                suggestion.add(std);
            }

        });

        return suggestion;
    }

    private static boolean isMatched(String query, String text) {
        return text.toLowerCase().contains(query.toLowerCase());
    }

}

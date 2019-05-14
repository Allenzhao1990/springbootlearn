package com.itLearn.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {


    public static void main(String[] args){

//        new Thread (() -> System.out.println("lambda表达式..")).start();

//        List<Integer> list = Arrays.asList(1,3,2,5,4,8,6);
//        list.forEach(n-> System.out.println(n));

        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp","JSP");
        languages.stream().filter(n->n.startsWith("J")).forEach(t-> System.out.println(t+" "));

        List<String> list = languages.stream().map(t -> t.toUpperCase()).collect(Collectors.toList());
        list.stream().filter(t->t.length()==4).forEach(s -> System.out.println(s));

    }
}

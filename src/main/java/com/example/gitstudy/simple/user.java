package com.example.gitstudy.simple;

import java.util.Arrays;

public class user {

    public static void main(String[] args) {

        String[] names = {"Ismoil","Asadbek","Jack"};

        Arrays.stream(names)
                .filter(name -> !name.equals("Jack"))
                .map(name ->"Salom " + name)
                .forEach(System.out::println);


    }


}


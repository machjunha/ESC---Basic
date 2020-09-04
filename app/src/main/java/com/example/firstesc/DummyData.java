package com.example.firstesc;

import java.util.ArrayList;

public class DummyData {

    public static ArrayList<Contact> contacts = new ArrayList<>();

    static{
        contacts.add(new Contact("이준하", "010-8995-3667", "mahacarry@gmail.com"));
        contacts.add(new Contact("어머니", "010-2018-3537", "softyi@naver.com"));
        contacts.add(new Contact("아버지", "010-5490-5396", "softyi@naver.com"));
    }
}

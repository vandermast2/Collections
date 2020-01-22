package com.example.collectionsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Cat> cats;
    private HashMap<Integer, Cat> map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cats = catArrayList();
        map = catHashMap();

    }

    private ArrayList<Cat> catArrayList() {
        ArrayList cats = new ArrayList();
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat("Simon", (int) (Math.random() * 10)));
        }
        return cats;
    }

    private HashMap<Integer, Cat> catHashMap() {
        HashMap<Integer, Cat> mapCats = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            mapCats.put(i, new Cat("Mike", (int) (Math.random() * 10)));
        }
        return mapCats;
    }

    private void print(HashMap<Integer, Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println("Cat name:" + cats.get(i).getName());
        }
    }
}

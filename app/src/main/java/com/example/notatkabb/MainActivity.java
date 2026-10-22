package com.example.notatkabb;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView1 = findViewById(R.id.listView1);
        ArrayList<Notatka> listaNotatek = new ArrayList<>();
        listaNotatek.add(new Notatka("tenis", "gra z ewą w poniedziałek", true));
        ArrayAdapter<Notatka> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaNotatek);

        listView1.setAdapter(arrayAdapter);
    }
}
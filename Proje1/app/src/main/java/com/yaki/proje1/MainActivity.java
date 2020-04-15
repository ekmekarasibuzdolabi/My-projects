package com.yaki.proje1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  {

    ListView mainListView;

    String[] ulkeadlari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainListView=findViewById(R.id.ListView);

        Resources resources=getResources();

        ulkeadlari=resources.getStringArray(R.array.ulkeadlari);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ulkeadlari);

        mainListView.setAdapter(adapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent ıntent = new Intent(MainActivity.this,Main2.class);

                ıntent.putExtra("pozisyon",position);

                startActivity(ıntent);
            }
        });

    }


}

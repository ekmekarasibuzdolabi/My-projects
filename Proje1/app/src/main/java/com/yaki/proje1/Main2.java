package com.yaki.proje1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Main2 extends AppCompatActivity {

    ListView listView;
    int pozisyon;
    ImageView resim;
    TextView baskentt;
    TextView nufuss;

    int [] bayraklar = {R.drawable.abd,R.drawable.azerbaycan,R.drawable.canada,R.drawable.china,R.drawable.german,R.drawable.greece,
            R.drawable.israel,R.drawable.italy,R.drawable.tr,R.drawable.uk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tek_satir_layout);
        Resources resources = getResources();

        String [] baskentler = resources.getStringArray(R.array.baskentadlari);

        String [] nufus = resources.getStringArray(R.array.nufuslar);

        Intent ıntent = getIntent();
        pozisyon = ıntent.getIntExtra("pozisyon",0);

       resim = findViewById(R.id.bayrakImageview);
       baskentt=findViewById(R.id.baskentText);
       nufuss=findViewById(R.id.nufusText);

       resim.setImageResource(bayraklar[pozisyon]);
       baskentt.setText("Başkent : "+baskentler[pozisyon]);
       nufuss.setText("Nüfus : "+ nufus[pozisyon]);





    }
}

package com.example.user.bustogoappliction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.user.bustogoappliction.Database.BusTale;
import com.example.user.bustogoappliction.Database.PlaceTable;

public class Road extends AppCompatActivity {
    private PlaceTable objPlaceTable;
    private BusTale objBusTale;
    ListView listView;
    private String[]titles_bus,detail_bus,image_bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road);
        BindWidget();
        c();
        Clistview();

    }//main Method onCreate

    private void Clistview() {

        final String[] titles = objPlaceTable.readAllPlace(1);
        final String[] detail = objPlaceTable.readAllPlace(2);
        final String[] image = objPlaceTable.readAllPlace(5);

        MyadpterRoad myadpter = new MyadpterRoad(Road.this, image, titles, detail);
        listView.setAdapter(myadpter);

    }


    private void c() {
        objPlaceTable = new PlaceTable(this);
        objBusTale = new BusTale(this);
    }

    private void BindWidget() {
        listView = (ListView) findViewById(R.id.livRoad);
    }

    /*public void button2 (View view) {
        Intent intent = new Intent(Road.this,Mainmenu.class);
        startActivity(intent);
    }
    */

    public void btnRoad (View view) {
        Intent intent = new Intent(Road.this,Mainmenu.class);
        startActivity(intent);
    }

}




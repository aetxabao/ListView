package com.pmdm.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        String[] values =  new String[]{
                "Pamplona - Iruña", "Olite - Olite", "Tudela - Tutera", "Sangüesa - Zangoza", "Estella - Lizarra"
        };
        Merindad[] datos = new Merindad[]{
                new Merindad("1", "Pamplona - Iruña"), new Merindad("2", "Olite - Olite"),
                new Merindad("3", "Tudela - Tutera"), new Merindad("4", "Sangüesa - Zangoza"),
                new Merindad("5", "Estella - Lizarra")
        };
*/
        Merindad[] datos = new Merindad[]{
                new Merindad("1", "Pamplona", "Iruña"), new Merindad("2", "Olite", "Olite"),
                new Merindad("3", "Tudela", "Tutera"), new Merindad("4", "Sangüesa", "Zangoza"),
                new Merindad("5", "Estella", "Lizarra")
        };
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        MerindadAdapter adapter = new MerindadAdapter(this, datos);

        final ListView listView = (ListView) findViewById(R.id.ListZonas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String optionSelection = (String) parent.getItemAtPosition(position);
                String optionSelection = ((Merindad) parent.getAdapter().getItem(position)).getNombre();
                Toast.makeText(getApplicationContext(), "Valor: " + optionSelection, Toast.LENGTH_LONG).show();
            }
        });

    }

}

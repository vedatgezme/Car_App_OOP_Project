package com.kronos.carappoopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Need to create an Arraylist
    ArrayList<cars> car_list = new ArrayList<>();

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCar();

        listview = (ListView) findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter(car_list,MainActivity.this);
        listview.setAdapter(customAdapter);


        // if i click an item on listview
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Car_details.class);
                intent.putExtra("car_selected",car_list.get(position));
                startActivity(intent);
            }
        });

    }





    private void addCar()
    {
        // Create cars objects
        cars x6 = new cars("X6","BMW",4,140,R.drawable.x6);
        cars c180 = new cars("C180","Mercedes",4,130,R.drawable.c180);
        cars civic = new cars("Civic","Honda",4,120,R.drawable.civic);
        cars urus = new cars("Urus","Lamborghini",4,160,R.drawable.urus);

        // Add cars objects to arraylist
        car_list.add(x6);
        car_list.add(c180);
        car_list.add(civic);
        car_list.add(urus);

    }
}

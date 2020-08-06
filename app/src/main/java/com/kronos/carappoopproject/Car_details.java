package com.kronos.carappoopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Car_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        // initalize the objects on layout
        TextView CarModel = (TextView) findViewById(R.id.carmodel);
        TextView other = (TextView) findViewById(R.id.other_information);
        ImageView carPic = (ImageView) findViewById(R.id.imageview_car);

        Intent intent = getIntent();
        cars cars = (cars) intent.getSerializableExtra("car_selected");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),cars.getCar_image());
        carPic.setImageBitmap(bitmap);

        CarModel.setText(cars.getCompany()+" "+cars.getCar_model());
        other.setText("Capacity : "+cars.getCapacity()+"\n"+"Max Speed : "+cars.getMax_speed());


    }
}

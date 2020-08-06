package com.kronos.carappoopproject;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    private ArrayList<cars> cars_list;
    private Activity context;

    public CustomAdapter(ArrayList<cars> cars_list,Activity context)
    {
        super(context,R.layout.custom_adapter_layout,cars_list);

        this.cars_list=cars_list;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater =context.getLayoutInflater();
        View view =layoutInflater.inflate(R.layout.custom_adapter_layout,null,true);
        ImageView car_image = view.findViewById(R.id.custom_imageview);
        TextView  model = view.findViewById(R.id.model_view);
        TextView  company = view.findViewById(R.id.compay_view);

        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(),cars_list.get(position).getCar_image());
        car_image.setImageBitmap(bitmap);
        model.setText(cars_list.get(position).getCar_model());
        company.setText(cars_list.get(position).getCompany());

        return view;
    }
}

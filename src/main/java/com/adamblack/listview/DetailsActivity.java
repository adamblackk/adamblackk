package com.adamblack.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.adamblack.listview.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;
    TextView nameText;
    TextView countryText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent=getIntent();
        Landmark deli=(Landmark) intent.getSerializableExtra("adem");
        binding.nameText.setText(deli.name);
        binding.countryText.setText(deli.country);
        binding.imageView.setImageResource(deli.image);





    }

}
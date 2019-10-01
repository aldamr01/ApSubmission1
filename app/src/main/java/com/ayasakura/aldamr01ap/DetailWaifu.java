package com.ayasakura.aldamr01ap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ayasakura.aldamr01ap.R;

public class DetailWaifu extends AppCompatActivity {
    private TextView name, description;
    private ImageView profile;
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_waifu);

        name        = (TextView)findViewById(R.id.tv_name_waifu);
        description = (TextView)findViewById(R.id.tv_description_waifu);
        profile     = (ImageView)findViewById(R.id.iv_profile_waifu);
        back        = (ImageButton)findViewById(R.id.ib_back);

        name.setText(getIntent().getStringExtra("name"));
        description.setText(getIntent().getStringExtra("description"));
        Glide.with(DetailWaifu.this).load(getIntent().getIntExtra("profile", 0)).into(profile);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}

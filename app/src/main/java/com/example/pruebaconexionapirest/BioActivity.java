package com.example.pruebaconexionapirest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.squareup.picasso.Picasso;

public class BioActivity extends AppCompatActivity {
    TextView nombre;
    ImageView imagen;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bio_activity);
        Toolbar toolbar = null;

            toolbar = (Toolbar) findViewById(R.id.toolbar);
           //setSupportActionBar(toolbar);
            //getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        nombre = (TextView) findViewById(R.id.txtView);
        imagen = (ImageView) findViewById(R.id.imgFoto1);

        nombre.setText(getIntent().getExtras().getString("curNombre"));

        //imagen.setImageResource(getIntent().getExtras().getInt("curImagen"));

        Picasso.with(imagen.getContext())
                .load(getIntent().getExtras().getString("curImagen")).into(imagen);
    }

}

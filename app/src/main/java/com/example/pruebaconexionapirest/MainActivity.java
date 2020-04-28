package com.example.pruebaconexionapirest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   public List<Entidad> entidad=new ArrayList() ;


    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private Adaptador adaptador;
    private RecyclerView.LayoutManager iManager;

    @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setTitle("Tipos de Coches");
            setContentView(R.layout.activity_main);

            recycler= (RecyclerView) findViewById(R.id.ReciclerView);
            recycler.setHasFixedSize(true);

            iManager = new LinearLayoutManager(this);
            recycler.setLayoutManager(iManager);
         //  recycler.setAdapter(adapter);
            llamarHttpClass();

        }

    private void llamarHttpClass() {
        GetHttpClass claes= new GetHttpClass(entidad,recycler, adapter,MainActivity.this);
        claes.execute();
    }


    }

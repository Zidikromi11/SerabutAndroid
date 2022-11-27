package com.yazid.serabut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detailkerja extends AppCompatActivity {
Button btn_kerja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailkerja);
        btn_kerja = (Button) findViewById(R.id.btn_kerja);
        btn_kerja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(detailkerja.this, Sudahmengerjakan.class));
            }
        });
    }
}

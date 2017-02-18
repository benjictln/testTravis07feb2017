package com.example.benja.testintent;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.net.Uri.parse;

public class MainActivity extends AppCompatActivity {

    private Button b1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri u1 = parse("tel:+33752633548");
                Intent i1 = new Intent(Intent.ACTION_DIAL);
                i1.setData(u1);
                startActivity(i1);
            }
        });
    }
}


package com.test.mylasttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterLoginPage extends AppCompatActivity {
    public Button gallery;
    public Button location;
    public Button testis;
    public Button contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login_page);

        gallery = (Button) findViewById(R.id.gallery);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(afterLoginPage.this, Gallery_activity.class);
                startActivity(intent);
            }
        });

        contact = (Button) findViewById(R.id.btnContact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(afterLoginPage.this, contactus.class);
                startActivity(intent);
            }
        });

        testis = (Button) findViewById(R.id.testimonial);
        testis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(afterLoginPage.this, tessi.class);
                startActivity(intent);
            }
        });

        location = (Button) findViewById(R.id.locations);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(afterLoginPage.this, OurLocation.class);
                startActivity(intent);
            }
        });

    }
}
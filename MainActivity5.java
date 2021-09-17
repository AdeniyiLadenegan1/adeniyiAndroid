package com.example.projectwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {
    static {
        System.loadLibrary("native-lib");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public void map (View v) {
        Uri triosMap = Uri.parse("geo:43.6721916, -79.3765869");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, triosMap);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    public void next(View v) {
        Intent i = new Intent( this, MainActivity6.class);
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Intent home = new Intent(this, MainActivity.class);
                startActivity(home);
                return true;
            case R.id.registration:
                Intent registration = new Intent(this, MainActivity2.class);
                startActivity(registration);
                return true;
            case R.id.course:
                Intent course = new Intent(this, MainActivity3.class);
                startActivity(course);
                return true;
            case R.id.extras:
                Intent extras = new Intent(this, MainActivity5.class);
                startActivity(extras);
                return true;
            case R.id.score:
                Intent score = new Intent(this, MainActivity7.class);
                startActivity(score);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void next4(View view) {

            Intent i = new Intent(this, MainActivity7.class);
            startActivity(i);
        }
    }




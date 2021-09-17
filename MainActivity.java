package com.example.projectwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //String Appid = "adeniyimongo-tpmnh";

    TextView head;
    EditText UN, password;
    Button btnLogin;
    String correct_username = "admin";
    String correct_password = "Pass@12";
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        head = findViewById(R.id.headid);
        UN = findViewById(R.id.unid);
        password = findViewById(R.id.pwordid);
        btnLogin = findViewById(R.id.loginid);



        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(UN.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Empty data", Toast.LENGTH_SHORT).show();
                } else if (UN.getText().toString().equals(correct_username)) {

                    if (password.getText().toString().equals(correct_password)) {
                        Toast.makeText(MainActivity.this, "successfully logged in", Toast.LENGTH_SHORT).show();
                        //try put code for next page


                    } else {
                        Toast.makeText(MainActivity.this, "invalid username and password", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "invalid username and password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        }

//the menu function
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
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

    public void next(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}



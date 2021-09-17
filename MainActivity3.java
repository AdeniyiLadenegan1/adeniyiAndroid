package com.example.projectwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity3 extends AppCompatActivity {
    TextView courses;
    TextView counter;
    EditText input;
    int counterInt = 0;
    ProgressBar pb;
    ImageView img;
    TextView result;
    TextView tcl;


    static {
        System.loadLibrary("native-lib");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        courses = findViewById(R.id.coursepageid);
        counter = findViewById(R.id.counterid);
        result = findViewById(R.id.resultid);
        input = findViewById(R.id.cunitid);
        pb = findViewById(R.id.progressBar);
        tcl = findViewById(R.id.tclid);
        //img = findViewById(R.id.imageView);
        //img.setVisibility(View.INVISIBLE);

    }

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

    public void calc(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(javaMethod(userAnswer));
        //string answer = input.getText().toString();
        //tcl = result
        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);

        //if (counterInt > 19) {
            //img.setVisibility(View.VISIBLE);
        }

    public void calc2(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(cppMethod(userAnswer));

        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);
    }

    public void calc3(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(iosMethod(userAnswer));

        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);
    }

    public void calc4(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(jscriptMethod(userAnswer));

        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);
    }

    public void calc5(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(csharpMethod(userAnswer));

        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);
    }

    public void calc6(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(adevMethod(userAnswer));

        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);

    }

    public void calc7(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(phpMethod(userAnswer));

        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);
    }

    public void calc8(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(mysqlMethod(userAnswer));

        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);
    }
    public void calc9(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(pshopMethod(userAnswer));

        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);
    }

    public void calc10(View v) {
        String answer = input.getText().toString();
        Integer x = null;
        Integer integer = x;
        int userAnswer = integer.parseInt(answer);
        result.setText(mobdevMethod(userAnswer));

        counterInt ++;
        counter.setText("Count is: " + counterInt);
        pb.setProgress(counterInt);
    }

    public native String javaMethod(int x);
    public native String cppMethod(int x);
    public native String iosMethod(int x);
    public native String jscriptMethod(int x);
    public native String csharpMethod(int x);
    public native String adevMethod(int x);
    public native String phpMethod(int x);
    public native String mysqlMethod(int x);
    public native String pshopMethod(int x);
    public native String mobdevMethod(int x);



        public void next(View view) {

        }
            public void exnext (View view){
                Intent i = new Intent(this, MainActivity5.class);
                startActivity(i);
            } 
        }   







        //int userAnswer = integer.parseInt(answer);
        //result.setText(newMethod(userAnswer))
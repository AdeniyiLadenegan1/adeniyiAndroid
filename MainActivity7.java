package com.example.projectwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10;
    Button btn1;
    Button re;

    TextView aa, bb, cc, dd, ee, ff, gg, hh, ii, jj, fail, success;
    int grade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        e1 = findViewById(R.id.javaid);
        e2 = findViewById(R.id.cppid);
        e3 = findViewById(R.id.iosid);
        e4 = findViewById(R.id.jsid);
        e5 = findViewById(R.id.csharpid);
        e6 = findViewById(R.id.adevid);
        e7 = findViewById(R.id.phpid);
        e8 = findViewById(R.id.mysqlid);
        e9 = findViewById(R.id.pshopid);
        e10 = findViewById(R.id.mobdevid);

        btn1 = findViewById(R.id.but);
        re = findViewById(R.id.reset);

        aa = findViewById(R.id.score1);
        bb = findViewById(R.id.score2);
        cc = findViewById(R.id.score3);
        dd = findViewById(R.id.score4);
        ee = findViewById(R.id.score5);
        ff = findViewById(R.id.score6);
        gg = findViewById(R.id.score7);
        hh = findViewById(R.id.score8);
        ii = findViewById(R.id.score9);
        jj = findViewById(R.id.score10);
        fail = findViewById(R.id.retakeid);
        success = findViewById(R.id.successid);

        re.setOnClickListener((v) -> {

            aa.setText("");
            bb.setText("");
            cc.setText("");
            dd.setText("");
            ee.setText("");
            ff.setText("");
            gg.setText("");
            hh.setText("");
            ii.setText("");
            jj.setText("");

            e1.setText("");
            e2.setText("");
            e3.setText("");
            e4.setText("");
            e5.setText("");
            e6.setText("");
            e7.setText("");
            e8.setText("");
            e9.setText("");
            e10.setText("");

        });

        LayoutInflater lf = getLayoutInflater();
            final View uv = lf.inflate(R.layout.activity_gladsmiley,
                findViewById(R.id.gladid));

            final View vv = lf.inflate(R.layout.activity_sadsmiley,
                findViewById(R.id.sadid));


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = new Integer(e1.getText().toString()).intValue();
                //Integer integer;
                int b = Integer.parseInt(e2.getText().toString());
                int c = Integer.parseInt(e3.getText().toString());
                int d = Integer.parseInt(e4.getText().toString());
                int e = Integer.parseInt(e5.getText().toString());
                int f = Integer.parseInt(e6.getText().toString());
                int g = Integer.parseInt(e7.getText().toString());
                int h = Integer.parseInt(e8.getText().toString());
                int i = Integer.parseInt(e9.getText().toString());
                int j = Integer.parseInt(e10.getText().toString());

                String aaa = check(a);
                String bbb = check(b);
                String ccc = check(c);
                String ddd = check(d);
                String eee = check(e);
                String fff = check(f);
                String ggg = check(g);
                String hhh = check(h);
                String iii = check(i);
                String jjj = check(j);

                if (aaa.equals("F") || bbb.equals("F") || ccc.equals("F") || ddd.equals("F") || eee.equals("F") || fff.equals("F")
                        || ggg.equals("F") || hhh.equals("F") || iii.equals("F") || jjj.equals("F")) {

                    fail.setText("Retake course");
                    Toast t = new Toast(getApplicationContext());
                    t.setDuration(Toast.LENGTH_LONG);
                    t.setView(vv);
                    t.show();

                } else {

                    success.setText("Congratulations you passed");
                    Toast tt = new Toast(getApplicationContext());
                    tt.setDuration(Toast.LENGTH_LONG);
                    tt.setView(uv);
                    tt.show();
                }

                aa.setText(aaa);
                bb.setText(bbb);
                cc.setText(ccc);
                dd.setText(ddd);
                ee.setText(eee);
                ff.setText(fff);
                gg.setText(ggg);
                hh.setText(hhh);
                ii.setText(iii);
                jj.setText(jjj);

                calculate(aaa);
                calculate(bbb);
                calculate(ccc);
                calculate(ddd);
                calculate(eee);
                calculate(fff);
                calculate(ggg);
                calculate(hhh);
                calculate(iii);
                calculate(jjj);
                double mark = (double) grade / 10;
                final double show = mark;

                Toast.makeText(getApplicationContext(), "Your SGPA is " + show, Toast.LENGTH_LONG).show();
                grade = 0;
            }


            String check(int n) {
                if (n >= 90 || n <= 100) {
                    return "O";
                }
                if (n >= 80 || n <= 89) {
                    return "S";
                }
                if (n >= 70 || n <= 79) {
                    return "A";
                }
                if (n >= 60 || n <= 69) {
                    return "B";
                }
                if (n >= 50 || n <= 59) {
                    return "C";
                }
                if (n >= 40 || n <= 49) {
                    return "D";
                }
                if (n < 40) {
                    return "F";
                }
                return "M";
            }

            int calculate(String z) {
                if (z.equals("O")) {
                    grade += 10;
                }
                if (z.equals("S")) {
                    grade += 9;
                }
                if (z.equals("A")) {
                    grade += 8;
                }
                if (z.equals("B")) {
                    grade += 7;
                }
                if (z.equals("C")) {
                    grade += 6;
                }
                if (z.equals("D")) {
                    grade += 5;
                }
                if (z.equals("F")) {
                    grade += 4;
                }
                return grade;
            }
        });
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
}


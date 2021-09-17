package com.example.projectwork;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {
    TextView regis;

    EditText fname;
    EditText lname;
    EditText phone;
    EditText email;
    EditText address;
    EditText course;
    Button save;
    String Text;
    Button next;


    private static final int WRITE_EXTERNAL_STORAGE_CODE = 1;

    static {
        System.loadLibrary("native-lib");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        regis = findViewById(R.id.regid);
        //regis.setText(regis());
        fname = findViewById(R.id.fnameid);
        lname = findViewById(R.id.lnameid);
        phone = findViewById(R.id.phoneid);
        email = findViewById(R.id.mailid);
        save = findViewById(R.id.saveid);
        address = findViewById(R.id.addressid);
        save = findViewById(R.id.saveid);
        course = findViewById(R.id.courseid);




        save.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                Text = fname.getText().toString().trim(); //trim eliminates spaces before or after texts.

                if (Text.isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Please fill in your details", Toast.LENGTH_SHORT).show();
                } else { //user has entered data.
                    //if user OS is >= marshmallow, we need runtime permission
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                                == PackageManager.PERMISSION_GRANTED) {
                            String[] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                            requestPermissions(permissions, WRITE_EXTERNAL_STORAGE_CODE);
                        } else {
                            //permission already granted, data is saved.
                            saveToTxtFile(Text);
                        }
                    } else {
                        //system OS is < marshmallow, and no need to runtime permission, save data.
                        saveToTxtFile(Text);
                    }
                }
            }
        });


    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case WRITE_EXTERNAL_STORAGE_CODE: {
                //if request is cancelled, result of the array has no data
                if (grantResults.length > 0 && grantResults[0]
                        == PackageManager.PERMISSION_GRANTED) {
                    saveToTxtFile(Text);
                } else {
                    Toast.makeText(this, "Storage permission is needed for data storage", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void saveToTxtFile(String Text) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss",
                Locale.getDefault()).format(System.currentTimeMillis());
        try {
            File path = Environment.getDownloadCacheDirectory();
            //we create a folder named "Class Files"
            File dir = new File(path + "Users/adeniyiladenegan/Library/Mobile Documents/iCloud~com~coteditor~CotEditor/Documents/ClassFile.xml");
            dir.mkdir();

            String fileName = "ClassFile_" + timeStamp + ".txt";
            File file = new File(dir, fileName);

            FileWriter fw = new FileWriter(file.getAbsoluteFile()); //file writer is used to store characters.
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Text);
            bw.close();

            Toast.makeText(this, fileName + " is saved to\n", Toast.LENGTH_SHORT).show();
        } catch (Exception e) { //if something goes wrong
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        //public native String next();
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
    public void nextPage(View view) {
            Intent i = new Intent(this, MainActivity3.class);
            startActivity(i);
    }
    public void regis(View view) {

    }
}



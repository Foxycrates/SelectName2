package com.example.fuchsi.selectname;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;





        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Toast;

public class NameDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);

        Bundle extras = getIntent().getExtras();
        String name1 = extras.getString("n1");
        String name2 = extras.getString("n2");
        String name3 = extras.getString("n3");
        String name4 = extras.getString("n4");
        Toast.makeText(this, "Recieved", Toast.LENGTH_LONG).show();
    }




}

package com.example.fuchsi.selectname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn(View v)
    {

        EditText et1 = (EditText)findViewById(R.id.editText1);
        String name1 = et1.getText().toString();
        EditText et2 = (EditText)findViewById(R.id.editText2);
        String name2 = et2.getText().toString();
        EditText et3 = (EditText)findViewById(R.id.editText3);
        String name3 = et3.getText().toString();
        EditText et4 = (EditText)findViewById(R.id.editText4);
        String name4 = et4.getText().toString();



        Bundle extras = new Bundle();
        extras.putString("n1", name1);
        extras.putString("n2", name2);
        extras.putString("n3", name3);
        extras.putString("n4", name4);

        Toast.makeText(this, "Send", Toast.LENGTH_LONG).show();


        Intent myIntent = new Intent(MainActivity.this, NameDisplay.class);
        myIntent.putExtras(extras); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }

}

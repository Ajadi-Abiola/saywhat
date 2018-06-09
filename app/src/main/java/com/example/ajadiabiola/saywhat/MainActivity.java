package com.example.ajadiabiola.saywhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ConfirmName(View view){
        Intent ConfirmNameIntent = new Intent(this, ConfirmNameActivity1.class);
        EditText nameText = (EditText)findViewById(R.id.edit_name);
        String name = nameText.getText().toString();
        ConfirmNameIntent.putExtra("name", name);
        startActivity(ConfirmNameIntent);

    }

}

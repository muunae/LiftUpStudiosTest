package com.example.cf.liftupstudiostest;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText password;
    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        password = (EditText) findViewById(R.id.password);
        sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        password.setText(sharedPref.getString(getString(R.string.password), ""));
        if(!(sharedPref.getString(getString(R.string.password), "").equals(""))){
            Context context = getApplicationContext();
            CharSequence text = "!!!";
            Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void saveField(View v){
        //Save the password on a STRING (NORMALLY REALLY BAD IDEA!!! used only to display on
        //the EditText
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(getString(R.string.password), password.getText().toString());
        editor.apply();

        Context context = getApplicationContext();
        CharSequence text = "Saved!";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }
}

package com.example.ahmed.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class second extends Activity {

      private Button ok ;
    private EditText eAge ;
    private EditText eName ;
    private String age ="" ;
    private String name ="";
public MainActivity o;
    private static final String TAG = "second";
    @Override


    protected void onCreate( Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec);
        Log.d(TAG,"getTe") ;
        ok = (Button) findViewById(R.id.button);
        eAge = (EditText) findViewById(R.id.editText) ;
        eName = (EditText) findViewById(R.id.editText2 ) ;


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age= eAge.getText().toString();

                name= eName.getText().toString();
Intent  i= new Intent(second.this,MainActivity.class);

i.putExtra(MainActivity.Age,age) ;

                i.putExtra(MainActivity.Name,name) ;
//Toast.makeText(second.this, age + name,Toast.LENGTH_LONG).show();
            setResult(RESULT_OK,i);
                finish();
            }


        });


    }
}

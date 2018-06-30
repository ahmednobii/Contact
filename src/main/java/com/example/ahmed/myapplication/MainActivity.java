package com.example.ahmed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String Name = "name";
    public static final String Age = "Age ";
public static final int request_Code =1 ;
    private Button bAdd;
    private String cAge;
    private String cName;
    private Activty oo;
    Intent intent;
    int i = -1;
    private static final String TAG = "MainActivity";
    public static List<Activty> list = new ArrayList<>();
public List<String> str ;
    public RecyclerView lst;
public AdapterData adapterData;
    public  RecyclerView.Adapter mAdapter ;
public RecyclerView.LayoutManager mManger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
str = new ArrayList<>();
str.add("aaa") ;
        str.add("aaasss");
        str.add("aaassssssss") ;
        lst = (RecyclerView) findViewById(R.id.rList);
        bAdd = (Button) findViewById(R.id.add);
        bAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, second.class);
                startActivityForResult(intent,request_Code);
                Log.d(TAG, "Seco");

i++ ;

            }
        });


    }
 @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent Data) {
super.onActivityResult(requestCode,resultCode,Data);
   ;
oo = new Activty() ;
     oo.setAge(Data.getStringExtra(Age));
     oo.setName(Data.getStringExtra(Name));
     list.add(i,oo);

     for (int i1 = 0 ;  i1< list.size() ; i1++) {
         Log.d(TAG, "onActivityResult:" +list.get(i1).getName() + list.size()+i1+"     i"+i);
         Toast.makeText(MainActivity.this,list.get(i1).getName(),Toast.LENGTH_LONG).show();
     }
 adapterData = new AdapterData(list) ;

     lst.setAdapter(adapterData);

lst.setLayoutManager( new LinearLayoutManager(this));

     adapterData.notifyItemInserted(i);

     }

}

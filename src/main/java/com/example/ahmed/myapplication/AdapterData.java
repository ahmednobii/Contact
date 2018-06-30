package com.example.ahmed.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.ViewHolder> {


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext() ;
        LayoutInflater inflater = LayoutInflater.from(context) ;
        View view = inflater.inflate(R.layout.recycleview_layout ,parent,false) ;
        ViewHolder viewHolder = new ViewHolder(view) ;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
Activty sActivty = mAcctivity.get(position) ;
TextView textView = holder.mtextR ;
Button button = holder.mButtonR ;
textView.setText(sActivty.getName());
button.setText("View");
}

    @Override
    public int getItemCount() {

        return mAcctivity.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mtextR ;
     public   Button mButtonR;

        public ViewHolder(View itemView) {
            super(itemView);

mtextR= (TextView) itemView.findViewById(R.id.rText);
mButtonR = (Button) itemView.findViewById(R.id.rButton);



        }
    }

    public List<Activty> mAcctivity ;

    public AdapterData (List<Activty> activty){

        mAcctivity =activty ;}
}

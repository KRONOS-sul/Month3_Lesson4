package com.example.month3_lesson4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    public TextView textName;
    public ImageView icons;

    String[] data1;
    Context context;
    int[] imagess = {R.drawable.cplusplus,R.drawable.csharp,R.drawable.java,
            R.drawable.javascript,R.drawable.kotlin,R.drawable.python,R.drawable.swift};

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.name);
            icons = itemView.findViewById(R.id.icons);
        }
    }

    public Adapter(Context ct, String[] s1) {
        context = ct;
        data1 = s1;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_name, parent, false);
        return new ViewHolder(view); //ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textName.setText(data1[position]);
        holder.icons.setImageResource(imagess[position]);
    }

    @Override
    public int getItemCount() {
        return imagess.length;
    }


}

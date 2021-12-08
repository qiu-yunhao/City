package com.example.city.View;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.city.Model.Data;
import com.example.city.R;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.Holder> {

    private Context mContext;
    private List<Data> holderList;

    public ImageAdapter(Context context , List<Data> holderList){
        this.mContext = context;
        this.holderList = holderList;
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = View.inflate(parent.getContext(), R.layout.image_item,null);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Data itemHolder = holderList.get(position);
        holder.bind(itemHolder);
    }

    @Override
    public int getItemCount() {
        return holderList.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            init();
        }

        public void init(){
            imageView = (ImageView)itemView.findViewById(R.id.item_pic);
            textView = (TextView) itemView.findViewById(R.id.item_name);
        }

        public void bind(Data holder){
            this.textView.setText(holder.getName());
        }
    }
}

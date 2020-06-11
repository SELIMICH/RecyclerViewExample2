package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {
    private ArrayList<RecyclerViewItem> mArrayList;

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,
                parent,false);
        return new RecyclerViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        RecyclerViewItem recyclerViewItem = mArrayList.get(position);

        holder.mTextViewAge.setText(recyclerViewItem.getAge());
        holder.mTextViewName.setText(recyclerViewItem.getName());
        holder.mTextViewId.setText(recyclerViewItem.getId());

        Glide.with(holder.mImageView.getContext())
                .load(recyclerViewItem.getImageView())
                .into(holder.mImageView);

//      Picasso.with(holder.mImageView.getContext())
//              .load(recyclerViewItem.getImageView())
//              .placeholder(R.drawable.ic_sentiment_satisfied_black_24dp)
//              .error(R.drawable.ic_sentiment_neutral_black_24dp)
//              .into(holder.mImageView);

    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;
        private TextView mTextViewName;
        private TextView mTextViewAge;
        private TextView mTextViewId;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.object_image);
            mTextViewId = itemView.findViewById(R.id.text_view_id);
            mTextViewName = itemView.findViewById(R.id.text_view_name);
            mTextViewAge = itemView.findViewById(R.id.text_view_age);

        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> arrayList) {
        mArrayList = arrayList;
    }
}

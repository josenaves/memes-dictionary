package com.josenaves.android.memes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jnaves on 16/02/15.
 */
public class MemeAdapter extends RecyclerView.Adapter<MemeAdapter.MemeViewHolder> {

    private List<String> memeList;

    public MemeAdapter(List<String> list) {
        this.memeList = list;
    }

    @Override
    public int getItemCount() {
        return memeList.size();
    }

    @Override
    public void onBindViewHolder(MemeViewHolder holder, int position) {
        String memeName = memeList.get(position);
        holder.mTextView.setText(memeName);
    }


    @Override
    public MemeAdapter.MemeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.cardview, parent, false);

        return new MemeViewHolder(item);
    }

    public static class MemeViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;

        public MemeViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.text_title);
        }
    }

}

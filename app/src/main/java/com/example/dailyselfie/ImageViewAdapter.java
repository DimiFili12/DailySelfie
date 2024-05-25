package com.example.dailyselfie;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageViewAdapter extends BaseAdapter {
    private ArrayList<ImageRecord> list = new ArrayList<ImageRecord>();
    private static LayoutInflater inflater = null;
    private Context mContext;

    public ImageViewAdapter(Context context) {
        mContext = context;
        inflater = LayoutInflater.from(mContext);
    }


    @Override
    public int getCount() {
        return list.size();
    }


    public Object getItem(int position){
        return list.get(position);
    }


    public long getItemId(int position){
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View newView = convertView;
        ViewHolder holder;

        ImageRecord curr = list.get(position);

        if (null == convertView){
            holder = new ViewHolder();
            newView = inflater.inflate(R.layout.list_view_items, parent, false);
            holder.imageView = (ImageView) newView.findViewById(R.id.imageView);
            holder.title = (TextView) newView.findViewById(R.id.textView);
            newView.setTag(holder);
        }
        else {
            holder = (ViewHolder) newView.getTag();
        }

        holder.imageView.setImageBitmap(curr.getmBitmap());
        holder.title.setText("Name: " + curr.getmName());

        return newView;
    }


    static class ViewHolder{
        ImageView imageView;
        TextView title;
    }


    public void add(ImageRecord listItem){
        list.add(listItem);
        notifyDataSetChanged();
    }


    public ArrayList<ImageRecord> getList(){
        return list;
    }


    public void removeAllViews() {
        list.clear();
        this.notifyDataSetChanged();
    }
}
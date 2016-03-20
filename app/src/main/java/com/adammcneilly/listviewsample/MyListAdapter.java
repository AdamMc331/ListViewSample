package com.adammcneilly.listviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by adammcneilly on 3/20/16.
 */
public class MyListAdapter extends BaseAdapter{
    // Context refers to the Activity this adapter is used in.
    private Context mContext;

    // This is our data source to be displayed.
    private String[][] mData;

    // Simple constructor
    public MyListAdapter(Context context, String[][] data) {
        this.mContext = context;
        this.mData = data;
    }

    // Returns the number of rows for the list view. In this case, it is the number of rows in the
    // 2D array.
    @Override
    public int getCount() {
        return mData.length;
    }

    // Returns the object at a given row in the list view. In this case, we return the row from the
    // 2D array.
    @Override
    public Object getItem(int position) {
        return mData[position];
    }

    // Required implementation, not necessary for this sample app, just return position.
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the view
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

        // Get a reference to each of the text views
        TextView tvLeft = (TextView) view.findViewById(R.id.tv_left);
        TextView tvCenter = (TextView) view.findViewById(R.id.tv_center);
        TextView tvRight = (TextView) view.findViewById(R.id.tv_right);

        // Populate the text views
        // 0 index is left, 1 index is center, 2 index is right
        tvLeft.setText(mData[position][0]);
        tvCenter.setText(mData[position][1]);
        tvRight.setText(mData[position][2]);

        // Return the row view.
        return view;
    }

    public void swapData(String[][] data) {
        this.mData = data;
        notifyDataSetChanged();
    }
}

package com.example.user.emergencyapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.CustomViewHolder> {

    private ArrayList<PersonalData> mList = null;
    private Activity context = null;


    public UsersAdapter(Activity context, ArrayList<PersonalData> list) {
        this.context = context;
        this.mList = list;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView bno;
        protected TextView agencyname;
        protected TextView cal;
        protected TextView longitude;
        protected TextView latitude;


        public CustomViewHolder(View view) {
            super(view);
            this.bno = (TextView) view.findViewById(R.id.textView_list_bno);
            this.agencyname = (TextView) view.findViewById(R.id.textView_list_agencyname);
            this.cal = (TextView) view.findViewById(R.id.textView_list_cal);
            this.longitude = (TextView) view.findViewById(R.id.textView_list_longitude);
            this.latitude = (TextView) view.findViewById(R.id.textView_list_latitude);
        }
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder viewholder, int position) {

        viewholder.bno.setText(mList.get(position).getMember_bno());
        viewholder.agencyname.setText(mList.get(position).getMember_agencyname());
        viewholder.cal.setText(mList.get(position).getMember_cal());
        viewholder.longitude.setText(mList.get(position).getMember_longitude());
        viewholder.latitude.setText(mList.get(position).getMember_latitude());
    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }

}
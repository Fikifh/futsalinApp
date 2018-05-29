package com.example.dwexid.futsalin.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dwexid.futsalin.model.GorModel;
import com.example.dwexid.futsalin.R;

import java.util.ArrayList;

public class GorAdapter extends RecyclerView.Adapter<GorAdapter.DataViewHolder> {


        private ArrayList<GorModel> gorModelList;

        public GorAdapter(ArrayList<GorModel> gorModelList) {
            this.gorModelList = gorModelList;
        }

        @Override
        public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.layout_item, parent, false);
            return new DataViewHolder(view);
        }

        @Override
        public void onBindViewHolder(DataViewHolder holder, int position) {
            holder.txtNamaGor.setText(gorModelList.get(position).getNamaGor());
            holder.txtAlamat.setText(gorModelList.get(position).getAlamat());
        }

        @Override
        public int getItemCount() {
            return (gorModelList != null) ? gorModelList.size() : 0;
        }

        public class DataViewHolder extends RecyclerView.ViewHolder{
            private TextView txtNamaGor, txtAlamat;

            public DataViewHolder(View itemView) {
                super(itemView);
                txtNamaGor = (TextView) itemView.findViewById(R.id.person_name);
                txtAlamat = (TextView) itemView.findViewById(R.id.person_age);
            }
        }
}

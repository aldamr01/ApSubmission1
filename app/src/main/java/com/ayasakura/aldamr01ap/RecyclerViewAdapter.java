package com.ayasakura.aldamr01ap;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.ayasakura.aldamr01ap.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<Waifus> listWaifu;

    public RecyclerViewAdapter(Context context, ArrayList<Waifus> list){
        this.listWaifu = list;
        this.context = context;
    }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_waifus, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Waifus waifus = listWaifu.get(position);

        Glide.with(holder.itemView.getContext())
                .load(waifus.getProfile())
                .apply(new RequestOptions().override(60,60))
                .into(holder.ivProfile);
        holder.tvName.setText(waifus.getName());
        holder.tvDescription.setText(waifus.getDescription());
        holder.btDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailWaifu.class);
                intent.putExtra("name", waifus.getName().toString());
                intent.putExtra("description", waifus.getDescription().toString());
                intent.putExtra("profile", waifus.getProfile());

                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listWaifu.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView ivProfile;
        TextView tvName, tvDescription;
        RelativeLayout rlWaifu;
        Button btDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            ivProfile       = itemView.findViewById(R.id.iv_profile);
            tvName          = itemView.findViewById(R.id.tv_name);
            tvDescription   = itemView.findViewById(R.id.tv_description);
            rlWaifu         = itemView.findViewById(R.id.rv_list);
            btDetail        = itemView.findViewById(R.id.bt_detail);
        }
    }
}

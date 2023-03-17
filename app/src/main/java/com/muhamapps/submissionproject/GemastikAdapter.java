package com.muhamapps.submissionproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GemastikAdapter extends RecyclerView.Adapter<GemastikAdapter.GemastikViewHolder> {

    private ArrayList<Gemastik> listGemastik;
    private OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick){
        this.onItemClick = onItemClick;
    }

    public GemastikAdapter(ArrayList<Gemastik> list) { this.listGemastik = list; }

    @NonNull
    @Override
    public GemastikViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gemastik_category_item, viewGroup, false);
        return new GemastikViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GemastikViewHolder holder, int position) {
        final Gemastik gemastik = listGemastik.get(position);
        Glide.with(holder.itemView.getContext())
                .load(gemastik.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(gemastik.getName());
        holder.tvDesc.setText(gemastik.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onItemClicked(listGemastik.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listGemastik.size();
    }

    public class GemastikViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDesc;
        ImageView imgPhoto;
        public GemastikViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.gemastik_item_photo);
            tvName = itemView.findViewById(R.id.gemastik_item_name);
            tvDesc = itemView.findViewById(R.id.gemastik_item_detail);
        }
    }

    public interface OnItemClick {
        void onItemClicked(Gemastik data);
    }
}

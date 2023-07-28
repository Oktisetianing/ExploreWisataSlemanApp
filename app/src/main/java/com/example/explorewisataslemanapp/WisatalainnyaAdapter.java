package com.example.explorewisataslemanapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class WisatalainnyaAdapter extends RecyclerView.Adapter<WisatalainnyaAdapter.ViewHolder> {

    WisatalainnyaModel [] wisatalainnyalist;

    public WisatalainnyaAdapter(WisatalainnyaModel[] wisatalainnyalist) {

        this.wisatalainnyalist = wisatalainnyalist;
    }

    @NonNull
    @Override
    public WisatalainnyaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View listwisata = layoutInflater.inflate(R.layout.item_wisata_lainnya,null);

        ViewHolder viewHolder = new ViewHolder((listwisata));

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WisatalainnyaAdapter.ViewHolder holder, int position) {
        WisatalainnyaModel wisataModel = wisatalainnyalist[position];
        holder.gmbrwisata.setImageResource(wisataModel.getGmbrwisata());
        holder.tvnamawisata.setText(wisataModel.getTvnamawisata());
        holder.tvjam.setText(wisataModel.getTvjam());
        holder.tvdeskripsi.setText(wisataModel.getTvdeskripsi());
        holder.tvalamat.setText(wisataModel.getTvalamat());

        holder.maincard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailwisatacandiActivity.class);
                intent.putExtra("Gambar", wisataModel.getGmbrwisata());
                intent.putExtra("Nama Wisata", wisataModel.getTvnamawisata());
                intent.putExtra("Jam Buka", wisataModel.getTvjam());
                intent.putExtra("Deskripsi", wisataModel.getTvdeskripsi());
                intent.putExtra("Alamat", wisataModel.getTvalamat());
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return wisatalainnyalist.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gmbrwisata;
        TextView tvnamawisata, tvjam, tvdeskripsi, tvalamat;
        CardView maincard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gmbrwisata = itemView.findViewById(R.id.gmbrwisata);
            tvnamawisata = itemView.findViewById(R.id.tvnamawisata);
            tvjam= itemView.findViewById(R.id.tvjam);
            tvdeskripsi = itemView.findViewById(R.id.tvdeskrpsi);
            tvalamat = itemView.findViewById(R.id.tvalamat);
            maincard = itemView.findViewById(R.id.maincard3);
        }

    }

}

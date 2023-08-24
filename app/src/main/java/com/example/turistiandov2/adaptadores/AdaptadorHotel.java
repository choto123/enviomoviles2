package com.example.turistiandov2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.MoldeHotel;
import com.example.turistiandov2.moldes.MoldeHotel;

import java.util.ArrayList;

    public class AdaptadorHotel extends RecyclerView.Adapter<AdaptadorHotel.viewHolder> {

        public ArrayList<MoldeHotel> listaHotel;

        //constructores del adaptador
        public AdaptadorHotel(ArrayList<MoldeHotel> listaHotel) {
        }

        public void AdaptadorHotel(ArrayList<MoldeHotel> listaHotel) {
            this.listaHotel = listaHotel;
        }

    @NonNull
    @Override
    public AdaptadorHotel.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHotel.viewHolder holder, int position) {
        holder.actualizarDatos(listaHotel.get(position));
    }

    @Override
    public int getItemCount() {
        return listaHotel.size();
    }



    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotoListaHotel);
            nombreHotel=itemView.findViewById(R.id.nombreListaHotel);
            precioHotel=itemView.findViewById(R.id.precioListaHotel);
            contactoHotel=itemView.findViewById(R.id.contactoListaHotel);
        }

        public  void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
            contactoHotel.setText(moldeHotel.getTelefono());
        }
    }
}

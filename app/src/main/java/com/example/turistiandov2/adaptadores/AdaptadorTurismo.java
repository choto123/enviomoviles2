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
import com.example.turistiandov2.moldes.MoldeTurismo;

import java.util.ArrayList;

public class AdaptadorTurismo extends RecyclerView.Adapter<AdaptadorTurismo.viewHolder> {

    public ArrayList<MoldeTurismo> listaTurismo;

    //constructores del adaptador
    public AdaptadorTurismo() {
    }

    public AdaptadorTurismo(ArrayList<MoldeTurismo> listaTurismo) {
        this.listaTurismo = listaTurismo;
    }

    @NonNull
    @Override
    public AdaptadorTurismo.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldeturismo,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorTurismo.viewHolder holder, int position) {
        holder.actualizarDatos(listaTurismo.get(position));
    }

    @Override
    public int getItemCount() {
        return listaTurismo.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoSitio;
        TextView nombreSitio;
        TextView precioSitio;
        TextView contactoSitio;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoSitio=itemView.findViewById(R.id.fotoListaSitios);
            nombreSitio=itemView.findViewById(R.id.nombreListaSitios);
            precioSitio=itemView.findViewById(R.id.precioListaSitio);
            contactoSitio=itemView.findViewById(R.id.contactoListaSitio);
        }

        public void actualizarDatos(MoldeTurismo moldeTurismo) {
            fotoSitio.setImageResource(moldeTurismo.getFoto());
            nombreSitio.setText(moldeTurismo.getNombre());
            precioSitio.setText(moldeTurismo.getPrecio());
            contactoSitio.setText(moldeTurismo.getTelefono());
        }
    }
}
package com.example.turistiandov2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class AdaptadorRestaurante extends RecyclerView.Adapter<AdaptadorRestaurante.viewHolder> {

    public ArrayList<MoldeRestaurante> listaRestaurante;

    //constructores del adaptador
    public AdaptadorRestaurante(ArrayList<MoldeRestaurante> listaRestaurante) {
    }

    public void AdaptadorTurismo(ArrayList<MoldeRestaurante> listaRestaurante) {
        this.listaRestaurante = listaRestaurante;
    }
    @NonNull
    @Override
    public AdaptadorRestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurante.viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurante.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurante.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreRestaurante;
        ImageView fotoRestaurante;
        TextView precioRestaurante;
        TextView telefonoRestaurante;
        TextView especialidad;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreRestaurante=itemView.findViewById(R.id.nombreListaRestaurante);
            fotoRestaurante=itemView.findViewById(R.id.fotoListaRestaurante);
            precioRestaurante=itemView.findViewById(R.id.rangoListaRestaurantes);
            telefonoRestaurante=itemView.findViewById(R.id.telefonoListaRestaurantes);
            especialidad=itemView.findViewById(R.id.especialidad);
        }
        public void actualizarDatos(MoldeRestaurante moldeRestaurante) {
            nombreRestaurante.setText(moldeRestaurante.getNombre());
            fotoRestaurante.setImageResource(moldeRestaurante.getFoto());
            precioRestaurante.setText(moldeRestaurante.getPrecio());
            telefonoRestaurante.setText(moldeRestaurante.getTelefono());
            especialidad.setText(moldeRestaurante.getNombre());
        }
    }
}

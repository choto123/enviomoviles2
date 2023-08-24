package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.adaptadores.AdaptadorHotel;
import com.example.turistiandov2.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHotel adaptadorHotel=new AdaptadorHotel(listaHoteles);
        recyclerView.setAdapter(adaptadorHotel);

    }

    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("Hotel la riviera","$150000","3225608780",R.drawable.hotelcinco));
        listaHoteles.add(new MoldeHotel("Hotel la posada","$80000","3225608787",R.drawable.hoteldos));
        listaHoteles.add(new MoldeHotel("Hotel spa reservado","$180000","3225608778",R.drawable.hoteltres));
        listaHoteles.add(new MoldeHotel("Hotel la cascada del angel","$60000","3225608741",R.drawable.hotelcuatro));
        listaHoteles.add(new MoldeHotel("Hotel el mirador","$190000","3225608720",R.drawable.hotelcinco));
    }
}
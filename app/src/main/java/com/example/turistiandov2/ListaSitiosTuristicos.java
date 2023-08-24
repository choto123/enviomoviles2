package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.turistiandov2.adaptadores.AdaptadorHotel;
import com.example.turistiandov2.adaptadores.AdaptadorTurismo;
import com.example.turistiandov2.moldes.MoldeHotel;
import com.example.turistiandov2.moldes.MoldeTurismo;

import java.util.ArrayList;

public class ListaSitiosTuristicos extends AppCompatActivity {

    ArrayList<MoldeTurismo> listaTurismo=new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView = findViewById(R.id.listadinamicasitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorTurismo adaptadorTurismo=new AdaptadorTurismo(listaTurismo);
        recyclerView.setAdapter(adaptadorTurismo);

    }

    public void llenarListaConDatos(){
        listaTurismo.add(new MoldeTurismo(R.drawable.hoteluno,"cerro","$150000","3225608780"));
        listaTurismo.add(new MoldeTurismo(R.drawable.hoteldos,"cerro","$150000","3225608780"));
        listaTurismo.add(new MoldeTurismo(R.drawable.hoteltres,"cerro","$150000","3225608780"));
    }s
}
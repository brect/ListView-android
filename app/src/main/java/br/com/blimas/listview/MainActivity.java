package br.com.blimas.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaDeLocais;
    private String[] itens = {
            "Aaru",
            "Alfheim",
            "Antília",
            "Annwn",
            "Archolo",
            "Armário de Davy Jones",
            "Asgard",
            "Aruanda",
            "Ashihara no Nakatsu Kuni",
            "Agharta",
            "Atlântida",
            "Avalon"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeLocais = findViewById(R.id.lista_locais);


        //Cria adapatador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //Adiciona adaptador para a lista
        listaDeLocais.setAdapter(adaptador);

        //Adiciona clique na lista
        listaDeLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String valorClicado = listaDeLocais.getItemAtPosition(position).toString();

                //exibe item clicado pelo usuario
                Toast.makeText(getApplicationContext(), valorClicado, Toast.LENGTH_LONG).show();
            }
        });
    }
}

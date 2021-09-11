package personal.app.guia_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import personal.app.guia_2.model.Persona;

import static personal.app.guia_2.MainActivity.personas;

public class ListaActivity extends AppCompatActivity {

    ListView lsvNombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        lsvNombres = findViewById(R.id.lsvNombres);

        ArrayAdapter<Persona> adapterPersona = new ArrayAdapter(this, android.R.layout.simple_list_item_1, personas);

        lsvNombres.setAdapter(adapterPersona);

        adapterPersona.notifyDataSetChanged();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}
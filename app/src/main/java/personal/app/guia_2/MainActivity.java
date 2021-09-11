package personal.app.guia_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import personal.app.guia_2.model.Persona;

public class MainActivity extends AppCompatActivity {

    Button verLista;
    Button agregar;
    Button datos;

    public static ArrayList<Persona> personas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verLista    = (Button)findViewById(R.id.btnLista);
        agregar     = (Button)findViewById(R.id.btnAgregar);
        datos       = (Button)findViewById(R.id.btnDatos);

        verLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (personas.isEmpty()){
                    Toast.makeText(MainActivity.this, "Lista vacia", Toast.LENGTH_SHORT).show();
                }else {
                    Intent ver = new Intent(MainActivity.this, ListaActivity.class);
                    startActivity(ver);
                }
            }
        });

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add = new Intent(MainActivity.this, AgregarActivity.class);
                startActivity(add);
            }
        });

        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dat = new Intent(MainActivity.this, DatosActivity.class);
                startActivity(dat);
            }
        });
    }
}
package andreu.soriano.a04_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContadorActivity extends AppCompatActivity {

    static TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        txtResultado = findViewById(R.id.txtResultadoContador);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            if (bundle.getString("OPERACION").equalsIgnoreCase("Palabras")){
                String palabras = bundle.getString("PALABRAS");
                //Toast.makeText(this, "La frase tiene " + palabras + " caracteres", Toast.LENGTH_SHORT).show();
                txtResultado.setText("La frase tiene " + palabras + " palabras");
            }else {
                String caracteres = bundle.getString("CARACTERES");
                //Toast.makeText(this, "La frase tiene " + caracteres + " caracteres", Toast.LENGTH_SHORT).show();
                txtResultado.setText("La frase tiene " + caracteres + " caracteres");
            }
        }

    }
}
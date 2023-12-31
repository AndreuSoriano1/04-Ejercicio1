package andreu.soriano.a04_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.StringTokenizer;

public class Contador2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String frase = bundle.getString("FRASE");
            int operacion = bundle.getInt("OPERACION");
            if (operacion == R.id.btnContarCaracteresMain){
                Toast.makeText(this, "LA FRASE TIENE " + frase.length() + " caracteres", Toast.LENGTH_SHORT).show();
            }else {
                if (operacion == R.id.btnContarPalabrasMain){
                    StringTokenizer palabras = new StringTokenizer(frase);
                    Toast.makeText(this, "la frase tiene " + palabras.countTokens() + " palabras", Toast.LENGTH_SHORT).show();
                }
            }
        }

    }
}
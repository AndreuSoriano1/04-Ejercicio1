package andreu.soriano.a04_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtFrase;
    private Button btnCaracteres;
    private Button btnPalabras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVistas();

        /* btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                int numCaracteres = frase.length();

                enviarResultado(numCaracteres, "CARACTERES", "Caracteres");
            }
        });


         btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                String[] palabras = frase.split(" ");
                int num = palabras.length;

                enviarResultado(num, "PALABRAS", "Palabras");

            }
        });
         */

    }

    /* private void enviarResultado(int num, String PALABRAS, String Palabras) {
        if (num == 0) {
            Toast.makeText(MainActivity.this, "EL CAMPO ESTA VACIO", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(MainActivity.this, ContadorActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(PALABRAS, String.valueOf(num));
            bundle.putString("OPERACION", Palabras);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

     */

    private void inicializarVistas(){
        txtFrase = findViewById(R.id.txtFraseMain);
        btnCaracteres = findViewById(R.id.btnContarCaracteresMain);
        btnPalabras = findViewById(R.id.btnContarPalabrasMain);
    }

    public void onClickBotones(View boton){
        String frase = txtFrase.getText().toString();

        if (!frase.isEmpty()){
            Intent intetn = new Intent(MainActivity.this, Contador2Activity.class);
            Bundle bundle = new Bundle();
            bundle.putString("FRASE", frase);
            bundle.putInt("OPERACION", boton.getId());
            intetn.putExtras(bundle);
            startActivity(intetn);
        }else {
            Toast.makeText(this, "FALATA LA FRASE", Toast.LENGTH_SHORT).show();
        }
    }
}
package br.ufjf.dcc196.dcc196exemplo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    private Button botaoCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //1 - Encontre os componetes entrada
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);
        //2 - Procure os componentes de saída
        resultado = (TextView) findViewById(R.id.resultado);
        //3 - Procure os componentes de controle
        botaoCalcular = (Button) findViewById(R.id.calcular);
        //4 - Configurar os ouvintes para eventos

        Ouvinte ouvinteInstancia = new Ouvinte();
        botaoCalcular.setOnClickListener( ouvinteInstancia);
    }

    private class Ouvinte implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Integer n1 = Integer.parseInt(numero1.getText().toString());
            Integer n2 = Integer.parseInt(numero2.getText().toString());

            Integer soma = n1 + n2;

            resultado.setText("A soma de "+n1+" e "+n2+" é: "+soma);
        }
    }


}

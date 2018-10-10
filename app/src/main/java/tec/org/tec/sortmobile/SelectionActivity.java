package tec.org.tec.sortmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import tec.org.tec.lists.ListaSimple;

public class SelectionActivity extends AppCompatActivity {

    private TextView widget;
    private ListaSimple listaSelection = new ListaSimple();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        widget = findViewById(R.id.button2);
        widget.setEnabled(false);
    }

    public void generarListaS(View v){
        listaSelection.anadirElementosAlAzar();
        String txt = listaSelection.print();
        widget = findViewById(R.id.textView2);
        widget.setText(txt);
        widget = findViewById(R.id.button);
        widget.setEnabled(false);
        widget = findViewById(R.id.button2);
        widget.setEnabled(true);
    }
    public void ordenarSelection(View v){
        int tInicio = (int) System.currentTimeMillis();
        widget = findViewById(R.id.button2);
        widget.setEnabled(false);
        String txt = listaSelection.selectionSort();
        int tFinal = (int) System.currentTimeMillis();
        widget = findViewById(R.id.textView17);
        widget.setText(txt);
        widget = findViewById(R.id.button);
        widget.setEnabled(true);
        listaSelection = new ListaSimple();
        widget = findViewById(R.id.textView3);
        txt = "Duración: " +Integer.toString(tFinal - tInicio) + " milisegundos.";
        widget.setText(txt);
    }


    public void irInsertion(View v){
        Intent intent = new Intent(this, Resultados.class);
        startActivity(intent);
        listaSelection = new ListaSimple();
    }

}

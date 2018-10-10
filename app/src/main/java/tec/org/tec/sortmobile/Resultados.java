package tec.org.tec.sortmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import tec.org.tec.lists.ListaSimple;

public class Resultados extends AppCompatActivity {

    private TextView widget;
    private ListaSimple listaSelection = new ListaSimple();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        widget = findViewById(R.id.button5);
        widget.setEnabled(false);
    }

    public void generarListaI(View v){
        listaSelection.anadirElementosAlAzar();
        String txt = listaSelection.print();
        widget = findViewById(R.id.textView6);
        widget.setText(txt);
        widget = findViewById(R.id.button4);
        widget.setEnabled(false);
        widget = findViewById(R.id.button5);
        widget.setEnabled(true);
    }

    public void ordenarInsertion(View v){
        int tInicio = (int) System.currentTimeMillis();
        widget = findViewById(R.id.button5);
        widget.setEnabled(false);
        String txt = listaSelection.insertionSort();
        int tFinal = (int) System.currentTimeMillis();
        widget = findViewById(R.id.textView7);
        widget.setText(txt);
        widget = findViewById(R.id.button4);
        widget.setEnabled(true);
        listaSelection = new ListaSimple();
        widget = findViewById(R.id.textView8);
        txt = "Duración: " +Integer.toString(tFinal - tInicio) + " milisegundos.";
        widget.setText(txt);
    }

    public void irSelection(View v){
        listaSelection = new ListaSimple();
        finish();
    }

}

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
    }

    public void generarListaS(View v){
        int i = 0;
        String txt = "";
        int tInicio = 0;
        int tFinal = 0;
        int tDurado = 0;
        int num = 0;
        while (i != 11){
            if (i == 0){
                listaSelection.anadirElementosAlAzar(5);
                num = 5;
            }if (i == 1){
                listaSelection.anadirElementosAlAzar(10);
                num = 10;
            }if (i == 2){
                listaSelection.anadirElementosAlAzar(20);
                num = 20;
            }if (i == 3){
                listaSelection.anadirElementosAlAzar(30);
                num = 30;
            }if (i == 4){
                listaSelection.anadirElementosAlAzar(40);
                num = 40;
            }if (i == 5){
                listaSelection.anadirElementosAlAzar(50);
                num = 50;
            }if (i == 6){
                listaSelection.anadirElementosAlAzar(60);
                num = 60;
            }if (i == 7){
                listaSelection.anadirElementosAlAzar(70);
                num = 70;
            }if (i == 8){
                listaSelection.anadirElementosAlAzar(80);
                num = 80;
            }if (i == 9){
                listaSelection.anadirElementosAlAzar(90);
                num = 90;
            }if (i == 10){
                listaSelection.anadirElementosAlAzar(100);
                num = 100;
            }
            tInicio = (int) System.currentTimeMillis();
            listaSelection.selectionSort();
            tFinal = (int) System.currentTimeMillis();
            tDurado = tFinal - tInicio;
            txt += "Largo de la lista: " + num + ", tiempo durado ordenando: " + tDurado + " ms." + "\n" + "\n";
            i++;
        }
        widget = findViewById(R.id.textView2);
        widget.setText(txt);
        listaSelection = new ListaSimple();
    }

    public void irInsertion(View v){
        widget = findViewById(R.id.textView2);
        widget.setText("");
        listaSelection = new ListaSimple();
        Intent intent = new Intent(this, Resultados.class);
        startActivity(intent);
    }

}

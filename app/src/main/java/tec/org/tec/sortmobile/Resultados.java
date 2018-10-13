package tec.org.tec.sortmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import tec.org.tec.lists.ListaSimple;

public class Resultados extends AppCompatActivity {

    private TextView widget;
    private ListaSimple listaInsertion = new ListaSimple();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
    }

    public void generarListaI(View v){
        int i = 0;
        String txt = "";
        int tInicio = 0;
        int tFinal = 0;
        int tDurado = 0;
        int num = 0;
        while (i != 11){
            if (i == 0){
                listaInsertion.anadirElementosAlAzar(5);
                num = 5;
            }if (i == 1){
                listaInsertion.anadirElementosAlAzar(10);
                num = 10;
            }if (i == 2){
                listaInsertion.anadirElementosAlAzar(20);
                num = 20;
            }if (i == 3){
                listaInsertion.anadirElementosAlAzar(30);
                num = 30;
            }if (i == 4){
                listaInsertion.anadirElementosAlAzar(40);
                num = 40;
            }if (i == 5){
                listaInsertion.anadirElementosAlAzar(50);
                num = 50;
            }if (i == 6){
                listaInsertion.anadirElementosAlAzar(60);
                num = 60;
            }if (i == 7){
                listaInsertion.anadirElementosAlAzar(70);
                num = 70;
            }if (i == 8){
                listaInsertion.anadirElementosAlAzar(80);
                num = 80;
            }if (i == 9){
                listaInsertion.anadirElementosAlAzar(90);
                num = 90;
            }if (i == 10){
                listaInsertion.anadirElementosAlAzar(100);
                num = 100;
            }
            tInicio = (int) System.currentTimeMillis();
            listaInsertion.insertionSort();
            tFinal = (int) System.currentTimeMillis();
            tDurado = tFinal - tInicio;
            txt += "Largo de la lista: " + num + ", tiempo durado ordenando: " + tDurado + " ms." + "\n" + "\n";
            i++;
        }
        widget = findViewById(R.id.textView6);
        widget.setText(txt);
        listaInsertion = new ListaSimple();
    }

    public void irSelection(View v){
        listaInsertion = new ListaSimple();
        widget = findViewById(R.id.textView6);
        widget.setText("");
        finish();
    }

}

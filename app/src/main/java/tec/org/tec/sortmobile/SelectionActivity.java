package tec.org.tec.sortmobile;

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

    public void generarLista(View v){
        listaSelection.anadirElementosAlAzar();
        String txt = listaSelection.print();
        widget = findViewById(R.id.textView2);
        widget.setText(txt);
        widget = findViewById(R.id.button);
        widget.setEnabled(false);
    }

    public void ordenarSelection(View v){
        widget = findViewById(R.id.button2);
        widget.setEnabled(false);
        this.selectionSort(listaSelection);
    }

    public void selectionSort(ListaSimple lista){
        if (!lista.listaVacia()) {
            String txt = "";
            for (int a = 0; a < lista.getLargo() - 1; a++) {
                widget = findViewById(R.id.textView17);
                int minIndex = a;
                for (int j = a + 1; j < lista.getLargo(); j++)
                    if (lista.getValue(j) < lista.getValue(minIndex))
                        minIndex = j;
                lista.swap(minIndex, a);
                txt += lista.print() + "\n";
            }
            widget.setText(txt);
        }
    }

}

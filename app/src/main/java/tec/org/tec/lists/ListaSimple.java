package tec.org.tec.lists;

import java.util.Random;

public class ListaSimple extends Lista {

    public void add(int valor){
        if(listaVacia()){
            this.head = new Nodo(valor);
            this.head.next = null;
            this.largo ++;
        }
        else{
            Nodo tmp = this.head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new Nodo(valor);
            tmp.next.next = null;
            this.largo ++;
        }
    }

    public void anadirElementosAlAzar(int num){
        Random rand = new Random();
        int ran;
        int i = 0;
        while (i != num){
            ran = rand.nextInt(1001);
            this.add(ran);
            i++;
        }
    }
}

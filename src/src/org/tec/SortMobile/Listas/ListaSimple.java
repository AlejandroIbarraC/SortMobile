package org.tec.SortMobile.Listas;

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

    public static void main(String[] args){
        ListaSimple lista = new ListaSimple();
        lista.add(12);
        lista.add(14);
        lista.add(9);
        lista.add(100);
        lista.add(17);
        lista.print();
        lista.insertionSort();
        lista.print();
    }
}

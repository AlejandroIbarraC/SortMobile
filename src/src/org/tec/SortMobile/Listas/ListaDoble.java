package org.tec.SortMobile.Listas;

public class ListaDoble extends Lista {
    public void add(int valor) {
        if (listaVacia()) {
            this.head = new Nodo(valor);
            this.head.next = null;
            this.head.prev = null;
            this.largo++;
        } else {
            Nodo tmp = this.head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            Nodo nuevo = new Nodo(valor);
            tmp.next = nuevo;
            nuevo.prev = tmp;
            nuevo.next = null;
            this.largo++;
        }
    }

    public void add(int valor, int index) {
        if (listaVacia() || this.largo - 1 < index) {
            System.out.println("IndexOutOfRange");
        } else {
            Nodo tmp = this.head;

            for (int a = 0; a < index; a++) {
                tmp = tmp.next;
            }
            Nodo nuevo = new Nodo(valor);
            nuevo.next = tmp.next;
            nuevo.prev = tmp;
            tmp.next.prev = nuevo;
            tmp.next = nuevo;
            this.largo++;
        }
    }

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.add(12);
        lista.add(13);
        lista.add(14);
        lista.add(16);
        lista.add(17);
        lista.add(18);
        lista.print();
        lista.add(15, 2);
        lista.print();
        System.out.println(lista.getValue(4));
    }
}
package org.tec.SortMobile.Listas;

public class Lista {

    int largo;
    Nodo head;

    public Lista() {
        this.head = null;
        this.largo = 0;
    }

    public void selectionSort() {
        if (!listaVacia()) {
            for (int a = 0; a < this.largo - 1; a++) {
                int minIndex = a;
                for (int j = a + 1; j < this.largo; j++)
                    if (this.getValue(j) < this.getValue(minIndex))
                        minIndex = j;
                swap(minIndex, a);
            }
        }
    }

    public void swap(int minIndex, int i) {
        int temp = this.getValue(minIndex);
        this.setValue(minIndex, this.getValue(i));
        this.setValue(i, temp);
    }

    public void print() {
        if (!listaVacia()) {
            for (int a = 0; a < this.largo; a++) {
                System.out.println(getValue(a));
            }
            System.out.println("--------------------------");
        }
    }

    public int getValue(int index) {
        if (this.largo - 1 < index) {
            System.out.println("IndexOutOfRange");
            return Integer.parseInt(null);
        } else {
            Nodo tmp = this.head;
            for (int a = 0; a < index; a++) {
                tmp = tmp.next;
            }
            return tmp.valor;
        }
    }

    public void setValue(int index, int valor) {
        if (this.largo - 1 < index) {
            System.out.println("IndexOutOfRange");
        } else {
            Nodo tmp = this.head;
            for (int a = 0; a < index; a++) {
                tmp = tmp.next;
            }
            tmp.valor = valor;
        }
    }

    public boolean listaVacia() {
        if (this.largo == 0) {
            return true;
        } else {
            return false;
        }
    }
}

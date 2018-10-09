package tec.org.tec.lists;

public class Lista {

    public int largo;
    public Nodo head;

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
                System.out.println(this.print());
            }
        }
    }

    public void insertionSort(){
        if (!listaVacia()){
            int in;
            int out;
            for(out = 1; out < this.largo; out++){
                int temp = this.getValue(out);
                in = out;
                while(in >= 0 && this.getValue(in-1) >= temp){
                    this.swap(in, in-1);
                    in --;
                }
                 this.setValue(in, temp);
            }

        }
    }

    public void swap(int minIndex, int i) {
        int temp = this.getValue(minIndex);
        this.setValue(minIndex, this.getValue(i));
        this.setValue(i, temp);
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String print() {
        if (!listaVacia()) {
            String txt = "[";
            Nodo tmp = this.head;
            while (tmp.next != null){
                txt += Integer.toString(tmp.valor) + ", ";
                tmp = tmp.next;
            }
            txt += Integer.toString(tmp.valor) + "]";
            return txt;
        }
        else{
            return null;
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

    public static void main(String args[]){
        ListaSimple l = new ListaSimple();
        l.anadirElementosAlAzar();
        System.out.println(l.print());
        l.selectionSort();
        System.out.println(l.print());
    }

}

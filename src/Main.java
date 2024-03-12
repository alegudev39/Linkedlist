import java.util.LinkedList;

//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata
        public class Main {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println("fruits " + fruits);

        fruits.addFirst("Banana");
        fruits.addLast("Pineapple");

        System.out.println("fruits + 1 begin + 1 last " + fruits);
    }
}
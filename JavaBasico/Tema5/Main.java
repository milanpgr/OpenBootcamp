package Tema5Interfaces;
/*-Crear una interfaz CocheCRUD
          -Crear una implementacion CocheCRUDImpl que implemente la interfaz CocheCRUD
          -Como metodo de CocheCRUD podemos poner: save(), findAll(), delete(), que simplemente impriman por consola
          el nombre del propio metodo
          -Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los metodos.
         */

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

    }
}

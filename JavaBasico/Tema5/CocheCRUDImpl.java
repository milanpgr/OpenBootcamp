package Tema5Interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    public CocheCRUDImpl() {

    }

    @Override
    public void save() {
        System.out.println("Guardar");
    }

    @Override
    public void findAll() {
        System.out.println("Buscar");
    }

    @Override
    public void delete() {
        System.out.println("Eliminar");
    }
}

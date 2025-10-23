package preEntregaTalentoTech;

import java.util.ArrayList;

public class CrudCategorias extends CrudConsola<Categoria>{

    private final ArrayList<Categoria> categorias;

    public CrudCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public void crear() {
        String nombre = leerTexto("Nombre de la nueva categoría: ");
        categorias.add(new Categoria(nombre));
        System.out.println("Categoría creada.");
    }

    @Override
    public void listar() {
       if (categorias.isEmpty()) {
            System.out.println("(No hay categorías)");
        } else {
            for (Categoria c : categorias) {
                System.out.println(c);
            }
        }
    }

    @Override
    public void actualizar() {
       int id = leerEntero("Id de la categoría: ");  //tambien podria buscar por nombre 
        for (Categoria c : categorias) {
            if (c.getId() == id) {
                String nuevo = leerTexto("Nuevo nombre de Categoria: ");
                c.setNombre(nuevo);
                System.out.println("Se actualizo el nombre de la Categoria: " + c);
                return;
            }
        }
        System.out.println("No se encontró Categoría con id " + id);
    }

    @Override
    public void eliminar() {
       int id = leerEntero("Id de la categoría a eliminar: ");
        boolean eliminado = categorias.removeIf(c -> c.getId() == id);
        System.out.println(eliminado ? "Categoría eliminada." : "No existía ese id.");
    }

}

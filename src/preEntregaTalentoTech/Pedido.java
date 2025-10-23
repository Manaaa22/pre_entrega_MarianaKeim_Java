package preEntregaTalentoTech;
import java.util.ArrayList;

public class Pedido {
private int id;
private ArrayList<Producto> listaProductos;

private static int contador = 1;

public Pedido(ArrayList<Producto> listaProductos) {
    this.id = contador++;
    this.listaProductos = listaProductos;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public ArrayList<Producto> getListaProductos() {
    return listaProductos;
}
public void setListaProductos(ArrayList<Producto> listaProductos) {
    this.listaProductos = listaProductos;
}

}
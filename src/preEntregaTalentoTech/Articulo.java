package preEntregaTalentoTech;

public class Articulo extends Producto {
private Categoria categoria;

public Articulo(String nombre, double precio, Categoria categoria) {
    super(nombre, precio);
    this.categoria = categoria;
} 

public Categoria getCategoria() {
    return categoria;
}

public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
}

 @Override
    public double calcularDescuento() { // Implementación concreta
        return getPrecio() * 0.90;      // 10% de descuento
    }



}

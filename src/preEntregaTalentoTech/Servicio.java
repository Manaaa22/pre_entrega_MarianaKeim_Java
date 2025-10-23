package preEntregaTalentoTech;

public class Servicio extends Producto{
private int duracionHoras;

public Servicio(String nombre, double precio, int duracionHoras) {
    super(nombre, precio);
    this.duracionHoras = duracionHoras;
}

public int getDuracionHoras() {
    return duracionHoras;
}

public void setDuracionHoras(int dur) {
    this.duracionHoras = dur;
} 

 @Override
    public double calcularDescuento() { // Implementación concreta
        return getPrecio() * 0.80;      // 20% de descuento
    }

}

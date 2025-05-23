public class Producto {
    private String marca;
    private float precio;

    public Producto(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public void setMarca(String marca) {this.marca = marca;}
    public void setPrecio(float precio) {this.precio = precio;}
    public String getMarca() {return marca;}
    public float getPrecio() {return precio;}

    public String toString(){
        return "Marca: " + marca + "\nPrecio: " + precio;
    }
}

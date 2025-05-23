public class Carrito {
    
    private Producto[] productos;
    private int caloriasTotales;
    private float precioTotal;

    public Carrito(Producto[]productos){
        this.productos=productos;
    }

    public void calcularCalorias(){
        caloriasTotales=0;
        for(int i=0;i<productos.length;i++){
            if(tieneCalorias(productos[i])){
                if (productos[i] instanceof Cereales) {
                    caloriasTotales += ((Cereales) productos[i]).getCalorias();
                } else if (productos[i] instanceof Vino) {
                    caloriasTotales += ((Vino) productos[i]).getCalorias();

                }
            }
        }
    }

    public void calcularPrecioTotal(){
        precioTotal=0;
        for(int i=0;i<productos.length;i++){
            if(tieneDescuento(productos[i])){
                if (productos[i] instanceof Vino) {
                    precioTotal += ((Vino) productos[i]).getPrecioDescuento();
                } else if (productos[i] instanceof Detergente) {
                    precioTotal += ((Detergente) productos[i]).getPrecioDescuento();
                }
            }
            else{
                precioTotal+=productos[i].getPrecio();
            }
        }
    }

    public boolean tieneCalorias(Producto producto){
        boolean tiene=false;
        if(producto instanceof Cereales || producto instanceof Vino){
            tiene=true;
        }
        return tiene;
    }

    public boolean tieneDescuento(Producto producto){
        boolean tiene=false;
        if(producto instanceof Vino || producto instanceof Detergente){
            tiene=true;
        }
        return tiene;
    }

    public int getCaloriasTotales(){return caloriasTotales;}
    public float getPrecioTotal(){return precioTotal;}

    public String toString(){
        calcularCalorias();
        calcularPrecioTotal();
        String info="";

        for(int i=0;i<productos.length;i++){
            info+="\nproducto "+(i+1)+": \n"+productos[i].toString()+"\n";
        }

        info+="\nCalorias totales: " +caloriasTotales+ 
               "\nPrecio total: " +precioTotal;

        return info;
    }
}

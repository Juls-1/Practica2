public class Main {
    public static void main(String[] args) {
      
    Producto d1 = new Detergente("Marca1",10); 
    Producto d2 = new Detergente("Marca2",20, 25);
    Producto d3 = new Detergente("Marca3",30, "garrafa", 1500, 10);

    Producto c1 = new Cereales("Marca4", 40,"espelta");
    Producto c2 = new Cereales("Marca5", 50,"maiz", "31/10/2025");
    Producto c3 = new Cereales("Marca6", 60,"trigo", "10/05/2024");
    Producto c4 = new Cereales("Marca7", 70,"avena");

    Producto v1 = new Vino("Marca8", 80, "tinto", 20);
    Producto v2 = new Vino("Marca9", 90, "blanco", 15, 3000, "galon", 10);
    Producto v3 = new Vino("Marca10", 100, "rosado", 12, 750, "botella", "01/01/2025");
    Producto v4 = new Vino("Marca11", 110, "espumoso", 8, 500, "botella", 12, "01/01/2025");

    Producto[] detergentes = new Producto[]{d1,d2,d3};
    Producto[] cereales = new Producto[]{c1,c2,c3,c4};
    Producto[] vinos = new Producto[]{v1,v2,v3,v4};

    Carrito carrito = new Carrito(new Producto[]{d1,d2,d3,c1,c2,c3,c4,v1,v2,v3,v4});
    Carrito carrito2= new Carrito(detergentes);
    Carrito carrito3= new Carrito(cereales);
    Carrito carrito4= new Carrito(vinos);

    carrito.calcularCalorias();
    carrito.calcularPrecioTotal();
    carrito2.calcularCalorias();
    carrito2.calcularPrecioTotal();
    carrito3.calcularCalorias();
    carrito3.calcularPrecioTotal();
    carrito4.calcularCalorias();
    carrito4.calcularPrecioTotal();

    System.out.println("Calorias Totales de carrito de detergentes:"+carrito2.getCaloriasTotales());
    System.out.println("Precio Total de carrito de detergentes:"+carrito2.getPrecioTotal());
    
    System.out.println("------------------------------");   
    System.out.println("Calorias Totales de carrito de cereales:"+carrito3.getCaloriasTotales());
    System.out.println("Precio Total de carrito de cereales:"+carrito3.getPrecioTotal());

    System.out.println("------------------------------");    
    System.out.println("Calorias Totales de carrito de vinos:"+carrito4.getCaloriasTotales());
    System.out.println("Precio Total de carrito de vinos:"+carrito4.getPrecioTotal());

    System.out.println("------------------------------");
    System.out.println("Calorias Totales de carrito mixto:"+carrito.getCaloriasTotales());
    System.out.println("Precio Total de carrito mixto:"+carrito.getPrecioTotal());

    System.out.println("------------------------------");
    System.out.println("Carrito de Detergentes: "+carrito2.toString());

    }
    
}

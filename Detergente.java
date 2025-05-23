public class Detergente extends Producto implements IDescuento, Iliquido{

    private String tipoEnvase;
    private float volumen;
    private float descuento;
    private float precioDescuento;

    public Detergente(String marca, float precio){
        super(marca, precio);
        this.tipoEnvase="plastico";
        this.volumen=500;
        this.descuento=0;
        this.precioDescuento=precio-(precio*(descuento/100));
    }
    public Detergente(String marca, float precio, float descuento){
        super(marca, precio);
        this.tipoEnvase="botella";
        this.volumen=500;
        this.descuento=descuento;
        this.precioDescuento=precio-(precio*(descuento/100));
    }

    public Detergente(String marca, float precio, String tipoEnvase, float volumen){
        super(marca, precio);
        this.tipoEnvase = tipoEnvase;
        this.volumen = volumen;
        this.descuento=0;
        this.precioDescuento=precio-(precio*(descuento/100));
    }

    public Detergente(String marca, float precio, String tipoEnvase, float volumen, float descuento){
        super(marca, precio);
        this.tipoEnvase = tipoEnvase;
        this.volumen = volumen;
        this.descuento=descuento;
        this.precioDescuento=precio-(precio*(descuento/100));
    }

    public void setVolumen(float volumen) {this.volumen = volumen;}
    public void setTipoEnvase(String tipoEnvase) {this.tipoEnvase = tipoEnvase;}
    public void setDescuento(float descuento) {this.descuento = descuento;}  
    public float getVolumen() {return volumen;}    
    public String getTipoEnvase() {return tipoEnvase;}
    public float getDescuento() {return descuento;}
    public float getPrecioDescuento() {return precioDescuento;}

    public String toString(){
        return "Marca: " +getMarca()+ 
               "\nPrecio: " +getPrecio()+ 
               "\nTipo de envase: " +tipoEnvase+ 
               "\nVolumen: " +volumen+ 
               "\nDescuento: " +descuento+ 
               "\nPrecio con descuento: " +precioDescuento;
    }
}

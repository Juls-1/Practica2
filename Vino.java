import java.util.Date;
import java.util.Calendar;

public class Vino extends Producto implements Iliquido, IDescuento, IAlimento{
    private String tipo;
    private double gradosAlcohol;
    private float volumen;
    private String tipoEnvase;
    private float descuento;
    private float precioDescuento;
    private Date caducidad;
    private Calendar cal=Calendar.getInstance();
    private int calorias;

    public Vino(String marca, float precio, String tipo, double gradosAlcohol){
        super(marca, precio);
        this.tipo=tipo;
        this.gradosAlcohol=gradosAlcohol;
        this.volumen=750;
        this.tipoEnvase="botella";
        this.descuento=0;
        this.precioDescuento=precio-(precio*(descuento/100));
        calendarDate("01/01/2026");
        caducidad=cal.getTime();
        calorias=(int)gradosAlcohol*10;
    }

    public Vino(String marca, float precio, String tipo, double gradosAlcohol, float descuento){
        super(marca, precio);
        this.tipo=tipo;
        this.gradosAlcohol=gradosAlcohol;
        this.volumen=750;
        this.tipoEnvase="botella";
        this.descuento=descuento;
        this.precioDescuento=precio-(precio*(descuento/100));
        calendarDate("01/01/2026");
        caducidad=cal.getTime();
        calorias=(int)gradosAlcohol*10;
    }

    public Vino(String marca, float precio, String tipo, double gradosAlcohol, float volumen, String tipoEnvase){
        super(marca, precio);
        this.tipo=tipo;
        this.gradosAlcohol=gradosAlcohol;
        this.volumen=volumen;
        this.tipoEnvase=tipoEnvase;
        this.descuento=0;
        this.precioDescuento=precio-(precio*(descuento/100));
        calendarDate("01/01/2026");
        caducidad=cal.getTime();
        calorias=(int)gradosAlcohol*10;
    }

    public Vino(String marca, float precio, String tipo, double gradosAlcohol, float volumen, String tipoEnvase, float descuento){
        super(marca, precio);
        this.tipo=tipo;
        this.gradosAlcohol=gradosAlcohol;
        this.volumen=volumen;
        this.tipoEnvase=tipoEnvase;
        this.descuento=descuento;
        this.precioDescuento=precio-(precio*(descuento/100));
        calendarDate("01/01/2026");
        caducidad=cal.getTime();
        calorias=(int)gradosAlcohol*10;
    }  

    public Vino(String marca, float precio, String tipo, double gradosAlcohol, String cad){
        super(marca, precio);
        this.tipo=tipo;
        this.gradosAlcohol=gradosAlcohol;
        this.volumen=750;
        this.tipoEnvase="botella";
        this.descuento=0;
        this.precioDescuento=precio-(precio*(descuento/100));
        calendarDate(cad);
        caducidad=cal.getTime();
        calorias=(int)gradosAlcohol*10;
    }
    public Vino(String marca, float precio, String tipo, double gradosAlcohol, float volumen, String tipoEnvase, String cad){
        super(marca, precio);
        this.tipo=tipo;
        this.gradosAlcohol=gradosAlcohol;
        this.volumen=volumen;
        this.tipoEnvase=tipoEnvase;
        this.descuento=0;
        this.precioDescuento=precio-(precio*(descuento/100));
        calendarDate(cad);
        caducidad=cal.getTime();
        calorias=(int)gradosAlcohol*10;
    }    

    public Vino(String marca, float precio, String tipo, double gradosAlcohol, float volumen, String tipoEnvase, float descuento, String cad){
        super(marca, precio);
        this.tipo=tipo;
        this.gradosAlcohol=gradosAlcohol;
        this.volumen=volumen;
        this.tipoEnvase=tipoEnvase;
        this.descuento=descuento;
        this.precioDescuento=precio-(precio*(descuento/100));
        calendarDate(cad);
        caducidad=cal.getTime();
        calorias=(int)gradosAlcohol*10;
    }      

    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setGradosAlcohol(double gradosAlcohol) {this.gradosAlcohol = gradosAlcohol;}
    public void setVolumen(float volumen) {this.volumen = volumen;}
    public void setTipoEnvase(String tipoEnvase) {this.tipoEnvase = tipoEnvase;}
    public void setDescuento(float descuento) {this.descuento = descuento;}
    public void setCaducidad(Date caducidad) {this.caducidad=caducidad;}
    public String getTipo(){return this.tipo;}
    public double getGradosAlcohol(){return this.gradosAlcohol;}
    public float getVolumen(){return this.volumen;}
    public String getTipoEnvase(){return this.tipoEnvase;}
    public float getDescuento(){return this.descuento;}
    public float getPrecioDescuento(){return this.precioDescuento;}
    public Date getCaducidad(){return this.caducidad;}
    public int getCalorias(){return this.calorias;}

    public void calendarDate(String date){
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(date.substring(0,2)));
        cal.set(Calendar.MONTH, Integer.parseInt(date.substring(3,5)));
        cal.set(Calendar.YEAR, Integer.parseInt(date.substring(6,10)));
        caducidad = cal.getTime();
    }

    public String toString(){
        return "Marca: " +getMarca()+ 
               "\nPrecio: " +getPrecio()+ 
               "\nTipo: " +tipo+ 
               "\nGrados de Alcohol: " +gradosAlcohol+ 
               "\nVolumen: " +volumen+ 
               "\nTipo de envase: " +tipoEnvase+ 
               "\nDescuento: " +descuento+"%"+ 
               "\nPrecio con descuento: " +precioDescuento+ 
               "\nCaducidad: " +caducidad+ 
               "\nCalorias: " +calorias;
    }
}

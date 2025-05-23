import java.util.Date;
import java.util.Calendar;

public class Cereales extends Producto implements IAlimento{

    private String tipo;
    private Date caducidad;
    private int calorias;
    private Calendar cal=Calendar.getInstance();


    public Cereales(String marca, float precio, String tipo) {
        super(marca, precio);
        this.tipo=tipo;
        if (tipo.toLowerCase().equals("espelta")) {calorias = 5;}
        else if (tipo.toLowerCase().equals("maíz") || tipo.toLowerCase().equals("maiz")){calorias = 8;} 
        else if (tipo.toLowerCase().equals("trigo")) { calorias = 12;} 
        else {calorias = 15;}
        setDate("01/01/2026");
        caducidad=cal.getTime();
    }
        public Cereales(String marca, float precio, String tipo, String cad) {
        super(marca, precio);
        this.tipo=tipo;
        if (tipo.toLowerCase().equals("espelta")) {calorias = 5;}
        else if (tipo.toLowerCase().equals("maíz") || tipo.toLowerCase().equals("maiz")){calorias = 8;} 
        else if (tipo.toLowerCase().equals("trigo")) { calorias = 12;} 
        else {calorias = 15;}
        setDate(cad);
        caducidad=cal.getTime();
    }

    public void setTipo(String tipo) {this.tipo=tipo;}
    public void setCaducidad(Date caducidad) {this.caducidad=caducidad;}
    public String getTipo() {return tipo;}
    public Date getCaducidad() {return caducidad;}
    public int getCalorias() {return calorias;}

    public void setDate(String date){
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(date.substring(0,2)));
        cal.set(Calendar.MONTH, Integer.parseInt(date.substring(3,5)));
        cal.set(Calendar.YEAR, Integer.parseInt(date.substring(6,10)));
        caducidad = cal.getTime();
    }
    
    public String toString(){
        return "Marca: " +getMarca()+ 
               "\nPrecio: " +getPrecio()+ 
               "\nTipo: " +tipo+ 
               "\nCaducidad: " +caducidad+ 
               "\nCalorias: " +calorias;
    }

}

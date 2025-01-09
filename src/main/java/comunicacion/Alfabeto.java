package comunicacion;

public class Alfabeto extends Pictograma{
    private static String [] letras;
    private String interpretacion;

    public Alfabeto(String origen, String [] letras, String interpretacion){
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }

    public void setLetras(String [] letras){Alfabeto.letras = letras;}
    public String [] getLetras(){return letras;}
    public void setIntepretacion(String inter){ this.interpretacion = inter;}
    public String getIntepretacion(){return interpretacion;}

    public int cantidadLetras(){
        return letras.length;
    }


    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        String cadena = null;
        int index = 0;
        for(String letra : letras){
            cadena += letra;
            index ++;
            if(index < letras.length - 1){
                cadena += ", ";
            }
        }
        return cadena;
    }
}

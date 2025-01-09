package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma{
    private ArrayList<String> letras;
    private String interpretacion;

    public Alfabeto(String origen, ArrayList<String> letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public void setLetras(ArrayList<String> letras){this.letras = letras;}
    public ArrayList<String> getLetras(){return letras;}
    public void setIntepretacion(String inter){ this.interpretacion = inter;}
    public String getIntepretacion(){return interpretacion;}

    public int cantidadLetras(){
        return letras.size();
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
            if(index < letras.size() - 1){
                cadena += ", ";
            }
        }
        return cadena;
    }
}

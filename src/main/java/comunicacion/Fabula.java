package comunicacion;

public class Fabula extends Escrito{
    String ensenanzas;
    String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }
    public void setIntepretacion(String inter){this.interpretacion=inter;}
    public String getInterpretacion(){return interpretacion;}
    public void setEnsenanzas(String ense){this.ensenanzas = ense;}
    public String getEnsenanzas(){return ensenanzas;}

    public int palabrasTotales(int paginas){
        return (int)paginas*1;
    }

    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        return super.getOrigen()+"/n"+super.getTitulo()+"/n"+super.getAutor()+"/n"+
        super.getPaginas()+"/n"+getAutor()+"/n"+getEnsenanzas();
    }

}

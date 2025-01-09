package comunicacion;

public class Fabula extends Escrito{
    String ensenanza;
    String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }
    public void setIntepretacion(String inter){this.interpretacion=inter;}
    public String getInterpretacion(){return interpretacion;}
    public void setEnsenanza(String ense){this.ensenanza = ense;}
    public String getEnsenanza(){return ensenanza;}

    public int palabrasTotales(int paginas){
        return (int)paginas*2;
    }

    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        return super.getOrigen()+"/n"+super.getTitulo()+"/n"+super.getAutor()+"/n"+
        super.getPaginas()+"/n"+getAutor()+"/n"+getEnsenanza();
    }

}

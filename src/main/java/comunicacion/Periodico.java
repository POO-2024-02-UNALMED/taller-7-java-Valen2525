package comunicacion;

public class Periodico extends Escrito{
    String fecha;
    String primicia;
    String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public void setFecha(String f){this.fecha = f;}
    public String getFecha(){return fecha;}
    public void setPrimicia(String p){this.primicia = p;}
    public String getPrimicia(){return primicia;}
    public void setIntepretacion(String inter){this.interpretacion=inter;}
    public String getInterpretacion(){return interpretacion;}

    public int palabrasTotales(int paginas){
        return (int)paginas*10;
    }
    
    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        return super.getOrigen()+"/n"+super.getTitulo()+"/n"+super.getAutor()+"/n"+
        super.getPaginas()+"/n"+getAutor()+"/n"+getFecha()+"/n"+getPrimicia();
    }
}

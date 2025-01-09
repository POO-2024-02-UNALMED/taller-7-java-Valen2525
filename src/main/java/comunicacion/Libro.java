package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public void setCo_autor(String aut){this.co_autor=aut;}
    public String getCo_autor(){return co_autor;}
    public void setEditorial(String aut){this.editorial=aut;}
    public String getEditorial(){return editorial;}
    public void setEdicion(String aut){this.edicion=aut;}
    public String getEdicion(){return edicion;}
    public void setIntepretacion(String aut){this.interpretacion=aut;}
    public String getInterpretacion(){return interpretacion;}

    public int palabrasTotales(int paginas){
        return (int)paginas*2;
    }

    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        return super.getOrigen()+"/n"+super.getTitulo()+"/n"+super.getAutor()+"/n"+
        super.getPaginas()+"/n"+getAutor()+"/n"+getEditorial()+"/n"+getEdicion();
    }
}

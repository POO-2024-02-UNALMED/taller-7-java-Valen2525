package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    static private String [] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea,String [] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        Tesis.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;}

    public String getIdea(){return idea;}
    public void setIdea(String i){this.idea = i;}
    public static String [] getArgumentos(){return argumentos;}
    public static void setArgumentos(String [] i){Tesis.argumentos = i;}
    public String getConclusion(){return conclusion;}
    public void setConclusion(String i){this.conclusion = i;}
    public String getReferencias(){return referencias;}
    public void setReferencias(String i){this.referencias = i;}
    public void setIntepretacion(String inter){this.interpretacion=inter;}
    public String getInterpretacion(){return interpretacion;}

    public int palabrasTotales(int paginas){
        return (int)paginas*5;
    }
    
    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        return super.getOrigen()+"/n"+super.getTitulo()+"/n"+super.getAutor()+"/n"+
        super.getPaginas()+"/n"+getAutor()+"/n"+getIdea()+"/n"+getArgumentos()+"/n"+getConclusion()+"/n"+getReferencias();
    }
}

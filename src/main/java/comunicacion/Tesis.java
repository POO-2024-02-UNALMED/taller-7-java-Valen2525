package comunicacion;

import java.util.ArrayList;

public class Tesis extends Escrito{
    String idea;
    ArrayList<String> argumentos;
    String conclusion;
    String referencias;
    String interpretacion;
    public Tesis(String origen, String titulo, String autor, int paginas, String idea, ArrayList<String> argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;}

    public String getIdea(){return idea;}
    public void setIdea(String i){this.idea = i;}
    public ArrayList<String> getArgumentos(){return argumentos;}
    public void setArgumentos(ArrayList<String> i){this.argumentos = i;}
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

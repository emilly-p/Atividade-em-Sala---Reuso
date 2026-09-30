/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	  Musicos m1 = new Professor("Mario");
        Musicos m2 = new Aluno("Joana");

        System.out.println("Digite as informações do professor:");
        
	}
}

abstract class Musicos {
    protected String nome;
    protected int id;
    protected int idade;
    protected double tempoEscola;

    abstract String tipoInstrumento();

     public Musicos(String nome) {
        setNome(nome);
    }

    public Musicos(String nome, int id, int idade, double tempoEscola) {
        this(nome); 
        setId(id);
        setIdade(idade);
        setTempoEscola(tempoEscola);
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public double getTempoEscola(){
        return tempoEscola;
    }

}
class Aluno extends Musicos{
    private int matricula;
    private double media;
    private double mensalidade;

    public Aluno(String nome){
        super(nome);
        setMatricula(matricula);
        setMedia(media);
        setMensalidade(mensalidade);
    }

    public int getMatricula(){
        return matricula;
    }
     public int getMedia(){
        return media;
    }
     public int getMensalidade(){
        return mensalidade;
    }

   @Override
    String tipoInstrumento(){
        return "Violino";
    }
}
class Professor extends Musicos{
    private int experiencia;
    private double salario;
    private String formacao;;

    public Professor(String nome){
        super(nome);
        setExperiencia(experiencia);
        setSalario(salario);
        setFormacao(formacao);
    }

    public int getExperiencia(){
        return experiencia;
    }
     public int getSalario(){
        return salario;
    }
     public int getFormacao(){
        return formacao;
    }

    @Override
    String tipoInstrumento(){
        return "violao";
    }
}

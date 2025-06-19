public class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {return nome;}
    public double getNota() { return nota;}

    public void setNome(String nome) { this.nome = nome;}
    public void setNota(double nota) { this.nota = nota;}

    @Override
    public String toString() {
        return "Nome: "+ nome +" Nota:" + nota;
    }
}

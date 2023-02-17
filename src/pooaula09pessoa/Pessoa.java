
package pooaula09pessoa;
// @author Mari (48) 99618-5728

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;    
    
    //Metodo construtor

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    //Metodos Públicos
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
        //this.idade++;
    }
    //Metodos Especiais
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}


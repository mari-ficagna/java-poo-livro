package pooaula09pessoa;
//@author Mari (48) 99618-5728
 
public class PooAula09Pessoa {

    public static void main(String[] args) {
        //Metodo construtor Livro (titulo, autor, totPaginas)
        //Metodo construtor pessoa (nome, idade, sexo)
        Pessoa p[] = new Pessoa [3];
        Livro l[] = new Livro [3]; 
        
        p[0] = new Pessoa ("Marieli",30,"feminino");
        p[1] = new Pessoa ("Samuel",31,"masculino");
        p[2] = new Pessoa ("Eliane", 59, "feminino");
        
        l[0] = new Livro ("O diario de uma Paixao","Nicholas Sparks",150,p[0]);
        l[1] = new Livro ("Cronicas de Narnia","C.S.Lewis",300,p[1]);
        l[2] = new Livro ("Voce e insubstituivel","Augusto Cury",211,p[2]);
        
        l[0].abrir();
        l[0].folhear(10); //necessário inserir o parametro de qual página deseja ir
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        l[1].abrir();
        l[1].folhear(100);
        System.out.println(l[1].detalhes());
        
        System.out.println(l[2].detalhes());
    }
    
}

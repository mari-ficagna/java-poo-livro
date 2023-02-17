package pooaula09pessoa;
//@author Mari (48) 99618-5728
 
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Metodo construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
     
    //Metodos Especial toString
    public String detalhes() {
        return "\n Informacoes do livro:"+"\n Titulo: " + titulo + "\n Autor: " + autor + "\n Numero de paginas: " 
                + totPaginas + "     Pagina atual: " + pagAtual + "\n Aberto: " + aberto 
                + "\n Leitor: " + leitor.getNome()+", "+leitor.getIdade()+" anos, sexo "+leitor.getSexo()+".";
    }
    
    //Metodos Publicos da Interface
    @Override
    public void abrir() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (p > this.totPaginas){
            this.pagAtual = 0;
        } else{
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.setPagAtual(this.getPagAtual()+1);
        //this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.setPagAtual(this.getPagAtual()-1);
        //this.pagAtual--;
    }
    
    //Metodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    

}

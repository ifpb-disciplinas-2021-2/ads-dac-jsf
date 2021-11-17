package br.edu.ifpb.web.jsf;

//JSF
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;

//CDI
import br.edu.ifpb.domain.Pessoa;
import br.edu.ifpb.domain.Pessoas;
import br.edu.ifpb.infra.memory.PessoasEmMemoria;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

//@ManagedBean
//@RequestScoped
@Named("controle")
@SessionScoped //Dependent
//Bean Gerenciando: objeto que um escopo e seu ciclo de vida é gerenciado pelo container
public class ContraladorDePessoas implements Serializable {
    private Pessoas pessoas = new PessoasEmMemoria();
    private Pessoa pessoa = new Pessoa("");

    public String salvar(){
        this.pessoas.nova(this.pessoa);
        this.pessoa = new Pessoa("");
        return "list?faces-redirect=true";
    }
    public String exibir(){
        //.... index
//        return "list"; //repassando a requisição (mantemos a mesma requisição)
        return "list?faces-redirect=true"; //redirecionando a resposta (nova requisição)
    }
    public List<Pessoa> todasAsPessoas(){
        return this.pessoas.todas();
    }
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    //    private String nome = "Job, Ricardo";
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
}

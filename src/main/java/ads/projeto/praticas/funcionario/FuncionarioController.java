/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.funcionario;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author recursive
 */
@Named
@SessionScoped
public class FuncionarioController implements Serializable{
    
    @Inject
    private FuncionarioServece cs;
    private Funcionario funcionario;
    private Funcionario logado;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getLogado() {
        return logado;
    }

    public void setLogado(Funcionario logado) {
        this.logado = logado;
    }
    
    public void Cadastrar(){
        cs.add(funcionario);
    }
    
    public String logar(){
        if(cs.logar(funcionario)){
            this.logado = this.funcionario;
            return "home";
        }
        return "index";
    }
    
}

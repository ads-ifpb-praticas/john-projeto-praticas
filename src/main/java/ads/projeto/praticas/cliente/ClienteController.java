/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.cliente;

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
public class ClienteController implements Serializable{
    
    @Inject
    private ClienteServece cs;
    private Servico cliente;
    private Servico logado;

    public Servico getCliente() {
        return cliente;
    }

    public void setCliente(Servico cliente) {
        this.cliente = cliente;
    }

    public Servico getLogado() {
        return logado;
    }

    public void setLogado(Servico logado) {
        this.logado = logado;
    }
    
    public void Cadastrar(){
        cs.add(cliente);
    }
    
    public String logar(){
        if(cs.logar(cliente)){
            this.logado = this.cliente;
            return "home";
        }
        return "index";
    }
    
}

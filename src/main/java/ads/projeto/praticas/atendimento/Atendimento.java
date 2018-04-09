/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.atendimento;

import ads.projeto.praticas.servico.Servico;
import java.io.Serializable;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author ifpb
 */
@Entity
public class Atendimento implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Servico sev;
    private LocalTime inicio;

    public Atendimento() {
    }

    public Atendimento(long id, Servico sev, LocalTime inicio) {
        this.id = id;
        this.sev = sev;
        this.inicio = inicio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Servico getSev() {
        return sev;
    }

    public void setSev(Servico sev) {
        this.sev = sev;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

}
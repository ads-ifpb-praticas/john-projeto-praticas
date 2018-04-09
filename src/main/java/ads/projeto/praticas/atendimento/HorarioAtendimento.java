/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.projeto.praticas.atendimento;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author ifpb
 */
@Entity
public class HorarioAtendimento implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    private DayOfWeek diaSemana;
    private LocalDateTime chegada;
    private LocalDateTime saida;

    public HorarioAtendimento() {
    }

    public HorarioAtendimento(long id, DayOfWeek diaSemana, LocalDateTime chegada, LocalDateTime Saida) {
        this.id = id;
        this.diaSemana = diaSemana;
        this.chegada = chegada;
        this.saida = Saida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DayOfWeek getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DayOfWeek diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalDateTime getChegada() {
        return chegada;
    }

    public void setChegada(LocalDateTime chegada) {
        this.chegada = chegada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime Saida) {
        this.saida = Saida;
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roboquestion.desafiodiomain.Curso;

import roboquestion.desafiodiomain.Conteudo;

/**
 *
 * @author User
 */
public class Curso extends Conteudo {
private int cargaHoraria;
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
                }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nNome do curso:"+ this.getTitulo()+"\n"+
               "Descrição: "+this.getDescricao()+"\n"+
                "Carga horario: "+this.cargaHoraria+"\n";
    }
    
    
    
    
    }
    


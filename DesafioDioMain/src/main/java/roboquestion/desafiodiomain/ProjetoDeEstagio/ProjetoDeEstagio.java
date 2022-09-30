/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roboquestion.desafiodiomain.ProjetoDeEstagio;

import java.time.LocalDate;
import roboquestion.desafiodiomain.Conteudo;

/**
 *
 * @author User
 */
public class ProjetoDeEstagio extends Conteudo{
private LocalDate data;

    public ProjetoDeEstagio() {    
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
   
@Override
  public String toString() {
  return "Titulo :"+this.getTitulo()+"\n"+
          "Descrição :"+this.getDescricao()+"\n"+
          "Data :"+data+"\n";
      
      
      
  }
    
    
    @Override
    public double calcularXp() {
        return XP_PADRAO+20d;
    }
    
}

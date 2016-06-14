package com.eduardo.leilao.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {
  
   private static final long serialVersionUID = 1L;
  
  public String novoBem(){
      return "NovoBem";
   }
  
  public String novoLeilao(){
      return "NovoLeilao";
   }
  
  public String novoUsuario(){
      return "NovoUsuario";
   }
  
  public String contasDeUsuario(){
      return "CadastroUsuarios";
   }
  
  public String listarLeiloes(){
      return "ListarLeiloes";
   }
  
  public String listarBens(){
      return "ListarBens";
   }
  
  public String acompanhamentoLeilao(){
      return "AcompanhamentoLeilao";
   }
  
  public String paginaLogada(){
	  return "PaginaLogada";
  }
  
  public String paginaBens(){
	  return "PaginaBens";
  }
  
  
   
}
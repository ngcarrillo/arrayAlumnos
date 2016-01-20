/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class alumnos {
    int tam= cuantosAlumnos();
    String []nomes= new String[tam];
    int []notas= new int[tam];
    
    
    public int cuantosAlumnos(){
        return Integer.parseInt (JOptionPane.showInputDialog("Cuantos alumnos vas introducir"));
       
    }
    public void crearArray(){
    for (int i = 0; i< nomes.length; i++){
        nomes[i] = introducirAlumnos();
        notas[i] = introducirNota();   
     }}
   public String introducirAlumnos(){
      return JOptionPane.showInputDialog("nome:");
    }
    public int introducirNota(){
      return Integer.parseInt(JOptionPane.showInputDialog("nota:"));
    }
    public void visualizar(){
        for (int i = 0; i< nomes.length; i++){
        System.out.println (nomes[i]);
        System.out.println (notas[i]);
    }
    }
    public void devolverNota(){
     String alumnoBuscado = JOptionPane.showInputDialog("Ingrese el alumno a buscar"); 
     for (int i = 0; i< nomes.length; i++){
         if(alumnoBuscado.equalsIgnoreCase(nomes[i])){
         JOptionPane.showMessageDialog (null, alumnoBuscado+" "+notas[i]);
         }
         
     }
     
    }
    }
    
   


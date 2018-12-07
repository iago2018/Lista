/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieb.senai.app;

import com.fieb.senai.entidades.Endereco;
import com.fieb.senai.entidades.Pessoa;

/**
 *
 * @author Aluno
 */
public class JavaApplication1 {
    public static void main(String[] args) {
       
        Pessoa p1 = new Pessoa("Maria", 5465435, 42);
        Endereco end1 = new Endereco("Rua A", "25","Ribeira");
        
        
        p1.setEndereco(end1);
        
        Pessoa p2 = new Pessoa("Maria", 5465435, 42);
        Endereco end2 = new Endereco("Rua B", "41","Fazenda Grande");
        
        p2.setEndereco(end2);
                
        
    }
    
}

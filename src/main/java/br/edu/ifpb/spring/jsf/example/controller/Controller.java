/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.spring.jsf.example.controller;

import javax.inject.Named;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
@Named("cont")
@Scope("request")
public class Controller {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String teste(){
        System.out.println("teste");
        return "teste";
    }
    
    
}

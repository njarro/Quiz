/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Vet {
    ArrayList <Pet> animals =new ArrayList();
    public void removePet(Pet p){
        animals.remove(p);
    }
    public void showPetsByType(String type){
    
    }
    public void showPets(){
    animals.iterator();
    }
}

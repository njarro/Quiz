/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    public void readPets(Vet v){
        String tipo;
     ArrayList<Pet>lista=new ArrayList();
     File f=new File("pets.txt");  
     Scanner input =new Scanner(f);
     if(f.exists()){
        try{
            if(input.hasNext()){
            tipo=input.next();
            switch (tipo)
                 case "Dog":
                 case "Cat":
                 case "Hamster":
            
            
            if(){
                try{
        
        
        
        
        
        
          
                }catch(IdRepeatedException ex){
                System.out.println("Id ya en uso");
                }
            }
            }
        }catch(FileNotFoundException ex){
            System.out.println("No exisite el archivo");
        }
        }
     }
    public void manageVet(Vet v,String action){};
}

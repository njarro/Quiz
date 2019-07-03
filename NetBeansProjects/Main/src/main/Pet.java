/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Estudiante
 */
public abstract class Pet {
    private String id;
    private String name;
    private String hairColor;
    private Person dueño;

    abstract String sound();
}

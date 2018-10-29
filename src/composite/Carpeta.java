/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adriangodoymartinez
 */
public class Carpeta implements Component {
    
    private String name;
    List<Component> contenido = new ArrayList<>();
    
    public Carpeta(String name) {
        this.name = name;
    }
    
    @Override
    public void mostrar() {
        System.out.println("+" + this.name);
        for (Component c : contenido) {
            c.mostrar();
        }
    }
    
    public void add(Component component) {
        contenido.add(component);
    }
    
    
}

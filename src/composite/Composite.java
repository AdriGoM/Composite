/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author adriangodoymartinez
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carpeta c1 = new Carpeta("Carpeta1");
        Carpeta c2 = new Carpeta("Carpeta2");
        Carpeta c3 = new Carpeta("Carpeta3");
        
        Archivo a1 = new Archivo("Archivo1");
        Archivo a2 = new Archivo("Archivo2");
        Archivo a3 = new Archivo("Archivo3");
        
        c1.add(a1);
        c2.add(a2);
        c3.add(a3);
        c1.add(c2);
        c1.add(c3);
        
        c1.mostrar();
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Coche;
/**
 *
 * @author alumno
 */
public class ListaCoches {
    
    private int actual;
    private List<Coche> lista;

    public ListaCoches() {
        this.actual=0;
        this.lista= new ArrayList<Coche>();
        
        lista.add(new Coche("1234ABC",LocalDate.of(1999, 12, 12),12333));
        lista.add(new Coche("4444AAA",LocalDate.of(2012, 11, 12),12333));
        lista.add(new Coche("3333JJJ",LocalDate.of(2003, 12, 3),12333));
        lista.add(new Coche("6666LLL",LocalDate.of(2022, 3, 2),12333));
        lista.add(new Coche("8888MMM",LocalDate.of(2010, 4, 12),12333));
    }
    
    public boolean esVacia(){
        return lista.isEmpty();
    }
    public void avanzar(){
        actual++;
    }
    public void retroceder(){
        actual--;
    }
    public void irAlPrimero(){
        actual=0;
    }
    public void irAlUltimo(){
        actual=lista.size()-1;
    }
    
    public boolean esUltimo(){
        return actual==lista.size()-1;
    }
    public boolean esPrimero(){
        return actual == 0;
    }
    public void anadirCoche(String nombre,LocalDate fecha, float valor){
        lista.add(new Coche(nombre,fecha,valor));
    }
    public void borrarCoche(){
        lista.remove(actual);
        
    }
    public Coche obtenerCocheActual(){
        return lista.get(actual);
    }
    public void ordenarPorMatricula(){
        lista.sort(null);
    }

    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class ControlErrores {
    
    public static boolean comprobarMatricula(String matricula){
        String numeros="";
        String letras="";
        for (int i = 0; i < 7; i++) {
            if (i<4) {
                numeros+=matricula.charAt(i);
            }else{
                letras+=matricula.charAt(i);
            }
        }
        int numero=10000;
        try {
            numero = Integer.parseInt(numeros);
        } catch (NumberFormatException e) {
            return false;
        }
        return numero<9999&&letras.length()==3;
    }
    
    public static boolean comprobarFecha(LocalDate fecha) {
        return fecha.getYear() >= 1990 && fecha.getYear() <= 2026;
    }
    
    public static boolean comprobarPrecio(float precio){
        return precio>=0&&precio<=150000;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;
import java.util.ArrayList;
import paquete2.Arriendo;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        
        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                "Christian Shepherd", 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $
        
        
        ArriendoLocalComida arriendoComida2 = new ArriendoLocalComida(
                "Christian Cruz", 300, 10, 20.2, 40.2);
        
        // hacemos uso del segundo constructor para poder establecer nuestros 
        // parametros sin tener de llamar a los metodos establecer
        
        
        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                "Andrew Schroeder", 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $
        
        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                "Angela Watson", 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $
        
        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);
        // el . size de en array list es para determinar el numero de elementos 
        // dentro de un array 
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual(); 
           // se llama a los métodos abstracto de cada obejto dento de la lista 
           // para que sea posible el calcular lo que pide cada metodo
            System.out.println(listaArriendos.get(i));
            // se imprimen todos los datos que ListaArriendos tenga dentro de el 
        }
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.ArrayList;
import paquete2.Arriendo;

/**
 *
 * @author reroes
 */
public class CentroComercial {

    private String nombre;
    private ArrayList<Arriendo> arriendos = new ArrayList<>(); 
    // Se crea un ArrayLisy de llamada Arriendo que es de tipo Arriendo
    // donde se pueden insertar o añadir sub objetos de la clase padre
    
    private double totalArriendosFinalMensual;// calcular valores 
    private double totalArriendosBaseMensual;// calcular valores 

    public CentroComercial(String n, ArrayList<Arriendo> lista) {
        nombre = n;
        arriendos = lista;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerArriendos(ArrayList<Arriendo> lista) {
        arriendos = lista;
    }

    public void establecerTotalArriendosFinalMensual() {
        for (int i = 0; i < obtenerArriendos().size(); i++) {
            totalArriendosFinalMensual = totalArriendosFinalMensual
                    + obtenerArriendos().get(i).obtenerArriendoMensual();
           
        }
    }
// .size para determinar el tamaño de la lista arriendos ya que esta esta dentro
// del metodo obtenerarriendo() 
    
/* dentro del for realizamos un calculo, utilizando la variable 
    totalArriendosBaseMensual sea igual a la misma variable , ya que vamos a 
    acumular datoss en esta variable, seguido sumamos la cuota base de cada 
    objeto que este dentro de arriendos, ya que gracias al get(i).obtenerCuotaBase
    podemos recorrer entre cada obejto de la lista y poder sacar estos valores 
    de el metodo obtenerCuotaBase() que nos devolvera tal valor y se podran 
    acumular en cada interacion del ciclo for de esta manera podremos obtener 
    el total de los arreindos mensual mente en la variable totalArriendosBaseMensual
*/
public void establecerTotalArriendosBaseMensual() {
        for (int i = 0; i < obtenerArriendos().size(); i++) {
            totalArriendosBaseMensual = totalArriendosBaseMensual
                    + obtenerArriendos().get(i).obtenerCuotaBase();
        }
    }
/* de la misma manera , sacamos el tamaño del la lista gracias al metodo 
   obtenerArriendos, dentro de ciclo for acumularemos valores en una variable 
   llamada totalArriendosBaseMensual , en la cual se aculimara la misma variable +
   la cuota base de cada objeto que este dentro de la lista arriendos, esto gracias  
   a que utilizamos los metodos obtenerArriendos . get en la posision i para 
   poder sacar el dato de obtenerCuotaBase de cada objeto existende en la lista 
*/ 
    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Arriendo> obtenerArriendos() {
        return arriendos;
    }

    public double obtenerTotalArriendosFinalMensual() {
        return totalArriendosFinalMensual;
    }

    public double obtenerTotalArriendosBaseMensual() {
        return totalArriendosBaseMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Centro Comercial\n"
                + "Nombre: %s\n"
                + "Lista de Locales\n\n", obtenerNombre());

        for (int i = 0; i < obtenerArriendos().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerArriendos().get(i));
        }

        cadena = String.format("\n%sTotal Arriendos base Mensual: %.2f\n"
                + "Total Arriendos Mensual: %.2f\n",
                cadena,
                obtenerTotalArriendosBaseMensual(),
                obtenerTotalArriendosFinalMensual());
        return cadena;
    }
}
/// estudair toString 
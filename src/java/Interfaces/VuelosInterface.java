/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import Modelo.CarteleraViajes;
import Modelo.Vuelos;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author denni
 */
public interface VuelosInterface {
    
    public List<Vuelos> listadoVuelos();
    
    public List<CarteleraViajes> listadoCarteleraViajes();
}
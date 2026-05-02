/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_final_ipc1_202502428;

public class NodoDoble {
    Cancion dato;
    NodoDoble anterior;
    NodoDoble siguiente;

    public NodoDoble(Cancion dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}

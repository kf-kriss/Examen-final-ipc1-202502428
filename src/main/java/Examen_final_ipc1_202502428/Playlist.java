/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_final_ipc1_202502428;

public class Playlist {
    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;

    public Playlist() {
        cabeza = null;
        cola = null;
        actual = null;
        tamanio = 0;
    }

    public void agregar(Cancion cancion) {
        NodoDoble nuevo = new NodoDoble(cancion);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }

        tamanio++;
    }

    public void mostrarPlaylist() {
        NodoDoble temp = cabeza;

        if (temp == null) {
            System.out.println("La playlist está vacía");
            return;
        }

        while (temp != null) {
            temp.dato.reproducir();
            temp = temp.siguiente;
        }
    }

    public void mostrarActual() {
        if (actual != null) {
            actual.dato.reproducir();
        } else {
            System.out.println("No hay canción actual");
        }
    }

    public void siguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            actual.dato.reproducir();
        } else {
            System.out.println("No hay siguiente canción");
        }
    }

    public void anterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            actual.dato.reproducir();
        } else {
            System.out.println("No hay canción anterior");
        }
    }

    public void eliminarActual() {
        if (actual == null) {
            System.out.println("No hay canción para eliminar");
            return;
        }

        if (cabeza == cola) {
            cabeza = null;
            cola = null;
            actual = null;
        } else if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            actual = cabeza;
        } else if (actual == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
            actual = cola;
        } else {
            NodoDoble anteriorNodo = actual.anterior;
            NodoDoble siguienteNodo = actual.siguiente;

            anteriorNodo.siguiente = siguienteNodo;
            siguienteNodo.anterior = anteriorNodo;

            actual = siguienteNodo;
        }

        tamanio--;
        System.out.println("Canción eliminada correctamente");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Examen_final_ipc1_202502428;

/**
 *
 * @author kfuce
 */
public class Examenn_final_ipc1_202502428 {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        Cancion c1 = new Cancion("En donde estas", 200, "Junior H");
        Cancion c2 = new Cancion("Mis llamadas", 180, "Junior H");
        Cancion c3 = new Cancion("Valle de Sombras", 210, "Junior H");

        playlist.agregar(c1);
        playlist.agregar(c2);
        playlist.agregar(c3);

        System.out.println("LISTA INICIAL:");
        playlist.mostrarPlaylist();

        System.out.println("\nCANCION ACTUAL:");
        playlist.mostrarActual();

        System.out.println("\nSIGUIENTE:");
        playlist.siguiente();

        System.out.println("\nSIGUIENTE:");
        playlist.siguiente();

        System.out.println("\nANTERIOR:");
        playlist.anterior();

        System.out.println("\nELIMINAR ACTUAL:");
        playlist.eliminarActual();

        System.out.println("\nLISTA FINAL:");
        playlist.mostrarPlaylist();
    }
    
}

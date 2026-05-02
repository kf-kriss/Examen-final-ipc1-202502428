/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_final_ipc1_202502428;

public class Cancion extends Multimedia {
    private String artista;

    public Cancion(String titulo, int duracion, String artista) {
        super(titulo, duracion);
        this.artista = artista;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo + " - " + artista);
    }
}
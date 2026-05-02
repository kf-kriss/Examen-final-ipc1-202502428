/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_final_ipc1_202502428;

/**
 *
 * @author kfuce
 */
public abstract class Multimedia {
    protected String titulo;
    protected int duracion;

    public Multimedia(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public abstract void reproducir();
}

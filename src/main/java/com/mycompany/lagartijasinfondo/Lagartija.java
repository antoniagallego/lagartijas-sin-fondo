/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lagartijasinfondo;

/**
 *
 * @author galle
 */

public class Lagartija {
    private int estomago;
    private boolean viva;

    public Lagartija() {
        estomago = 0;
        viva = true;
    }

    public void comerMoscaAzul() {
        estomago += 1;
        revisarVida();
    }

    public void comerMoscaVerde() {
        estomago += 2;
        revisarVida();
    }

    public void comerDona() {
        estomago -= 3;
        revisarVida();
    }

    private void revisarVida() {
        if (estomago < 0) {
            viva = false;
        } else {
            viva = true;
        }
    }

    public boolean estaLlena() {
        return estomago >= 10;
    }

    public boolean estarViva() {
        return viva;
    }

    public int getEstomago() {
        return estomago;
    }

    public void mostrarInformacion() {
        System.out.println("Estomago: " + estomago);
        System.out.println("Viva: " + viva);
        System.out.println("Llena: " + estaLlena());
        System.out.println();
    }
}

// Antonia Gallego Marin
// Mariapaz Bustamante Patiño
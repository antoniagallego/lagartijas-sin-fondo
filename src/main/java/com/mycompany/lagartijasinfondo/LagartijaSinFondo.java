/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lagartijasinfondo;

/**
 *
 * @author galle
 */

public class LagartijaSinFondo {

    public static void main(String[] args) {
        Lagartija lag = new Lagartija();

        lag.mostrarInformacion();         
        lag.comerMoscaAzul();
        lag.mostrarInformacion();
        lag.comerMoscaVerde();
        lag.mostrarInformacion();
        lag.comerDona();
        lag.mostrarInformacion();

        lag.comerMoscaVerde();
        lag.comerMoscaVerde();
        lag.comerMoscaVerde();
        lag.comerMoscaVerde();
        lag.comerMoscaVerde();
        lag.mostrarInformacion();

        System.out.println("Estomago final: " + lag.getEstomago());
        System.out.println("Esta viva? " + lag.estarViva());
        System.out.println("Esta llena? " + lag.estaLlena());
    }
}

// Antonia Gallego Marin
// Mariapaz Bustamante Patiño

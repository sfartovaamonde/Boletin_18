package com.dam1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ConversorTemperaturas obx = new ConversorTemperaturas();
        try {
            obx.centigradosAFharenheit();

        } catch ( TemperaturaErradaExcepcion ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.toString());
        }

        try {
            obx.centígradosAReamur();;

        }catch ( TemperaturaErradaExcepcion ex) {
            JOptionPane.showMessageDialog(null, " ERROR " +ex.toString());
        }

    }
}

package com.dam1;

import javax.swing.*;

public class ConversorTemperaturas {
    public void centigradosAFharenheit() throws TemperaturaErradaExcepcion{
        float gradosCentigrados, gradosFarenheit;
        final float c = (float) 1.8;
        final float b = (float) 32;
        final float a = (float) 80;

        gradosCentigrados = (float) Integer.parseInt(JOptionPane.showInputDialog(" grados centigrados"));
        if ( gradosCentigrados<80)
            throw new TemperaturaErradaExcepcion(" NON SE PODE CONVERSAR");
        else
            // farenheit = (centigrados * 1.8) + 32
        gradosFarenheit = (gradosCentigrados * c) + b;

        JOptionPane.showMessageDialog(null, " Grados Farenheit = " + gradosFarenheit + " Fº");

    }
    public void centígradosAReamur() throws TemperaturaErradaExcepcion{
        float gradosCentigrados, gradosReamur;
        final float x = (float) 2;
        final float d = (float) 5;
        final float z = (float) 80;


        gradosCentigrados = (float) Integer.parseInt(JOptionPane.showInputDialog(" grados centigrados"));

        if ( gradosCentigrados<80)
            throw new TemperaturaErradaExcepcion(" NON SE PODE CONVERSAR");
        else
            // reaumur = (2*centigrados)/5
            gradosReamur = (gradosCentigrados * x)/d;

        JOptionPane.showMessageDialog(null, " Grados Reaumur = " + gradosReamur + " grados ");

    }
}

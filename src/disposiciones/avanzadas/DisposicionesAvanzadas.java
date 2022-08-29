/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disposiciones.avanzadas;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Usuario
 */
public class DisposicionesAvanzadas {

    public static void main(String[] args) {
        ventanaCajas b = new ventanaCajas();
    }

}

class ventanaCajas extends JFrame {

    public ventanaCajas() {
        setBounds(200, 200, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Disposiciones avanzadas");

        JLabel label_nombre = new JLabel("Nombre: ");
        JTextField nombre_espacio = new JTextField(10);

        JLabel label_contrasena = new JLabel("Contraseña: ");
        JTextField contrasena_espacio = new JTextField(10);

        nombre_espacio.setMaximumSize(nombre_espacio.getPreferredSize());
        contrasena_espacio.setMaximumSize(contrasena_espacio.getPreferredSize());

        Box cajaH1 = Box.createHorizontalBox();
        Box cajaH2 = Box.createHorizontalBox();
        Box cajaH3 = Box.createHorizontalBox();

        cajaH1.add(label_nombre);
        cajaH1.add(Box.createHorizontalStrut(10));
        cajaH1.add(nombre_espacio);

        cajaH2.add(label_contrasena);
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(contrasena_espacio);

        JButton botonaceptar = new JButton("Aceptar");
        JButton botoncancelar = new JButton("Cancelar");

        cajaH3.add(botonaceptar);
        cajaH3.add(Box.createGlue());
        cajaH3.add(botoncancelar);

        Box cajaV = Box.createVerticalBox();

        cajaV.add(cajaH1);

        cajaV.add(cajaH2);

        cajaV.add(cajaH3);

        add(cajaV, BorderLayout.CENTER);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOptionPane;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.Component.*;

/**
 *
 * @author Usuario
 */
class ventana1 extends JFrame{
    laminitas tipola,tipo_mensajela,mensajela,opcionla,entradala,confirmarla;
    public ventana1(){
        
        setBounds(200,200,500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Prueba de clase JOptionPane");
        setVisible(true);
        
        setLayout(new BorderLayout());
        
        
        
        JPanel laminamostrar=new JPanel();
        JButton botonmostrar=new JButton("Mostrar");
        botonmostrar.addActionListener(new accionmostrar());
        laminamostrar.add(botonmostrar);
        
        add(laminamostrar, BorderLayout.SOUTH);
        
        
        
        //**********LAMINA CUADRICULA********************************************************
        JPanel l2=new JPanel();
        l2.setLayout(new GridLayout(2,3));
        
        String[] tipo={"Mensaje","Confirmar","Opción","Entrada"};
        
        String[] tipomensaje={"ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"};
        
        String[] mensaje={"Cadena","Icono","Componente","Otros","Object[]"};
        
        
        String[] confirmar={"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"};
        
        String[] opcion={"String[]","Icon[]","Object[]"};
        
        
        String[] entrada={"Campo de texto","Combo"};
        
        tipola=new laminitas("Tipo",tipo);
        tipo_mensajela=new laminitas("Tipo de mensaje",tipomensaje);
        mensajela=new laminitas("Mensaje",mensaje);
        confirmarla=new laminitas("Confirmar",confirmar);
        opcionla=new laminitas("Opción",opcion);
        entradala=new laminitas("Entrada",entrada);    
        
        l2.add(tipola);
        l2.add(tipo_mensajela);
        l2.add(mensajela);
        
        l2.add(confirmarla);
        l2.add(opcionla);
        l2.add(entradala);
        add(l2, BorderLayout.CENTER);
        
        //**********FIN LAMINA**********************************************************************
        
        
    }
    
    private class accionmostrar implements ActionListener{
        
            
        public void actionPerformed(ActionEvent e) {
            Icon uganda=new ImageIcon("uganda.jpg");
            
            if(tipola.getselectionn().equals("Mensaje")){
                JOptionPane.showMessageDialog(ventana1.this,mensajela.mensaje(), "MESSAGE_DIALOG",tipo_mensajela.tipodemensaje());
            }
            
            if(tipola.getselectionn().equals("Opción")){
                JOptionPane.showOptionDialog(ventana1.this, mensajela.mensaje(), "OPTION_DIALOG",confirmarla.tipoopcion(), tipo_mensajela.tipodemensaje(), null, (Object[]) opcionla.listaopciones(), 0);
            }
            if(tipola.getselectionn().equals("Confirmar")){
                JOptionPane.showConfirmDialog(ventana1.this, mensajela.mensaje(), "CONFIRM_DIALOG", confirmarla.tipoopcion(),tipo_mensajela.tipodemensaje() );
            }
            if(tipola.getselectionn().equals("Entrada")){
                JOptionPane.showInputDialog(ventana1.this, mensajela.mensaje(), "INPUT_DIALOG",tipo_mensajela.tipodemensaje(),null,(Object[]) opcionla.listaopciones(),0);
            }
        }
        
 }
}





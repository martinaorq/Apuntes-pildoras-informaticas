/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


class laminitas extends JPanel{
        JRadioButton radiobtn;
        ButtonGroup grupo1;
    public laminitas(String titulo, String[] opciones){
        
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        grupo1=new ButtonGroup();
        
        for (int i=0; i<opciones.length;i++){
            
            String nombre= opciones[i];
            
            radiobtn=new JRadioButton(nombre);
            
            radiobtn.setSelected(i==0);
            
            radiobtn.setActionCommand(nombre);
            
            grupo1.add(radiobtn);
            
            add(radiobtn);
            
            
            
            
                                            }
       
    }
    public String getselectionn(){
        String selection=grupo1.getSelection().getActionCommand();
        return selection;
        
       
    }
    public int tipodemensaje(){
        String selection=grupo1.getSelection().getActionCommand();
        
        if (selection.equals("ERROR_MESSAGE")){
            return 0;
        }
        if (selection.equals("INFORMATION_MESSAGE")){
            return 1;
        }
        if (selection.equals("WARNING_MESSAGE")){
            return 2;
        }
        if (selection.equals("QUESTION_MESSAGE")){
            return 3;
        }
        if (selection.equals("PLAIN_MESSAGE")){
            return -1;
        }
        else{
            return 900;
        }
    }
    
    
    public Object mensaje(){
        String selection=grupo1.getSelection().getActionCommand();
        GregorianCalendar calendario=new GregorianCalendar();
        Icon uganda=new ImageIcon("imagenes/uganda.png");
        Object[] miarray={
            new JButton("Botón"),
            "Mi texto",
            calendario.getTime(),
            uganda
        };
        
        if (selection.equals("Cadena")){
            return "Esto es una cadena de texto";
        }
        if (selection.equals("Icono")){
            return uganda;
        }
        if (selection.equals("Componente")){
            return new JButton("Un botón");
        }
        if (selection.equals("Otros")){
            return calendario.getTime();
        }
        if (selection.equals("Object[]")){
            return miarray;
        }
        else{return 0;}
    }
    
    public int tipoopcion(){
        String selection=grupo1.getSelection().getActionCommand();
        
        if(selection.equals("DEFAULT_OPTION")){
                return -1;
        }
        if(selection.equals("YES_NO_OPTION")){
            return 0;
        }
        if(selection.equals("YES_NO_CANCEL_OPTION")){
            return 1;
        }
        if(selection.equals("OK_CANCEL_OPTION")){
            return 2;
        }
        
        else{return 0;}
    }
    
    public Object listaopciones(){
        String selection=grupo1.getSelection().getActionCommand();
        GregorianCalendar calendario=new GregorianCalendar();
        Object []t={};
        
        if(selection.equals("String[]")){
            Object[] array1={
            "Rojo",
            "Verde",
            "Azul"};
            return array1;
        }
        if(selection.equals("Icon[]")){
            Object[] array1={
            new ImageIcon("imagenes/azul.png"),
            new ImageIcon("imagenes/rojo.png")};
            return array1;
        }
        if(selection.equals("Object[]")){
            Object[] array1={
            new JButton("Botón"),
            new ImageIcon("imagenes/rojo.png"),
            calendario.getTime()};
            return array1;
        }
        if(selection.equals("Combo")){
            Object[] array1={
            new JButton("Botón"),
            new ImageIcon("imagenes/rojo.png"),
            calendario.getTime()};
            return array1;
        }
        else{
            return t;
        }
    }
     
}

    


package com.example.Vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.example.Modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz2 extends JFrame{
    JTable tabla;
    DefaultTableModel modelo;
    JPanel panelg;
    JScrollPane scpanel01;
    
    public Interfaz2(){
        setTitle("Consulta 2");
        setSize(500,320);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        

        panelg=new JPanel();
        panelg.setBackground(new Color(177,92,197));
        
        String[] columnas={"ID","Constructora","Habitaciones","Ciudad"};
        ArrayList<String[]> datos_vo=Consulta2VO.valores();
        String[][] datos=new String[datos_vo.size()][4];
        for (int i = 0; i < datos_vo.size(); i++) {
            int j=0;
            for (String s : datos_vo.get(i)) {
                datos[i][j]=s; 
                //System.out.println(s);   
                j++;
            }
        }
        
        modelo=new DefaultTableModel(datos,columnas);
        tabla=new JTable(modelo);

        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(20,20,440,230);
        add(scpanel01);
        
        
        add(panelg);
        setVisible(true);
    }
}

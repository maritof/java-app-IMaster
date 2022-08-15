package com.example.Modelo.VO;
import com.example.Modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta1VO {

    public static ArrayList<String[]> valores() {
        ArrayList<String[]> salida_vo=new ArrayList<String[]>();
        
        try {
            ResultSet rs=Consulta1DAO.consulta();
            //ID_Lider,Nombre,Primer_Apellido,Ciudad_Residencia
            while(rs.next()){
                int ID=rs.getInt("ID_Lider");
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Primer_Apellido");
                String ciudad=rs.getString("Ciudad_Residencia");
                salida_vo.add(new String[]{ID+"",nombre,apellido,ciudad});
                //System.out.println(String.format("%5d %15s %15s %15s", ID, nombre,apellido,ciudad));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida_vo;        
    }
}

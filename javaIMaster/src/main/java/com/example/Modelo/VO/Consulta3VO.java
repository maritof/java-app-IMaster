package com.example.Modelo.VO;

import com.example.Modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta3VO {
    public static ArrayList<String[]> valores() {
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();

        try {
            ResultSet rs = Consulta3DAO.consulta();
            // ID_Compra, Constructora, Banco_Vinculado
            while (rs.next()) {
                int ID = rs.getInt("ID_Compra");
                String constructora = rs.getString("Constructora");
                String banco = rs.getString("Banco_Vinculado");
                salida_vo.add(new String[] { ID + "", constructora, banco });
                // System.out.println(String.format("%5d %15s %15s %15s", ID,
                // nombre,apellido,ciudad));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida_vo;
    }
}

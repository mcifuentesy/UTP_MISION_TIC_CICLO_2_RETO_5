package view;

import controller.*;
import model.vo.*;

//AGREGADOS ULTIMAMENTE

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.event.*;
import java.awt.event.*;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;

import java.io.*;
import java.lang.*;
import java.util.*;

import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
//CIERRE AGREGADOS ULTIMAMENTE

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VistaRequerimientosReto4_79 extends JFrame {
    
    Container panelContenido;
    
    public static final ControladorRequerimientosReto4_79 controlador = new ControladorRequerimientosReto4_79();

    public static void inicializarJFrame(String titulo) throws SQLException {

        ArrayList<Consulta1VO_79> listaRequemiento1 = controlador.consultarRequerimiento1();
        
        String arr[][] = new String [listaRequemiento1.size()][4];

        Integer a = 0;
        Integer b = 0;
        for (Consulta1VO_79 req1 : listaRequemiento1) {
                //check to see if the number is prime
                    b = 0;
                    arr[a][b] = req1.getFechaCompra();
                    b = 1;
                    arr[a][b] = req1.getNombreProveedor();
                    b = 2;
                    arr[a][b] = req1.getCodigoCompra();
                    b = 3;
                    arr[a][b] = req1.getValorPagado();
                    a = a + 1;
                    }
        ArrayList<Consulta2VO_79> listaRequemiento2 = controlador.consultarRequerimiento2();
        
        String arr2[][] = new String [listaRequemiento2.size()][4];

        Integer c = 0;
        Integer d = 0;
        for (Consulta2VO_79 req2 : listaRequemiento2) {
                //check to see if the number is prime
                    d = 0;
                    arr2[c][d] = req2.getFechaCompra();
                    d = 1;
                    arr2[c][d] = req2.getNombreProveedor();
                    d = 2;
                    arr2[c][d] = req2.getCodigoCompra();
                    d = 3;
                    arr2[c][d] = req2.getValorPagado();
                    c = c + 1;
                    }

        ArrayList<Consulta3VO_79> listaRequemiento3 = controlador.consultarRequerimiento3();
        
        String arr3[][] = new String [listaRequemiento3.size()][2];

        Integer e = 0;
        Integer ff = 0;
        for (Consulta3VO_79 req2 : listaRequemiento3) {
                //check to see if the number is prime
                    ff = 0;
                    arr3[e][ff] = req2.getFechaCompra();
                    ff = 1;
                    arr3[e][ff] = req2.getNombreProveedor();
                    ff = 2;
                    e = e + 1;
                    }
        
        String col[] = {"ID_Proyecto", "Fecha_Inicio", "Banco_Vinculado", "Serial"};
        JFrame frame = new JFrame(titulo);
        JPanel panel = new JPanel();
        JTable table = new JTable(arr,col);
        JLabel label1 = new JLabel("Test");
        label1.setBounds(50,50, 100,30);
        label1.setText("TABLAS DE RESULTADOS CONSULTAS REALIZADAS EN SQLITE-3 Y PUESTAS EN ESTE PANEL");
        label1.setFont(new Font("Arial Black", Font.PLAIN, 20));
        panel.add(label1);
        table.setName("Consulta 1");
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.yellow);
        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(500, 250));
        panel.add(pane);
        frame.add(panel);
        frame.setSize(800,800);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String col2[] = {"Nombre", "Salario", "deducible", "apellidos"};
        JTable table2 = new JTable(arr2,col2);
        JTableHeader header2 = table2.getTableHeader();
        header2.setBackground(Color.yellow);
        JScrollPane pane2 = new JScrollPane(table2);
        pane2.setPreferredSize(new Dimension(500, 250));
        panel.add(pane2);
        frame.add(panel);
        frame.setSize(800,800);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String col3[] = {"Id_proyecto", "nom_ape (nombre y apellido)"};
        JTable table3 = new JTable(arr3,col3);
        JTableHeader header3 = table3.getTableHeader();
        header3.setBackground(Color.yellow);
        JScrollPane pane3 = new JScrollPane(table3);
        pane3.setPreferredSize(new Dimension(500, 250));
        panel.add(pane3);
        frame.add(panel);
        frame.setSize(1280,680);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
}

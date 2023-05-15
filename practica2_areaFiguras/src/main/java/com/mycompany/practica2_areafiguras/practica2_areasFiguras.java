
package com.mycompany.practica2_areafiguras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author carlossalcidoa
 */
public class practica2_areasFiguras extends JFrame implements ActionListener{
    
    JLabel lblBase, lblAltura, lblArea, lblNumLados, lblMedidaLado;
    JTextField txtBase, txtAltura, txtArea, txtNumLados, txtMedidaLado;
    JComboBox cmbOpcion;
    JButton btnCalcularArea, btnCalcularPoligono;
    triangulo t;
    cuadrado c;
    rectangulo r;
    poligono p;
    
    public practica2_areasFiguras(){
        this.setBounds(0, 0, 400, 400);
        
        lblBase = new JLabel();
        lblBase.setBounds(10, 20, 100, 20);
        lblBase.setName("lblBase");
        lblBase.setText("Ingrese Base:");
        lblBase.setVisible(true);
        this.add(lblBase);
        
        txtBase = new JTextField();
        txtBase.setBounds(120, 20, 100, 20);
        txtBase.setName("txtBase");
        txtBase.setText("");
        txtBase.setVisible(true);
        this.add(txtBase);
        
        
        this.setBounds(0, 0, 400, 400);
        lblAltura = new JLabel();
        lblAltura.setBounds(10, 50, 100, 20);
        lblAltura.setName("lblAltura");
        lblAltura.setText("Ingrese Altura:");
        lblAltura.setVisible(true);
        this.add(lblAltura);
        
        txtAltura = new JTextField();
        txtAltura.setBounds(120, 50, 100, 20);
        txtAltura.setName("txtAltura");
        txtAltura.setText("");
        txtAltura.setVisible(true);
        this.add(txtAltura);
        
        
        this.setBounds(0, 0, 400, 400);
        lblArea = new JLabel();
        lblArea.setBounds(10, 90, 100, 20);
        lblArea.setName("lblArea");
        lblArea.setText("Àrea:");
        lblArea.setVisible(true);
        this.add(lblArea);
        
        txtArea = new JTextField();
        txtArea.setBounds(120, 90, 100, 20);
        txtArea.setName("txtArea");
        txtArea.setText("");
        txtArea.setVisible(true);
        this.add(txtArea);
        
        
        cmbOpcion = new JComboBox();
        cmbOpcion.setBounds(120, 120, 120, 20);
        cmbOpcion.setName("");
        cmbOpcion.addItem("Triangulo");
        cmbOpcion.addItem("Cuadrado");
        cmbOpcion.addItem("Rectangulo");
        cmbOpcion.setVisible(true);
        cmbOpcion.addActionListener(this);
        this.add(cmbOpcion);
        
        
        lblNumLados = new JLabel();
        lblNumLados.setBounds(10, 185, 210, 30);
        lblNumLados.setName("lblNumLados");
        lblNumLados.setText("Ingrese Num de Lados:");
        lblNumLados.setVisible(true);
        this.add(lblNumLados);
        
        txtNumLados = new JTextField();
        txtNumLados.setBounds(180, 190, 100, 20);
        txtNumLados.setName("txtBase");
        txtNumLados.setText("");
        txtNumLados.setVisible(true);
        this.add(txtNumLados);
        
        lblMedidaLado = new JLabel();
        lblMedidaLado.setBounds(10, 220, 220, 40);
        lblMedidaLado.setName("lblNumLados");
        lblMedidaLado.setText("Ingrese Medida de un Lado:");
        lblMedidaLado.setVisible(true);
        this.add(lblMedidaLado);
        
        txtMedidaLado = new JTextField();
        txtMedidaLado.setBounds(180, 230, 100, 20);
        txtMedidaLado.setName("txtBase");
        txtMedidaLado.setText("");
        txtMedidaLado.setVisible(true);
        this.add(txtMedidaLado);
        
        btnCalcularArea = new JButton();
        btnCalcularArea.setBounds(120, 150, 100, 20);
        btnCalcularArea.setName("");
        btnCalcularArea.setText("Calcular Àrea");
        btnCalcularArea.setVisible(true);
        btnCalcularArea.addActionListener(this);
        this.add(btnCalcularArea);
        
        btnCalcularPoligono = new JButton();
        btnCalcularPoligono.setBounds(80, 275, 200, 20);
        btnCalcularPoligono.setName("");
        btnCalcularPoligono.setText("Calcular Àrea de un Polígono");
        btnCalcularPoligono.setVisible(true);
        btnCalcularPoligono.addActionListener(this);
        this.add(btnCalcularPoligono);
        
        this.setLayout(null);
        this.setVisible(true);
        
        t=new triangulo();//crear el objeto
        c=new cuadrado();
        r=new rectangulo();
        p=new poligono();
        
    }
    
    public static void main(String[] args){
        practica2_areasFiguras ob = new practica2_areasFiguras();
        ob.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==btnCalcularArea){
            switch(cmbOpcion.getSelectedItem().toString()){
                case "Triangulo": 
                    t.setBase(Double.parseDouble(txtBase.getText()));
                    t.setAltura(Double.parseDouble(txtAltura.getText()));
                    t.CalcularArea();
                    txtArea.setText(String.valueOf(t.getArea()));break;
                case "Cuadrado": 
                    c.setBase(Double.parseDouble(txtBase.getText()));
                    c.CalcularArea();
                    txtArea.setText(String.valueOf(c.getArea()));break;
                case "Rectangulo": 
                    r.setBase(Double.parseDouble(txtBase.getText()));
                    r.setAltura(Double.parseDouble(txtAltura.getText()));
                    r.CalcularArea();
                    txtArea.setText(String.valueOf(r.getArea()));break;                    
            }
        } 
        
        if(arg0.getSource()==btnCalcularPoligono){
            p.setNumLados(Double.parseDouble(txtNumLados.getText()));
            p.setLado(Double.parseDouble(txtMedidaLado.getText()));
            p.CalcularPerimetro();
            p.CalcularApotema();
            p.CalcularArea();
            txtArea.setText(String.valueOf(p.getArea())); 
        }
    }
}

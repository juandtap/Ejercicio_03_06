/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_06.View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author Diego
 */
public class MainWindow extends JFrame {
    
    private JPanel configPanel;
    private JPanel dimensionPanel;
    private JPanel buttonsPanel;
    private JPanel formColorPanel;
    private JPanel drawPanel;
    private ArrayList<JLabel> labelList;
    private JTextField jTextFieldHeight;
    private JTextField jTextFieldWidth;
    private JComboBox jComboBoxFigure;
    private JComboBox jComboBoxColors;
    private JButton jButtonDraw;
    private JButton jButtonClear;
    

    public MainWindow(String title) {
        super(title);
        this.setSize(700, 800);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        initComponents();
        
        
    }
    
    private void initComponents(){
        
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        configPanel = new JPanel();
        configPanel.setBorder(new TitledBorder("Config"));
        formColorPanel = new JPanel();
        
       
        dimensionPanel = new JPanel();
        buttonsPanel = new JPanel();
        getContentPane().add(configPanel);
        configPanel.add(formColorPanel);
        configPanel.add(dimensionPanel);
        configPanel.add(buttonsPanel);
        
        initLabels();
        initTextFields();
        initComboBox();
        initButtons();
        
        setPanels();
        
    }
    
    private void setPanels(){
       formColorPanel.add(labelList.get(0));
       formColorPanel.add(jComboBoxFigure);
       formColorPanel.add(labelList.get(1));
       formColorPanel.add(jComboBoxColors);
       
       dimensionPanel.add(labelList.get(2));
       dimensionPanel.add(labelList.get(3));
       dimensionPanel.add(jTextFieldHeight);
       dimensionPanel.add(labelList.get(4));
       dimensionPanel.add(jTextFieldWidth);
       
       buttonsPanel.add(jButtonDraw);
       buttonsPanel.add(jButtonClear);
        
    }
    
    private void initLabels(){
        labelList = new ArrayList<>();
       
        labelList.add(new JLabel("Seleccionar Figura"));
        labelList.add(new JLabel("Seleccionar Color"));
        labelList.add(new JLabel("Dimensiones:"));
        labelList.add(new JLabel("Alto"));
        labelList.add(new JLabel("Ancho"));
        
        
    }
    
    private void initTextFields(){
        
        
        jTextFieldHeight = new JTextField(3);
        jTextFieldWidth = new JTextField(3);
    }
    
    private void initComboBox(){
        
        jComboBoxColors = new JComboBox();
        jComboBoxFigure = new JComboBox();
        
        jComboBoxFigure.addItem("Estrella");
        jComboBoxFigure.addItem("Cuadrado");
        jComboBoxFigure.addItem("Circulo");
        jComboBoxFigure.addItem("Rectangulo");
        jComboBoxFigure.addItem("Triangulo");
        
        jComboBoxColors.addItem("Amarillo");
        jComboBoxColors.addItem("Azul");
        jComboBoxColors.addItem("Rojo");
        jComboBoxColors.addItem("Verde");
        
    }
    
    private void initButtons(){
        jButtonClear = new JButton("limpiar");
        jButtonDraw = new JButton("Dibujar");
    }
    
}

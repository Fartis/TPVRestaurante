/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controlador.ControladorPedidos;
import Modelo.Camarero;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manuel David Villalba Escamilla
 */
public class JDialogMenu extends javax.swing.JDialog {

    /**
     * Creates new form JDialogMenu
     */
    public JDialogMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        controladorPedidos = ControladorPedidos.getSingleton();
        initComponents();
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        cargaBotones();
        setModelo();
    }

    private void cargaBotones() {
        jButtonCocaCola.setIcon(getScaledImage("recursos/cocacola.png"));
        jButtonLight.setIcon(getScaledImage("recursos/light.jpg"));
        jButtonZero.setIcon(getScaledImage("recursos/zero.jpg"));
        jButtonNaranja.setIcon(getScaledImage("recursos/Naranja.jpg"));
        jButtonLimon.setIcon(getScaledImage("recursos/limon.jpg"));
        jButton7up.setIcon(getScaledImage("recursos/7up.jpg"));
        jButtonAgua.setIcon(getScaledImage("recursos/agua.jpg"));
        jButtonAquarius.setIcon(getScaledImage("recursos/aquarius.png"));
        jButtonAquariusNaranja.setIcon(getScaledImage("recursos/aquariusnaranja.png"));
        jButtonSinAlcohol.setIcon(getScaledImage("recursos/00.jpg"));
        jButtonNestea.setIcon(getScaledImage("recursos/nestea.jpg"));
        jButtonTonica.setIcon(getScaledImage("recursos/tonica.jpg"));
        jButtonAmstel.setIcon(getScaledImage("recursos/Amstel.jpg"));
        jButtonBocadillo1.setIcon(getScaledImage("recursos/bocadillo1.jpg"));
        jButtonBocadillo2.setIcon(getScaledImage("recursos/bocadillo2.jpg"));
        jButtonBocadillo3.setIcon(getScaledImage("recursos/bocadillo3.jpg"));
        jButtonBocadillo4.setIcon(getScaledImage("recursos/bocadillo4.jpg"));
        jButtonBocadillo5.setIcon(getScaledImage("recursos/bocadillo5.jpg"));
        jButtonHamburguesa1.setIcon(getScaledImage("recursos/hamburguesa1.jpg"));
        jButtonHamburguesa2.setIcon(getScaledImage("recursos/hamburguesa2.jpg"));
        jButtonHamburguesa3.setIcon(getScaledImage("recursos/hamburguesa3.jpg"));
        jButtonHamburguesa4.setIcon(getScaledImage("recursos/hamburguesa4.jpg"));
        jButtonHamburguesa5.setIcon(getScaledImage("recursos/hamburguesa5.jpg"));
        jButtonPizza1.setIcon(getScaledImage("recursos/pizza1.jpg"));
        jButtonPizza2.setIcon(getScaledImage("recursos/pizza2.png"));
        jButtonPizza3.setIcon(getScaledImage("recursos/pizza3.png"));
        jButtonPizza4.setIcon(getScaledImage("recursos/pizza4.jpg"));
        jButtonPizza5.setIcon(getScaledImage("recursos/pizza5.jpg"));
        jButtonComplementos1.setIcon(getScaledImage("recursos/complemento1.jpg"));
        jButtonComplementos2.setIcon(getScaledImage("recursos/complemento2.jpg"));
        jButtonComplementos3.setIcon(getScaledImage("recursos/complemento3.jpg"));
        jButtonComplementos4.setIcon(getScaledImage("recursos/complemento4.jpg"));
        jButtonComplementos5.setIcon(getScaledImage("recursos/complemento5.jpg"));
        jButtonPromo1.setIcon(getScaledImage("recursos/promo1.jpg"));
        jButtonPromo2.setIcon(getScaledImage("recursos/promo2.jpg"));
        jButtonPromo3.setIcon(getScaledImage("recursos/promo3.jpg"));
        jButtonPromo4.setIcon(getScaledImage("recursos/promo4.jpg"));
        jButtonPromo5.setIcon(getScaledImage("recursos/promo5.jpg"));
    }

    public void setVisible(boolean bVisible, Camarero camarero, String mesa) {
        if (bVisible == false) {
            super.setVisible(bVisible);
            return;
        }
        jLayeredPaneBebidas.setVisible(false);
        jLayeredPaneHamburguesas.setVisible(false);
        jLayeredPaneBocadillos.setVisible(false);
        jLayeredPanePizza.setVisible(false);
        jLayeredPaneComplementos.setVisible(false);
        jLayeredPanePromociones.setVisible(false);
        this.camarero = camarero;
        this.mesa = mesa;
        removerElementos();
        setModelo();
        calcularTotal();
        super.setVisible(bVisible);
        return;
    }

    private ImageIcon getScaledImage(String srcImg) {
        ImageIcon imageIcon = new ImageIcon(srcImg);
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(290, 94, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);  // transform it back
        return imageIcon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonHamburguesas = new javax.swing.JButton();
        jButtonBocadillos = new javax.swing.JButton();
        jButtonBebidas = new javax.swing.JButton();
        jButtonPizza = new javax.swing.JButton();
        jButtonComplementos = new javax.swing.JButton();
        jButtonPromociones = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLayeredPaneBebidas = new javax.swing.JLayeredPane();
        jButtonCocaCola = new javax.swing.JButton();
        jButtonLimon = new javax.swing.JButton();
        jButtonLight = new javax.swing.JButton();
        jButtonNaranja = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButton7up = new javax.swing.JButton();
        jButtonNestea = new javax.swing.JButton();
        jButtonTonica = new javax.swing.JButton();
        jButtonAmstel = new javax.swing.JButton();
        jButtonSinAlcohol = new javax.swing.JButton();
        jButtonAgua = new javax.swing.JButton();
        jButtonAquariusNaranja = new javax.swing.JButton();
        jButtonAquarius = new javax.swing.JButton();
        jLayeredPaneHamburguesas = new javax.swing.JLayeredPane();
        jButtonHamburguesa1 = new javax.swing.JButton();
        jButtonHamburguesa2 = new javax.swing.JButton();
        jButtonHamburguesa3 = new javax.swing.JButton();
        jButtonHamburguesa4 = new javax.swing.JButton();
        jButtonHamburguesa5 = new javax.swing.JButton();
        jLayeredPaneBocadillos = new javax.swing.JLayeredPane();
        jButtonBocadillo1 = new javax.swing.JButton();
        jButtonBocadillo2 = new javax.swing.JButton();
        jButtonBocadillo3 = new javax.swing.JButton();
        jButtonBocadillo4 = new javax.swing.JButton();
        jButtonBocadillo5 = new javax.swing.JButton();
        jLayeredPanePizza = new javax.swing.JLayeredPane();
        jButtonPizza1 = new javax.swing.JButton();
        jButtonPizza2 = new javax.swing.JButton();
        jButtonPizza3 = new javax.swing.JButton();
        jButtonPizza4 = new javax.swing.JButton();
        jButtonPizza5 = new javax.swing.JButton();
        jLayeredPaneComplementos = new javax.swing.JLayeredPane();
        jButtonComplementos1 = new javax.swing.JButton();
        jButtonComplementos2 = new javax.swing.JButton();
        jButtonComplementos3 = new javax.swing.JButton();
        jButtonComplementos4 = new javax.swing.JButton();
        jButtonComplementos5 = new javax.swing.JButton();
        jLayeredPanePromociones = new javax.swing.JLayeredPane();
        jButtonPromo1 = new javax.swing.JButton();
        jButtonPromo2 = new javax.swing.JButton();
        jButtonPromo3 = new javax.swing.JButton();
        jButtonPromo4 = new javax.swing.JButton();
        jButtonPromo5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableListaProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonAceptarPedido = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonMetalico = new javax.swing.JRadioButton();
        jRadioButtonTarjeta = new javax.swing.JRadioButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonEliminarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorias"));

        jButtonHamburguesas.setText("Hamburguesas");
        jButtonHamburguesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHamburguesasActionPerformed(evt);
            }
        });

        jButtonBocadillos.setText("Bocadillos");
        jButtonBocadillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBocadillosActionPerformed(evt);
            }
        });

        jButtonBebidas.setText("Bebidas");
        jButtonBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBebidasActionPerformed(evt);
            }
        });

        jButtonPizza.setText("Pizzas");
        jButtonPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizzaActionPerformed(evt);
            }
        });

        jButtonComplementos.setText("Complementos");
        jButtonComplementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComplementosActionPerformed(evt);
            }
        });

        jButtonPromociones.setText("Promociones");
        jButtonPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPromocionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHamburguesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBocadillos, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jButtonBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jButtonPizza, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jButtonComplementos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jButtonPromociones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHamburguesas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBocadillos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonComplementos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLayeredPaneBebidas.setBorder(javax.swing.BorderFactory.createTitledBorder("Bebidas"));

        jButtonCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCocaColaActionPerformed(evt);
            }
        });

        jButtonLimon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimonActionPerformed(evt);
            }
        });

        jButtonLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLightActionPerformed(evt);
            }
        });

        jButtonNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNaranjaActionPerformed(evt);
            }
        });

        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButton7up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7upActionPerformed(evt);
            }
        });

        jButtonNestea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNesteaActionPerformed(evt);
            }
        });

        jButtonTonica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTonicaActionPerformed(evt);
            }
        });

        jButtonAmstel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmstelActionPerformed(evt);
            }
        });

        jButtonSinAlcohol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSinAlcoholActionPerformed(evt);
            }
        });

        jButtonAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAguaActionPerformed(evt);
            }
        });

        jButtonAquariusNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAquariusNaranjaActionPerformed(evt);
            }
        });

        jButtonAquarius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAquariusActionPerformed(evt);
            }
        });

        jLayeredPaneBebidas.setLayer(jButtonCocaCola, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonLimon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonLight, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonNaranja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonZero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButton7up, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonNestea, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonTonica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonAmstel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonSinAlcohol, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonAgua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonAquariusNaranja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBebidas.setLayer(jButtonAquarius, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneBebidasLayout = new javax.swing.GroupLayout(jLayeredPaneBebidas);
        jLayeredPaneBebidas.setLayout(jLayeredPaneBebidasLayout);
        jLayeredPaneBebidasLayout.setHorizontalGroup(
            jLayeredPaneBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneBebidasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPaneBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLight, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimon, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7up, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNestea, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSinAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAmstel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTonica, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAquariusNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAquarius, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jLayeredPaneBebidasLayout.setVerticalGroup(
            jLayeredPaneBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneBebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLight, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimon, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7up, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNestea, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTonica, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAmstel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSinAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAquarius, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAquariusNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPaneHamburguesas.setBorder(javax.swing.BorderFactory.createTitledBorder("Hamburguesas"));

        jButtonHamburguesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHamburguesa1ActionPerformed(evt);
            }
        });

        jButtonHamburguesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHamburguesa2ActionPerformed(evt);
            }
        });

        jButtonHamburguesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHamburguesa3ActionPerformed(evt);
            }
        });

        jButtonHamburguesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHamburguesa4ActionPerformed(evt);
            }
        });

        jButtonHamburguesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHamburguesa5ActionPerformed(evt);
            }
        });

        jLayeredPaneHamburguesas.setLayer(jButtonHamburguesa1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneHamburguesas.setLayer(jButtonHamburguesa2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneHamburguesas.setLayer(jButtonHamburguesa3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneHamburguesas.setLayer(jButtonHamburguesa4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneHamburguesas.setLayer(jButtonHamburguesa5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneHamburguesasLayout = new javax.swing.GroupLayout(jLayeredPaneHamburguesas);
        jLayeredPaneHamburguesas.setLayout(jLayeredPaneHamburguesasLayout);
        jLayeredPaneHamburguesasLayout.setHorizontalGroup(
            jLayeredPaneHamburguesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneHamburguesasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonHamburguesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneHamburguesasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPaneHamburguesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHamburguesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHamburguesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHamburguesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHamburguesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPaneHamburguesasLayout.setVerticalGroup(
            jLayeredPaneHamburguesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneHamburguesasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonHamburguesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHamburguesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHamburguesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHamburguesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHamburguesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPaneBocadillos.setBorder(javax.swing.BorderFactory.createTitledBorder("Bocadillos"));

        jButtonBocadillo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBocadillo1ActionPerformed(evt);
            }
        });

        jButtonBocadillo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBocadillo2ActionPerformed(evt);
            }
        });

        jButtonBocadillo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBocadillo3ActionPerformed(evt);
            }
        });

        jButtonBocadillo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBocadillo4ActionPerformed(evt);
            }
        });

        jButtonBocadillo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBocadillo5ActionPerformed(evt);
            }
        });

        jLayeredPaneBocadillos.setLayer(jButtonBocadillo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBocadillos.setLayer(jButtonBocadillo2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBocadillos.setLayer(jButtonBocadillo3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBocadillos.setLayer(jButtonBocadillo4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneBocadillos.setLayer(jButtonBocadillo5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneBocadillosLayout = new javax.swing.GroupLayout(jLayeredPaneBocadillos);
        jLayeredPaneBocadillos.setLayout(jLayeredPaneBocadillosLayout);
        jLayeredPaneBocadillosLayout.setHorizontalGroup(
            jLayeredPaneBocadillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneBocadillosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPaneBocadillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBocadillo1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBocadillo2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBocadillo5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBocadillo4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBocadillo3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPaneBocadillosLayout.setVerticalGroup(
            jLayeredPaneBocadillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneBocadillosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBocadillo1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBocadillo2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBocadillo3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBocadillo4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBocadillo5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPanePizza.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizzas"));

        jButtonPizza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizza1ActionPerformed(evt);
            }
        });

        jButtonPizza2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizza2ActionPerformed(evt);
            }
        });

        jButtonPizza3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizza3ActionPerformed(evt);
            }
        });

        jButtonPizza4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizza4ActionPerformed(evt);
            }
        });

        jButtonPizza5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizza5ActionPerformed(evt);
            }
        });

        jLayeredPanePizza.setLayer(jButtonPizza1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePizza.setLayer(jButtonPizza2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePizza.setLayer(jButtonPizza3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePizza.setLayer(jButtonPizza4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePizza.setLayer(jButtonPizza5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPanePizzaLayout = new javax.swing.GroupLayout(jLayeredPanePizza);
        jLayeredPanePizza.setLayout(jLayeredPanePizzaLayout);
        jLayeredPanePizzaLayout.setHorizontalGroup(
            jLayeredPanePizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPanePizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPanePizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPizza1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPizza2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPizza5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPizza4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPizza3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPanePizzaLayout.setVerticalGroup(
            jLayeredPanePizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPanePizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPizza1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPizza2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPizza3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPizza4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPizza5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPaneComplementos.setBorder(javax.swing.BorderFactory.createTitledBorder("Complementos"));

        jButtonComplementos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComplementos1ActionPerformed(evt);
            }
        });

        jButtonComplementos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComplementos2ActionPerformed(evt);
            }
        });

        jButtonComplementos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComplementos3ActionPerformed(evt);
            }
        });

        jButtonComplementos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComplementos4ActionPerformed(evt);
            }
        });

        jButtonComplementos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComplementos5ActionPerformed(evt);
            }
        });

        jLayeredPaneComplementos.setLayer(jButtonComplementos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneComplementos.setLayer(jButtonComplementos2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneComplementos.setLayer(jButtonComplementos3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneComplementos.setLayer(jButtonComplementos4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneComplementos.setLayer(jButtonComplementos5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneComplementosLayout = new javax.swing.GroupLayout(jLayeredPaneComplementos);
        jLayeredPaneComplementos.setLayout(jLayeredPaneComplementosLayout);
        jLayeredPaneComplementosLayout.setHorizontalGroup(
            jLayeredPaneComplementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneComplementosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPaneComplementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonComplementos1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonComplementos2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonComplementos5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonComplementos4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonComplementos3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jLayeredPaneComplementosLayout.setVerticalGroup(
            jLayeredPaneComplementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneComplementosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonComplementos1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonComplementos2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonComplementos3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonComplementos4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonComplementos5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPanePromociones.setBorder(javax.swing.BorderFactory.createTitledBorder("Promociones"));

        jButtonPromo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPromo1ActionPerformed(evt);
            }
        });

        jButtonPromo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPromo2ActionPerformed(evt);
            }
        });

        jButtonPromo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPromo3ActionPerformed(evt);
            }
        });

        jButtonPromo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPromo4ActionPerformed(evt);
            }
        });

        jButtonPromo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPromo5ActionPerformed(evt);
            }
        });

        jLayeredPanePromociones.setLayer(jButtonPromo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePromociones.setLayer(jButtonPromo2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePromociones.setLayer(jButtonPromo3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePromociones.setLayer(jButtonPromo4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePromociones.setLayer(jButtonPromo5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPanePromocionesLayout = new javax.swing.GroupLayout(jLayeredPanePromociones);
        jLayeredPanePromociones.setLayout(jLayeredPanePromocionesLayout);
        jLayeredPanePromocionesLayout.setHorizontalGroup(
            jLayeredPanePromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPanePromocionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPromo1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPanePromocionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPanePromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPromo2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPromo5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPromo4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPromo3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPanePromocionesLayout.setVerticalGroup(
            jLayeredPanePromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPanePromocionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPromo1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPromo2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPromo3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPromo4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPromo5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPaneBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPaneBocadillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPaneHamburguesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPanePizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPaneComplementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPanePromociones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPanePromociones)
                    .addComponent(jLayeredPaneHamburguesas)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLayeredPaneBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jLayeredPaneBocadillos)
                    .addComponent(jLayeredPanePizza, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPaneComplementos))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel3);

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de productos seleccionados:");

        jTableListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio unidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableListaProductos);

        jLabel2.setText("Total:");

        jTextFieldTotal.setEditable(false);

        jButtonAceptarPedido.setText("Aceptar");
        jButtonAceptarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarPedidoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodo de pago"));

        buttonGroup1.add(jRadioButtonMetalico);
        jRadioButtonMetalico.setText("Metalico");
        jRadioButtonMetalico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMetalicoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonTarjeta);
        jRadioButtonTarjeta.setText("Tarjeta");
        jRadioButtonTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonTarjeta)
                    .addComponent(jRadioButtonMetalico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonMetalico)
                .addGap(11, 11, 11)
                .addComponent(jRadioButtonTarjeta)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonEliminarTodo.setText("Todo");
        jButtonEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEliminarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTotal)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAceptarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEliminarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAceptarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBebidasActionPerformed
        // TODO add your handling code here:
        if (!jLayeredPaneBebidas.isVisible()) {
            jLayeredPaneHamburguesas.setVisible(false);
            jLayeredPaneBocadillos.setVisible(false);
            jLayeredPanePizza.setVisible(false);
            jLayeredPanePromociones.setVisible(false);
            jLayeredPaneComplementos.setVisible(false);
            jLayeredPaneBebidas.setVisible(true);
        }
    }//GEN-LAST:event_jButtonBebidasActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonHamburguesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHamburguesasActionPerformed
        // TODO add your handling code here:
        if (!jLayeredPaneHamburguesas.isVisible()) {
            jLayeredPaneBebidas.setVisible(false);
            jLayeredPaneBocadillos.setVisible(false);
            jLayeredPanePizza.setVisible(false);
            jLayeredPanePromociones.setVisible(false);
            jLayeredPaneComplementos.setVisible(false);
            jLayeredPaneHamburguesas.setVisible(true);
        }
    }//GEN-LAST:event_jButtonHamburguesasActionPerformed

    private void jButtonBocadillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBocadillosActionPerformed
        // TODO add your handling code here:
        if (!jLayeredPaneBocadillos.isVisible()) {
            jLayeredPaneBebidas.setVisible(false);
            jLayeredPaneHamburguesas.setVisible(false);
            jLayeredPanePizza.setVisible(false);
            jLayeredPanePromociones.setVisible(false);
            jLayeredPaneComplementos.setVisible(false);
            jLayeredPaneBocadillos.setVisible(true);
        }
    }//GEN-LAST:event_jButtonBocadillosActionPerformed

    private void jButtonPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPizzaActionPerformed
        // TODO add your handling code here:
        if (!jLayeredPanePizza.isVisible()) {
            jLayeredPaneHamburguesas.setVisible(false);
            jLayeredPaneBocadillos.setVisible(false);
            jLayeredPanePizza.setVisible(true);
            jLayeredPanePromociones.setVisible(false);
            jLayeredPaneComplementos.setVisible(false);
            jLayeredPaneBebidas.setVisible(false);
        }
    }//GEN-LAST:event_jButtonPizzaActionPerformed

    private void jButtonComplementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComplementosActionPerformed
        // TODO add your handling code here:
        if (!jLayeredPaneComplementos.isVisible()) {
            jLayeredPaneHamburguesas.setVisible(false);
            jLayeredPaneBocadillos.setVisible(false);
            jLayeredPanePizza.setVisible(false);
            jLayeredPanePromociones.setVisible(false);
            jLayeredPaneComplementos.setVisible(true);
            jLayeredPaneBebidas.setVisible(false);
        }
    }//GEN-LAST:event_jButtonComplementosActionPerformed

    private void jButtonPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromocionesActionPerformed
        // TODO add your handling code here:
        if (!jLayeredPanePromociones.isVisible()) {
            jLayeredPaneHamburguesas.setVisible(false);
            jLayeredPaneBocadillos.setVisible(false);
            jLayeredPanePizza.setVisible(false);
            jLayeredPanePromociones.setVisible(true);
            jLayeredPaneComplementos.setVisible(false);
            jLayeredPaneBebidas.setVisible(false);
        }
    }//GEN-LAST:event_jButtonPromocionesActionPerformed

    private void jButtonCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCocaColaActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 0);
    }//GEN-LAST:event_jButtonCocaColaActionPerformed

    private void jButtonLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLightActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 1);
    }//GEN-LAST:event_jButtonLightActionPerformed

    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZeroActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 2);
    }//GEN-LAST:event_jButtonZeroActionPerformed

    private void jButtonLimonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimonActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 3);
    }//GEN-LAST:event_jButtonLimonActionPerformed

    private void jButtonNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNaranjaActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 4);
    }//GEN-LAST:event_jButtonNaranjaActionPerformed

    private void jButton7upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7upActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 5);
    }//GEN-LAST:event_jButton7upActionPerformed

    private void jButtonNesteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNesteaActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 6);
    }//GEN-LAST:event_jButtonNesteaActionPerformed

    private void jButtonTonicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTonicaActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 7);
    }//GEN-LAST:event_jButtonTonicaActionPerformed

    private void jButtonAmstelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmstelActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 8);
    }//GEN-LAST:event_jButtonAmstelActionPerformed

    private void jButtonSinAlcoholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSinAlcoholActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 9);
    }//GEN-LAST:event_jButtonSinAlcoholActionPerformed

    private void jButtonAquariusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAquariusActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 10);
    }//GEN-LAST:event_jButtonAquariusActionPerformed

    private void jButtonAquariusNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAquariusNaranjaActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 11);
    }//GEN-LAST:event_jButtonAquariusNaranjaActionPerformed

    private void jButtonAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAguaActionPerformed
        // TODO add your handling code here:
        añadirProducto(1, 12);
    }//GEN-LAST:event_jButtonAguaActionPerformed

    private void jButtonBocadillo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBocadillo1ActionPerformed
        // TODO add your handling code here:
        añadirProducto(3, 0);
    }//GEN-LAST:event_jButtonBocadillo1ActionPerformed

    private void jButtonBocadillo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBocadillo2ActionPerformed
        // TODO add your handling code here:
        añadirProducto(3, 1);
    }//GEN-LAST:event_jButtonBocadillo2ActionPerformed

    private void jButtonBocadillo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBocadillo3ActionPerformed
        // TODO add your handling code here:
        añadirProducto(3, 2);
    }//GEN-LAST:event_jButtonBocadillo3ActionPerformed

    private void jButtonBocadillo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBocadillo4ActionPerformed
        // TODO add your handling code here:
        añadirProducto(3, 3);
    }//GEN-LAST:event_jButtonBocadillo4ActionPerformed

    private void jButtonBocadillo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBocadillo5ActionPerformed
        // TODO add your handling code here:
        añadirProducto(3, 4);
    }//GEN-LAST:event_jButtonBocadillo5ActionPerformed

    private void jButtonHamburguesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHamburguesa1ActionPerformed
        // TODO add your handling code here:
        añadirProducto(2, 0);
    }//GEN-LAST:event_jButtonHamburguesa1ActionPerformed

    private void jButtonHamburguesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHamburguesa2ActionPerformed
        // TODO add your handling code here:
        añadirProducto(2, 1);
    }//GEN-LAST:event_jButtonHamburguesa2ActionPerformed

    private void jButtonHamburguesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHamburguesa3ActionPerformed
        // TODO add your handling code here:
        añadirProducto(2, 2);
    }//GEN-LAST:event_jButtonHamburguesa3ActionPerformed

    private void jButtonHamburguesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHamburguesa4ActionPerformed
        // TODO add your handling code here:
        añadirProducto(2, 3);
    }//GEN-LAST:event_jButtonHamburguesa4ActionPerformed

    private void jButtonHamburguesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHamburguesa5ActionPerformed
        // TODO add your handling code here:
        añadirProducto(2, 4);
    }//GEN-LAST:event_jButtonHamburguesa5ActionPerformed

    private void jButtonPizza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPizza1ActionPerformed
        // TODO add your handling code here:
        añadirProducto(4, 0);
    }//GEN-LAST:event_jButtonPizza1ActionPerformed

    private void jButtonPizza2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPizza2ActionPerformed
        // TODO add your handling code here:
        añadirProducto(4, 1);
    }//GEN-LAST:event_jButtonPizza2ActionPerformed

    private void jButtonPizza3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPizza3ActionPerformed
        // TODO add your handling code here:
        añadirProducto(4, 2);
    }//GEN-LAST:event_jButtonPizza3ActionPerformed

    private void jButtonPizza4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPizza4ActionPerformed
        // TODO add your handling code here:
        añadirProducto(4, 3);
    }//GEN-LAST:event_jButtonPizza4ActionPerformed

    private void jButtonPizza5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPizza5ActionPerformed
        // TODO add your handling code here:
        añadirProducto(4, 4);
    }//GEN-LAST:event_jButtonPizza5ActionPerformed

    private void jButtonComplementos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComplementos1ActionPerformed
        // TODO add your handling code here:
        añadirProducto(5, 0);
    }//GEN-LAST:event_jButtonComplementos1ActionPerformed

    private void jButtonComplementos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComplementos2ActionPerformed
        // TODO add your handling code here:
        añadirProducto(5, 1);
    }//GEN-LAST:event_jButtonComplementos2ActionPerformed

    private void jButtonComplementos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComplementos3ActionPerformed
        // TODO add your handling code here:
        añadirProducto(5, 2);
    }//GEN-LAST:event_jButtonComplementos3ActionPerformed

    private void jButtonComplementos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComplementos4ActionPerformed
        // TODO add your handling code here:
        añadirProducto(5, 3);
    }//GEN-LAST:event_jButtonComplementos4ActionPerformed

    private void jButtonComplementos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComplementos5ActionPerformed
        // TODO add your handling code here:
        añadirProducto(5, 4);
    }//GEN-LAST:event_jButtonComplementos5ActionPerformed

    private void jButtonPromo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromo1ActionPerformed
        // TODO add your handling code here:
        añadirProducto(6, 0);
    }//GEN-LAST:event_jButtonPromo1ActionPerformed

    private void jButtonPromo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromo2ActionPerformed
        // TODO add your handling code here:
        añadirProducto(6, 1);
    }//GEN-LAST:event_jButtonPromo2ActionPerformed

    private void jButtonPromo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromo3ActionPerformed
        // TODO add your handling code here:
        añadirProducto(6, 2);
    }//GEN-LAST:event_jButtonPromo3ActionPerformed

    private void jButtonPromo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromo4ActionPerformed
        // TODO add your handling code here:
        añadirProducto(6, 3);
    }//GEN-LAST:event_jButtonPromo4ActionPerformed

    private void jButtonPromo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromo5ActionPerformed
        // TODO add your handling code here:
        añadirProducto(6, 4);
    }//GEN-LAST:event_jButtonPromo5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (jTableListaProductos.getSelectedRow() != -1) {
            modeloTabla.removeRow(jTableListaProductos.getSelectedRow());
            jTableListaProductos.setModel(modeloTabla);
            calcularTotal();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarTodoActionPerformed
        // TODO add your handling code here:
        removerElementos();
        setModelo();
        calcularTotal();
    }//GEN-LAST:event_jButtonEliminarTodoActionPerformed

    private void jButtonAceptarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarPedidoActionPerformed
        if(metodoPago!=-1){
            if(modeloTabla.getRowCount()>0){
                try {
                    // TODO add your handling code here:
                    controladorPedidos.generarDemanda(modeloTabla, Double.parseDouble(jTextFieldTotal.getText()), camarero, mesa, metodoPago);
                } catch (FileNotFoundException ex) {
                }
                removerElementos();
                setModelo();
                calcularTotal();
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(this, "No has seleccionado ningun producto.", "Error", WIDTH);                
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No has seleccionado ningun metodo de pago.", "Error", WIDTH);
        }
    }//GEN-LAST:event_jButtonAceptarPedidoActionPerformed

    private void jRadioButtonMetalicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMetalicoActionPerformed
        // TODO add your handling code here:
        this.metodoPago = 1;
    }//GEN-LAST:event_jRadioButtonMetalicoActionPerformed

    private void jRadioButtonTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTarjetaActionPerformed
        // TODO add your handling code here:
        this.metodoPago = 0;
    }//GEN-LAST:event_jRadioButtonTarjetaActionPerformed

    private void añadirProducto(int categoria, int id) {
        String[] producto;
        producto = controladorPedidos.getProducto(categoria, id);
        modeloTabla.addRow(producto);
        jTableListaProductos.setModel(modeloTabla);
        calcularTotal();
    }

    private void removerElementos() {
        int numeroFilas = modeloTabla.getRowCount();
        for (int i = numeroFilas - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    private void calcularTotal() {
        double total = 0.0;
        int totalProductos = jTableListaProductos.getRowCount();
        totalProductos -= 1;
        for (int i = 0; i <= totalProductos; i++) {
            double total1 = Double.parseDouble(String.valueOf(jTableListaProductos.getValueAt(i, 1)));
            total += total1;
        }
        jTextFieldTotal.setText(Double.toString(controladorPedidos.redondearDecimales(total)));
    }

    private void setModelo() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Precio unidad");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogMenu dialog = new JDialogMenu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton7up;
    private javax.swing.JButton jButtonAceptarPedido;
    private javax.swing.JButton jButtonAgua;
    private javax.swing.JButton jButtonAmstel;
    private javax.swing.JButton jButtonAquarius;
    private javax.swing.JButton jButtonAquariusNaranja;
    private javax.swing.JButton jButtonBebidas;
    private javax.swing.JButton jButtonBocadillo1;
    private javax.swing.JButton jButtonBocadillo2;
    private javax.swing.JButton jButtonBocadillo3;
    private javax.swing.JButton jButtonBocadillo4;
    private javax.swing.JButton jButtonBocadillo5;
    private javax.swing.JButton jButtonBocadillos;
    private javax.swing.JButton jButtonCocaCola;
    private javax.swing.JButton jButtonComplementos;
    private javax.swing.JButton jButtonComplementos1;
    private javax.swing.JButton jButtonComplementos2;
    private javax.swing.JButton jButtonComplementos3;
    private javax.swing.JButton jButtonComplementos4;
    private javax.swing.JButton jButtonComplementos5;
    private javax.swing.JButton jButtonEliminarTodo;
    private javax.swing.JButton jButtonHamburguesa1;
    private javax.swing.JButton jButtonHamburguesa2;
    private javax.swing.JButton jButtonHamburguesa3;
    private javax.swing.JButton jButtonHamburguesa4;
    private javax.swing.JButton jButtonHamburguesa5;
    private javax.swing.JButton jButtonHamburguesas;
    private javax.swing.JButton jButtonLight;
    private javax.swing.JButton jButtonLimon;
    private javax.swing.JButton jButtonNaranja;
    private javax.swing.JButton jButtonNestea;
    private javax.swing.JButton jButtonPizza;
    private javax.swing.JButton jButtonPizza1;
    private javax.swing.JButton jButtonPizza2;
    private javax.swing.JButton jButtonPizza3;
    private javax.swing.JButton jButtonPizza4;
    private javax.swing.JButton jButtonPizza5;
    private javax.swing.JButton jButtonPromo1;
    private javax.swing.JButton jButtonPromo2;
    private javax.swing.JButton jButtonPromo3;
    private javax.swing.JButton jButtonPromo4;
    private javax.swing.JButton jButtonPromo5;
    private javax.swing.JButton jButtonPromociones;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSinAlcohol;
    private javax.swing.JButton jButtonTonica;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPaneBebidas;
    private javax.swing.JLayeredPane jLayeredPaneBocadillos;
    private javax.swing.JLayeredPane jLayeredPaneComplementos;
    private javax.swing.JLayeredPane jLayeredPaneHamburguesas;
    private javax.swing.JLayeredPane jLayeredPanePizza;
    private javax.swing.JLayeredPane jLayeredPanePromociones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonMetalico;
    private javax.swing.JRadioButton jRadioButtonTarjeta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableListaProductos;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
    private ControladorPedidos controladorPedidos;
    private DefaultTableModel modeloTabla;
    private Camarero camarero;
    private String mesa;
    private int metodoPago = -1;
}

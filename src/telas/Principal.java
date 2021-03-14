package telas;


import javax.swing.ImageIcon;
import classes.BarraPorcentagem1;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Principal extends javax.swing.JFrame {
    
    TelaCadastroFuncionnario c_Funcionario= new TelaCadastroFuncionnario();
    TelaCadastroCliente c_Cliente = new TelaCadastroCliente();
    TelaCadastroFornecedor c_Fornecedor = new TelaCadastroFornecedor();
    TelaCadastroCargaEntrada entrada_Carga = new TelaCadastroCargaEntrada();
    TelaCadastroCargaSaida Baixa_Carga = new TelaCadastroCargaSaida();
    TelaPequisaFuncionario Pesquisa_funcionario = new TelaPequisaFuncionario();
    BarraPorcentagem1 barra = new BarraPorcentagem1();
    int resultado;
    Connection conn = null;
    Statement stmt;
    ResultSet rs;
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCargaAlocada = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        barra10 = new javax.swing.JButton();
        barra18 = new javax.swing.JButton();
        barra14 = new javax.swing.JButton();
        barra16 = new javax.swing.JButton();
        barra12 = new javax.swing.JButton();
        barra9 = new javax.swing.JButton();
        barra11 = new javax.swing.JButton();
        barra13 = new javax.swing.JButton();
        barra15 = new javax.swing.JButton();
        barra17 = new javax.swing.JButton();
        barra19 = new javax.swing.JButton();
        barra20 = new javax.swing.JButton();
        barra6 = new javax.swing.JButton();
        barra5 = new javax.swing.JButton();
        barra4 = new javax.swing.JButton();
        barra3 = new javax.swing.JButton();
        barra8 = new javax.swing.JButton();
        barra7 = new javax.swing.JButton();
        barra2 = new javax.swing.JButton();
        barra1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblPorcentagem = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        lblImagem.setText("jLabel1");
        jPanel1.add(lblImagem);
        lblImagem.setBounds(40, 30, 1370, 350);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Usuário:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1020, 10, 100, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 410);

        jPanel2.setBackground(new java.awt.Color(13, 155, 155));
        jPanel2.setLayout(null);

        tabelaCargaAlocada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Carga", "CNPJ/CPF", "DATA DE ENTRADA", "VALOR CUBICO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCargaAlocada);
        if (tabelaCargaAlocada.getColumnModel().getColumnCount() > 0) {
            tabelaCargaAlocada.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaCargaAlocada.getColumnModel().getColumn(2).setPreferredWidth(15);
            tabelaCargaAlocada.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 830, 220);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 420, 850, 260);

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        barra10.setBackground(new java.awt.Color(0, 153, 0));
        barra10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra10);
        barra10.setBounds(10, 110, 50, 10);

        barra18.setBackground(new java.awt.Color(0, 153, 0));
        barra18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra18);
        barra18.setBounds(10, 30, 50, 10);

        barra14.setBackground(new java.awt.Color(0, 153, 0));
        barra14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra14);
        barra14.setBounds(10, 70, 50, 10);

        barra16.setBackground(new java.awt.Color(0, 153, 0));
        barra16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra16);
        barra16.setBounds(10, 50, 50, 10);

        barra12.setBackground(new java.awt.Color(0, 153, 0));
        barra12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra12);
        barra12.setBounds(10, 90, 50, 10);

        barra9.setBackground(new java.awt.Color(0, 153, 0));
        barra9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra9);
        barra9.setBounds(10, 120, 50, 10);

        barra11.setBackground(new java.awt.Color(0, 153, 0));
        barra11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra11);
        barra11.setBounds(10, 100, 50, 10);

        barra13.setBackground(new java.awt.Color(0, 153, 0));
        barra13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra13);
        barra13.setBounds(10, 80, 50, 10);

        barra15.setBackground(new java.awt.Color(0, 153, 0));
        barra15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra15);
        barra15.setBounds(10, 60, 50, 10);

        barra17.setBackground(new java.awt.Color(0, 153, 0));
        barra17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra17);
        barra17.setBounds(10, 40, 50, 10);

        barra19.setBackground(new java.awt.Color(0, 153, 0));
        barra19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra19);
        barra19.setBounds(10, 20, 50, 10);

        barra20.setBackground(new java.awt.Color(0, 153, 0));
        barra20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra20);
        barra20.setBounds(10, 10, 50, 10);

        barra6.setBackground(new java.awt.Color(0, 153, 0));
        barra6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra6);
        barra6.setBounds(10, 150, 50, 10);

        barra5.setBackground(new java.awt.Color(0, 153, 0));
        barra5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra5);
        barra5.setBounds(10, 160, 50, 10);

        barra4.setBackground(new java.awt.Color(0, 153, 0));
        barra4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra4);
        barra4.setBounds(10, 170, 50, 10);

        barra3.setBackground(new java.awt.Color(0, 153, 0));
        barra3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra3);
        barra3.setBounds(10, 180, 50, 10);

        barra8.setBackground(new java.awt.Color(0, 153, 0));
        barra8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra8);
        barra8.setBounds(10, 130, 50, 10);

        barra7.setBackground(new java.awt.Color(0, 153, 0));
        barra7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra7);
        barra7.setBounds(10, 140, 50, 10);

        barra2.setBackground(new java.awt.Color(0, 153, 0));
        barra2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra2);
        barra2.setBounds(10, 190, 50, 10);

        barra1.setBackground(new java.awt.Color(0, 153, 0));
        barra1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(barra1);
        barra1.setBounds(10, 200, 50, 10);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jPanel5);
        jPanel5.setBounds(10, 10, 50, 200);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(170, 30, 70, 210);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setText("%");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(120, 130, 50, 50);

        lblPorcentagem.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblPorcentagem.setText("100");
        jPanel3.add(lblPorcentagem);
        lblPorcentagem.setBounds(30, 130, 90, 50);

        jPanel6.setBackground(new java.awt.Color(13, 155, 155));
        jPanel3.add(jPanel6);
        jPanel6.setBounds(0, 0, 240, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1110, 420, 250, 260);

        jPanel7.setBackground(new java.awt.Color(51, 204, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(13, 155, 155));
        jPanel7.add(jPanel8);
        jPanel8.setBounds(0, 0, 240, 30);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(860, 420, 240, 260);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jMenuBar1, org.jdesktop.beansbinding.ELProperty.create("${background}"), jMenuBar1, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("Administração");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar32.png"))); // NOI18N
        jMenu4.setText("Cadastrar");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Funcionarios32.png"))); // NOI18N
        jMenuItem1.setText("Funcionário");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fornecedor32.png"))); // NOI18N
        jMenuItem15.setText("Fornecedor");
        jMenuItem15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cliente32.png"))); // NOI18N
        jMenuItem3.setText("Cliente");
        jMenuItem3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/recursos32.png"))); // NOI18N
        jMenuItem9.setText("Recursos");
        jMenuItem9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.add(jMenuItem9);

        jMenu1.add(jMenu4);

        jMenu7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/carga32.png"))); // NOI18N
        jMenu7.setText("Carga");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem4.setText("Entrada");
        jMenuItem4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem16.setText("Baixa");
        jMenuItem16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenu1.add(jMenu7);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/orçamento32.png"))); // NOI18N
        jMenuItem7.setText("Orçamentos");
        jMenuItem7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.add(jMenuItem7);

        jMenu8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Windows-Explorer-icon.png"))); // NOI18N
        jMenu8.setText("Pesquisar");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Funcionarios32.png"))); // NOI18N
        jMenuItem5.setText("Funcionários");
        jMenuItem5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fornecedor32.png"))); // NOI18N
        jMenuItem2.setText("Fornecedores");
        jMenuItem2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu8.add(jMenuItem2);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cliente32.png"))); // NOI18N
        jMenuItem6.setText("Clientes");
        jMenuItem6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu8.add(jMenuItem6);

        jMenu1.add(jMenu8);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("Logística");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenu6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/bridge-icon(1).png"))); // NOI18N
        jMenu6.setText("Controle de Estóque");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem10.setText("Conteiners");
        jMenu6.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem11.setText("Carretas");
        jMenu6.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem12.setText("Equipamentos");
        jMenu6.add(jMenuItem12);

        jMenu2.add(jMenu6);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/natafiscal32.png"))); // NOI18N
        jMenuItem14.setText("Controle de Nota Fiscal");
        jMenuItem14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.add(jMenuItem14);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/carga32.png"))); // NOI18N
        jMenuItem13.setText("Controle de Carga");
        jMenuItem13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.add(jMenuItem13);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/controle_fluxo32.png"))); // NOI18N
        jMenuItem8.setText("Controle de Fluxo");
        jMenuItem8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setText("Manutenção");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("Operação");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        bindingGroup.bind();

        setBounds(0, 0, 1403, 924);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      ImageIcon icon = new ImageIcon("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\apresentacao\\images\\Conteineres2.JPG");
      lblImagem.setIcon(icon);
      this.setarBarraPorcentagem();
        try {
            this.PopularTabela("select * from cargaalocada");
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        c_Funcionario.setVisible(true);
         
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        c_Cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        c_Fornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       entrada_Carga.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
       Baixa_Carga.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       Pesquisa_funcionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
public void setarBarraPorcentagem(){
    //conectara a barra de porcentagem com a Classe Barraporcentagem e ira ler e 
    //converterpara inteiro a variavel de texto que foi salva na TelCadastroCargaEntrada
 String valor = barra.lerTxt();
        lblPorcentagem.setText(valor);
        
       
        resultado= Integer.parseInt(valor);
        if(resultado ==0 ){
        resultado=1;
        }
        
        {if (resultado < 100) {
            barra20.setVisible(false);
        }else{barra20.setVisible(true);}
        if (resultado < 95) {
            barra19.setVisible(false);
        }else{barra19.setVisible(true);}
        if (resultado < 90) {
            barra18.setVisible(false);
        }else{barra18.setVisible(true);}
        if (resultado < 85) {
            barra17.setVisible(false);
        }else{barra17.setVisible(true);}
        if (resultado < 80) {
            barra16.setVisible(false);
        }else{barra16.setVisible(true);}
        if (resultado < 75) {
            barra15.setVisible(false);
        }else{barra15.setVisible(true);}
        if (resultado < 70) {
            barra14.setVisible(false);
        }else{barra14.setVisible(true);}
        if (resultado < 65) {
            barra13.setVisible(false);
        }else{barra13.setVisible(true);}
        if (resultado < 60) {
            barra12.setVisible(false);
        }else{barra12.setVisible(true);}
        if (resultado < 55) {
            barra11.setVisible(false);
        }else{barra11.setVisible(true);}
        if (resultado < 50) {
            barra10.setVisible(false);
        }else{barra10.setVisible(true);}
        if (resultado < 45) {
            barra9.setVisible(false);
        }else{barra9.setVisible(true);}
        if (resultado < 40) {
            barra8.setVisible(false);
        }else{barra8.setVisible(true);}
        if (resultado < 35) {
            barra7.setVisible(false);
        }else{barra7.setVisible(true);}
        if (resultado < 30) {
            barra6.setVisible(false);
        }else{barra6.setVisible(true);}
        if (resultado < 25) {
            barra5.setVisible(false);
        }else{barra5.setVisible(true);}
        if (resultado < 20) {
            barra4.setVisible(false);
        }else{barra4.setVisible(true);}
        if (resultado < 15) {
            barra3.setVisible(false);
        }else{barra3.setVisible(true);}
        if (resultado < 10) {
            barra2.setVisible(false);
        }else{barra2.setVisible(true);}
        if (resultado < 5) {
            barra1.setVisible(false);          
        }else{barra1.setVisible(true);}
        }
        if (resultado < 50) {
            barra9.setBackground(Color.YELLOW);
            barra8.setBackground(Color.YELLOW);
            barra7.setBackground(Color.YELLOW);
            barra6.setBackground(Color.YELLOW);
            barra5.setBackground(Color.YELLOW);
            barra4.setBackground(Color.YELLOW);
            barra3.setBackground(Color.YELLOW);
            barra2.setBackground(Color.YELLOW);
            barra1.setBackground(Color.YELLOW);

        }else {
            barra9.setBackground(Color.GREEN.darker());
        barra8.setBackground(Color.GREEN.darker());
        barra7.setBackground(Color.GREEN.darker());
        barra6.setBackground(Color.GREEN.darker());
        barra5.setBackground(Color.GREEN.darker());
        barra4.setBackground(Color.GREEN.darker());
        barra3.setBackground(Color.GREEN.darker());
        barra2.setBackground(Color.GREEN.darker());
        barra1.setBackground(Color.GREEN.darker());}
        if (resultado < 30) {        

            barra5.setBackground(Color.RED);
            barra4.setBackground(Color.RED);
            barra3.setBackground(Color.RED);
            barra2.setBackground(Color.RED);
            barra1.setBackground(Color.RED);

        }
}
  public void PopularTabela (String sql) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbEnterprise", "root", "");
            PreparedStatement banco = (PreparedStatement) conn.prepareStatement(sql);
            banco.execute();
            rs = banco.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel)tabelaCargaAlocada.getModel();
            model.setNumRows(0);
            while (rs.next()) {
                String dataNascimento = rs.getString("dataEntrada");
                DateFormat FormatoSql = new SimpleDateFormat("yyy-mm-dd");
                java.util.Date Date = FormatoSql.parse(dataNascimento);
                //essa classe conver sua String ou data antiga no formar Sql
                DateFormat FormatoBR = new SimpleDateFormat("dd/mm/yyy");
                String dataFormatada = FormatoBR.format(Date);
                // Aqui a data é convertida no perfil BR e depois em String

                model.addRow(new Object[]{rs.getInt("matriculaCarga"), rs.getString("cpfCnpj"),
                    dataFormatada, rs.getString("valorCubico") });

            }
            banco.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "erro na tabela da Interface!");

        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton barra1;
    public javax.swing.JButton barra10;
    public javax.swing.JButton barra11;
    public javax.swing.JButton barra12;
    public javax.swing.JButton barra13;
    public javax.swing.JButton barra14;
    public javax.swing.JButton barra15;
    public javax.swing.JButton barra16;
    public javax.swing.JButton barra17;
    public javax.swing.JButton barra18;
    public javax.swing.JButton barra19;
    public javax.swing.JButton barra2;
    public javax.swing.JButton barra20;
    public javax.swing.JButton barra3;
    public javax.swing.JButton barra4;
    public javax.swing.JButton barra5;
    public javax.swing.JButton barra6;
    public javax.swing.JButton barra7;
    public javax.swing.JButton barra8;
    public javax.swing.JButton barra9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagem;
    public javax.swing.JLabel lblPorcentagem;
    public javax.swing.JTable tabelaCargaAlocada;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

package telas;

import classes.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO IDEAPAD I3
 */
public class TelaCadastroFuncionnario extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    ResultSet rs;
    Conexao conex = new Conexao();

    ImageIcon iconSalvar = new ImageIcon("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\apresentacao\\images\\Salvar.png");
    ImageIcon iconAterar = new ImageIcon("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\apresentacao\\images\\Alterar.PNG");
    ImageIcon iconDeletar = new ImageIcon("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\apresentacao\\images\\Deletar.PNG");

    public void PopularTabela(String sql) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbEnterprise", "root", "");
            PreparedStatement banco = (PreparedStatement) conn.prepareStatement(sql);
            banco.execute();
            rs = banco.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) tabelaCadastroFuncionario.getModel();
            model.setNumRows(0);
            while (rs.next()) {
                String dataNascimento = rs.getString("nascimento");
                DateFormat FormatoSql = new SimpleDateFormat("yyy-mm-dd");
                Date Date = FormatoSql.parse(dataNascimento);
                //essa classe conver sua String ou data antiga no formar Sql
                DateFormat FormatoBR = new SimpleDateFormat("dd/mm/yyy");
                String dataFormatada = FormatoBR.format(Date);
                // Aqui a data é convertida no perfil BR e depois em String

                model.addRow(new Object[]{rs.getInt("idfuncionario"), rs.getString("matricula"),
                    rs.getString("nome"), rs.getString("sobrenome"), rs.getString("cargo"),
                    rs.getString("salario"), dataFormatada, rs.getString("nacionalidade"),
                    rs.getInt("RG"), rs.getString("CPF"), rs.getString("endereco"), rs.getString("numero"),
                    rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"), rs.getString("cep"),
                    rs.getString("telefone"), rs.getString("celular"), rs.getString("contatoRecado"), rs.getString("email")});

            }
            banco.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "erro na tabela da Interface!");

        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public TelaCadastroFuncionnario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNacionalidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFixo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRecado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lblMenssagem = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblSalvar = new javax.swing.JLabel();
        lblAlterar = new javax.swing.JLabel();
        lblDeletar = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        txtNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNome);
        txtNome.setBounds(168, 17, 208, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 19, 38, 15);

        txtNascimento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtNascimento);
        txtNascimento.setBounds(144, 157, 120, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Data de Nascimento:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(14, 159, 126, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Nascionalidade:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(278, 244, 93, 15);

        txtNacionalidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNacionalidade);
        txtNacionalidade.setBounds(375, 242, 160, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Email:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(107, 128, 35, 15);

        txtEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtEmail);
        txtEmail.setBounds(146, 126, 521, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Telefone Fixo:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(58, 102, 84, 15);

        txtFixo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtFixo);
        txtFixo.setBounds(146, 100, 126, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Celular:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(330, 100, 45, 15);

        txtCelular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCelular);
        txtCelular.setBounds(380, 100, 100, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Recado:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(520, 100, 49, 15);

        txtRecado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtRecado);
        txtRecado.setBounds(570, 100, 130, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CEP:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(675, 71, 27, 15);

        txtCep.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCep);
        txtCep.setBounds(706, 69, 109, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Bairro:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(102, 71, 40, 15);

        txtBairro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtBairro);
        txtBairro.setBounds(146, 69, 126, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Cidade:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(330, 70, 45, 15);

        txtCidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCidade);
        txtCidade.setBounds(380, 70, 146, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("UF:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(552, 69, 18, 15);

        txtEstado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtEstado);
        txtEstado.setBounds(572, 69, 71, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Endereço:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 45, 60, 15);

        txtEndereco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtEndereco);
        txtEndereco.setBounds(170, 43, 497, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sobrenome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(386, 13, 74, 20);

        txtSobrenome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtSobrenome);
        txtSobrenome.setBounds(466, 13, 201, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("CPF:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(345, 218, 26, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("N° de Matricula:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(43, 246, 97, 15);
        jPanel1.add(txtCpf);
        txtCpf.setBounds(375, 212, 160, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("RG:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(350, 185, 21, 15);
        jPanel1.add(txtRg);
        txtRg.setBounds(375, 183, 160, 20);
        jPanel1.add(txtCargo);
        txtCargo.setBounds(144, 185, 160, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("N°:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(685, 45, 18, 15);
        jPanel1.add(txtNumero);
        txtNumero.setBounds(707, 43, 55, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Cargo:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(100, 187, 40, 15);
        jPanel1.add(txtMatricula);
        txtMatricula.setBounds(144, 244, 124, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Salário:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(95, 218, 45, 15);
        jPanel1.add(txtSalario);
        txtSalario.setBounds(146, 216, 124, 20);

        jLabel20.setText("0.000.00");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(280, 222, 50, 14);

        jLabel21.setText("dd/mm/yyyy");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(280, 160, 60, 14);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSalvarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSalvarFocusLost(evt);
            }
        });
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarMouseExited(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar);
        btnSalvar.setBounds(20, 10, 50, 50);

        btnAlterar.setBackground(new java.awt.Color(204, 204, 204));
        btnAlterar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAlterarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAlterarFocusLost(evt);
            }
        });
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlterarMouseExited(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterar);
        btnAlterar.setBounds(80, 10, 50, 50);

        btnDeletar.setBackground(new java.awt.Color(204, 204, 204));
        btnDeletar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnDeletarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnDeletarFocusLost(evt);
            }
        });
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeletarMouseExited(evt);
            }
        });
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeletar);
        btnDeletar.setBounds(140, 10, 50, 50);

        lblMenssagem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMenssagem.setForeground(new java.awt.Color(255, 0, 0));
        lblMenssagem.setText("Digite o ID para Alterar ou Excluir");
        jPanel2.add(lblMenssagem);
        lblMenssagem.setBounds(230, 10, 210, 15);
        jPanel2.add(txtId);
        txtId.setBounds(230, 30, 160, 20);

        lblSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSalvar.setForeground(new java.awt.Color(0, 255, 0));
        lblSalvar.setText("Salvar");
        jPanel2.add(lblSalvar);
        lblSalvar.setBounds(30, 70, 40, 14);

        lblAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAlterar.setForeground(new java.awt.Color(255, 204, 0));
        lblAlterar.setText("Alterar");
        jPanel2.add(lblAlterar);
        lblAlterar.setBounds(80, 70, 40, 14);

        lblDeletar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDeletar.setForeground(new java.awt.Color(255, 0, 0));
        lblDeletar.setText("Deletar");
        jPanel2.add(lblDeletar);
        lblDeletar.setBounds(140, 70, 50, 14);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(550, 260, 450, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 1340, 360);

        tabelaCadastroFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaCadastroFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaCadastroFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Funcionário", "Matrícula", "Nome", "Sobrenome", "Cargo", "salário", "Nascimento", "Nascionalidade", "RG", "CPF", "Endereço", "Numero", "Bairro", "Cidade", "Estado", "Cep", "Telefone", "Celular", "Recado", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCadastroFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastroFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroFuncionario);
        if (tabelaCadastroFuncionario.getColumnModel().getColumnCount() > 0) {
            tabelaCadastroFuncionario.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaCadastroFuncionario.getColumnModel().getColumn(1).setPreferredWidth(20);
            tabelaCadastroFuncionario.getColumnModel().getColumn(5).setPreferredWidth(10);
            tabelaCadastroFuncionario.getColumnModel().getColumn(6).setPreferredWidth(10);
            tabelaCadastroFuncionario.getColumnModel().getColumn(8).setPreferredWidth(20);
            tabelaCadastroFuncionario.getColumnModel().getColumn(9).setPreferredWidth(20);
            tabelaCadastroFuncionario.getColumnModel().getColumn(11).setPreferredWidth(10);
            tabelaCadastroFuncionario.getColumnModel().getColumn(12).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 3368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 183, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel3);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 390, 1340, 310);

        setBounds(0, 0, 1394, 1245);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btnSalvar.setIcon(iconSalvar);
        btnAlterar.setIcon(iconAterar);
        btnDeletar.setIcon(iconDeletar);

        lblSalvar.setVisible(false);
        lblAlterar.setVisible(false);
        lblDeletar.setVisible(false);
        lblMenssagem.setVisible(false);
        lblMenssagem.setVisible(false);

        try {
            this.PopularTabela("select * from funcionario join enderecofuncionario on funcionario.matricula = enderecofuncionario.matricula");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar Tabela");
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        lblSalvar.setVisible(true);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        lblSalvar.setVisible(false);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseEntered
        lblAlterar.setVisible(true);
        lblMenssagem.setVisible(true);
    }//GEN-LAST:event_btnAlterarMouseEntered

    private void btnAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseExited
        lblAlterar.setVisible(false);
        lblMenssagem.setVisible(false);
    }//GEN-LAST:event_btnAlterarMouseExited

    private void btnDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseEntered
        lblDeletar.setVisible(true);
        lblMenssagem.setVisible(true);
    }//GEN-LAST:event_btnDeletarMouseEntered

    private void btnDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseExited
        lblDeletar.setVisible(false);
        lblMenssagem.setVisible(false);
    }//GEN-LAST:event_btnDeletarMouseExited

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        // Date data = null;
        if (txtMatricula.getText().equals("") || txtSalario.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Os campos salário e matrícula não podem estar vazios");
            txtNome.requestFocus();

        }

        try {
            String dat = txtNascimento.getText();
            SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            Date data = dataFormatada.parse(dat);
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbEnterprise", "root", "");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO funcionario (matricula,nome,sobrenome,cargo,salario,nascimento,nacionalidade,RG,CPF)"
                    + "values(?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1, Integer.parseInt(txtMatricula.getText()));
            stmt.setString(2, txtNome.getText());
            stmt.setString(3, txtSobrenome.getText());
            stmt.setString(4, txtCargo.getText());
            stmt.setString(5, txtSalario.getText());
            stmt.setDate(6, new java.sql.Date(data.getTime()));
            stmt.setString(7, txtNacionalidade.getText());
            stmt.setInt(8, Integer.parseInt(txtRg.getText()));
            stmt.setString(9, txtCpf.getText());

            stmt.executeUpdate();

            String Sql = "INSERT INTO enderecoFuncionario(matricula,endereco,numero,bairro,cidade,estado,cep,telefone,celular,contatoRecado,email)"
                    + "VALUES('" + Integer.parseInt(txtMatricula.getText()) + "','" + txtEndereco.getText() + "','" + Integer.parseInt(txtNumero.getText()) + "','"
                    + txtBairro.getText() + "','" + txtCidade.getText() + "','" + txtEstado.getText() + "','" + txtCep.getText() + "','"
                    + txtFixo.getText() + "','" + txtCelular.getText() + "','" + txtRecado.getText() + "','" + txtEmail.getText() + "')";

            conex.Conectar(Sql);
            stmt.close();
            conn.close();
            this.limpacamposFuncionario();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        try {
            this.PopularTabela("select * from funcionario join enderecofuncionario on "
                    + "funcionario.matricula = enderecofuncionario.matricula");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar Tabela para a Interface!");
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSalvarFocusGained
        lblSalvar.setVisible(true);
    }//GEN-LAST:event_btnSalvarFocusGained

    private void btnSalvarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSalvarFocusLost
        lblSalvar.setVisible(false);
    }//GEN-LAST:event_btnSalvarFocusLost

    private void btnAlterarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAlterarFocusGained
        lblAlterar.setVisible(true);
        lblMenssagem.setVisible(true);
    }//GEN-LAST:event_btnAlterarFocusGained

    private void btnAlterarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAlterarFocusLost
        lblAlterar.setVisible(false);
        lblMenssagem.setVisible(false);
    }//GEN-LAST:event_btnAlterarFocusLost

    private void btnDeletarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeletarFocusGained
        lblDeletar.setVisible(true);
        lblMenssagem.setVisible(true);
    }//GEN-LAST:event_btnDeletarFocusGained

    private void btnDeletarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeletarFocusLost
        lblDeletar.setVisible(false);
        lblMenssagem.setVisible(false);
    }//GEN-LAST:event_btnDeletarFocusLost

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        try {
            String dat = txtNascimento.getText();
            SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            Date data = dataFormatada.parse(dat);
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbEnterprise", "root", "");
            PreparedStatement stmt = conn.prepareStatement("UPDATE funcionario SET idFuncionario=?,"
                    + " matricula=?,nome=?,sobrenome=?,cargo=?,salario=?,nascimento=?,nacionalidade=?,"
                    + "RG=?,CPF=? WHERE idFuncionario ='" + Integer.parseInt(txtId.getText()) + "'");

            stmt.setInt(1, Integer.parseInt(txtId.getText()));
            stmt.setInt(2, Integer.parseInt(txtMatricula.getText()));
            stmt.setString(3, txtNome.getText());
            stmt.setString(4, txtSobrenome.getText());
            stmt.setString(5, txtCargo.getText());
            stmt.setString(6, txtSalario.getText());
            stmt.setDate(7, new java.sql.Date(data.getTime()));
            stmt.setString(8, txtNacionalidade.getText());
            stmt.setInt(9, Integer.parseInt(txtRg.getText()));
            stmt.setString(10, txtCpf.getText());
            stmt.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PreparedStatement stmt = conn.prepareStatement("update enderecofuncionario set matricula=?,"
                    + " endereco=?,numero=?,bairro=?,cidade=?,estado=?,cep=?,telefone=?,celular=?,"
                    + "contatoRecado=?,email=? where matricula ='" + Integer.parseInt(txtMatricula.getText()) + "'");

            stmt.setInt(1, Integer.parseInt(txtMatricula.getText()));
            stmt.setString(2, txtEndereco.getText());
            stmt.setString(3, txtNumero.getText());
            stmt.setString(4, txtBairro.getText());
            stmt.setString(5, txtCidade.getText());
            stmt.setString(6, txtEstado.getText());
            stmt.setString(7, txtCep.getText());
            stmt.setString(8, txtFixo.getText());
            stmt.setString(9, txtCelular.getText());
            stmt.setString(10, txtRecado.getText());
            stmt.setString(11, txtEmail.getText());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(Level.SEVERE, null, ex);
        }

        // JOptionPane.showMessageDialog(null, "erro");
        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        try {
            this.PopularTabela("select * from funcionario join enderecofuncionario on funcionario.matricula = enderecofuncionario.matricula");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela para a Interface!");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        conex.Conectar("delete from enderecofuncionario where matricula = (select matricula from funcionario where idFuncionario= '" + Integer.parseInt(txtId.getText()) + "');");
        conex.Conectar("delete from funcionario where idfuncionario = ' " + Integer.parseInt(txtId.getText()) + "'");
        JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        try {
            this.PopularTabela("select * from funcionario join enderecofuncionario on funcionario.matricula = enderecofuncionario.matricula");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela para a Interface!");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void tabelaCadastroFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroFuncionarioMouseClicked

        txtId.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 0).toString());
        txtMatricula.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 1).toString());
        txtNome.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 2).toString());
        txtSobrenome.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 3).toString());
        txtCargo.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 4).toString());
        txtSalario.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 5).toString());
        txtNascimento.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 6).toString());
        txtNacionalidade.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 7).toString());
        txtRg.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 8).toString());
        txtCpf.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 9).toString());
        txtEndereco.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 10).toString());
        txtNumero.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 11).toString());
        txtBairro.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 12).toString());
        txtCidade.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 13).toString());
        txtEstado.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 14).toString());
        txtCep.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 15).toString());
        txtFixo.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 16).toString());
        txtCelular.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 17).toString());
        txtRecado.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 18).toString());
        txtEmail.setText(tabelaCadastroFuncionario.getValueAt(tabelaCadastroFuncionario.getSelectedRow(), 19).toString());

    }//GEN-LAST:event_tabelaCadastroFuncionarioMouseClicked
    public void limpacamposFuncionario() {
        txtNome.setText("");
        txtSalario.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtEstado.setText("");
        txtCargo.setText("");
        txtCelular.setText("");
        txtCep.setText("");
        txtCidade.setText("");
        txtRecado.setText("");
        txtCpf.setText("");
        txtSobrenome.setText("");
        txtNacionalidade.setText("");
        txtNascimento.setText("");
        txtRg.setText("");
        txtFixo.setText("");
        txtMatricula.setText("");
        txtNumero.setText("");
        txtBairro.setText("");

        txtNome.requestFocus();

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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionnario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionnario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAlterar;
    private javax.swing.JLabel lblDeletar;
    private javax.swing.JLabel lblMenssagem;
    private javax.swing.JLabel lblSalvar;
    private javax.swing.JTable tabelaCadastroFuncionario;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFixo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRecado;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables

    private String toString(Date Data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO IDEAPAD I3
 */
public class Logs {
    public int valorEntrada;
    public int valorSaida;
    
    
    public void EscritaBloco(){
    
     try {
            //indica onde deve ser criado o arquivo
            FileWriter fw = new FileWriter("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\Aula01_Cruzeiro\\gp.txt");
            //escreve no arquivo
            PrintWriter pw = new PrintWriter(fw);
            //pega o valor da variavel e escreve no arquivo ps: se não usa o println será sempre sobrescrito o memo arquivo
            pw.print(valorEntrada);
            pw.close();

        } catch (IOException ex) {
            Logger.getLogger(Logs.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    public  void leituraBLoco(){
         File arquivo = new File("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\Aula01_Cruzeiro\\gp.txt");

        try {
            FileReader ler = new FileReader(arquivo);
            //armazena o arquivo de texto 

            BufferedReader var = new BufferedReader(ler);
            //ler o caminho
            int numero = Integer.parseInt(var.readLine());
            //conta os caracteres e armazena na variavel


        } catch (FileNotFoundException ex) {
            Logger.getLogger(Logs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Logs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}

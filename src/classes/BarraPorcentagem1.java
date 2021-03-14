package classes;


import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BarraPorcentagem1 {
   

 
    int valortotal = 500;
    int porcentagem;
    public String valor;
    public int resultado;

   public void escreverTxt(String retorno) {
        try {

            //indica onde deve ser criado o arquivo
            FileWriter fw = new FileWriter("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\Aula01_Cruzeiro\\gp.txt");
            //escreve no arquivo
            PrintWriter pw = new PrintWriter(fw);
            //pega o valor da variavel e escreve no arquivo ps: se não usa o println será sempre sobrescrito o memo arquivo
            pw.print(retorno);
            pw.close();
            

          

        
    }   catch (IOException ex) {
            Logger.getLogger(BarraPorcentagem1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public String lerTxt(){
       FileReader ler = null;
        try {
            File arquivo = new File("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\Aula01_Cruzeiro\\gp.txt");
            ler = new FileReader(arquivo);
            //armazena o arquivo de texto
            BufferedReader var = new BufferedReader(ler);
            //ler o caminho
            valor = var.readLine();
            //conta os caracteres e armazena na variavel
            porcentagem = Integer.parseInt(valor);
            porcentagem = porcentagem * 100 / valortotal;
            //calcula a porcentagem
            resultado = 100 - porcentagem;
            //subtrai a porcentagem
            valor = Integer.toString(resultado, WIDTH);
            //converte em string pra setar no label que só aceita string
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BarraPorcentagem1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BarraPorcentagem1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ler.close();
            } catch (IOException ex) {
                Logger.getLogger(BarraPorcentagem1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;

       

         
       
   }
   public int lerTxtValor(){
   FileReader ler = null;
        try {
            File arquivo = new File("C:\\Users\\LENOVO IDEAPAD I3\\Desktop\\nova\\Aula01_Cruzeiro\\gp.txt");
            ler = new FileReader(arquivo);
            //armazena o arquivo de texto
            BufferedReader var = new BufferedReader(ler);
            //ler o caminho
            valor = var.readLine();
            //conta os caracteres e armazena na variavel
            porcentagem = Integer.parseInt(valor);
            
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BarraPorcentagem1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BarraPorcentagem1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ler.close();
            } catch (IOException ex) {
                Logger.getLogger(BarraPorcentagem1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return porcentagem;}
}




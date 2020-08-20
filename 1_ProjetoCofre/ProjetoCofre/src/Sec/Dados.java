package Sec;

import java.io.*;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Dados {

    private String data = "";
    private String horario = "";
    private double valor = 0;
    

   
    public Dados() {
    }

    public Dados(String data, String horario, double valor) {
        this.data = data;
        this.horario = horario;
        this.valor = valor;
        

    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
 
    

    public String armazenar() {

        try {
            FileWriter fw = new FileWriter("C:\\Users\\wills\\Desktop\\PROJETOCOFRE\\dados.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Data: " + this.data);
            pw.println("Horário: " + this.horario);
            pw.println("Valor: " + this.valor);
            
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR 0x58967843", "Atenção", JOptionPane.WARNING_MESSAGE);
        }

        return null;

    }

}

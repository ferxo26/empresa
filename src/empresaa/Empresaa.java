/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresaa;


import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class Empresaa {
   
    public static void calcularHorasdiurnas() {
       String auxl=JOptionPane.showInputDialog("ingrese el numero de horas diurnas trabajadas");
       int numHoTrabajdas=Integer.parseInt(auxl);
                String aux=JOptionPane.showInputDialog("ingrese el precio de la hora");
       double precioHoras =Double.parseDouble(aux);
       double SalarioEmpresa=numHoTrabajdas*precioHoras;
       JOptionPane.showMessageDialog(null,"tu salario es:"+SalarioEmpresa);
    }
        public static void calcularHorasNocturnas() {
       String auxl=JOptionPane.showInputDialog("ingrese el numero de horas diurnas trabajadas");
       int numHoTrabajdas=Integer.parseInt(auxl);
                String aux=JOptionPane.showInputDialog("ingrese el precio de la hora");
       double precioHoras =Double.parseDouble(aux);
       double SalarioEmpresa=numHoTrabajdas*precioHoras;
       JOptionPane.showMessageDialog(null,"tu salario es:"+SalarioEmpresa);
    }
    public static void main (String[] args){
        String menu ="Escoja cual es tu horario\n"+
                "1.calcular salario en horas diurnas\n"+
                 "2.calcular salario en horas nocturnas\n";
        String aux=JOptionPane.showInputDialog(menu);
        int opciones = Integer.parseInt(aux);
        switch (opciones){
            case 1:
                calcularHorasdiurnas();
                        case 2:
                            calcularHorasNocturnas ();
                
        }
                
    }
}

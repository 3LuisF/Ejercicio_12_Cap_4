
package ejercicio_12_cap_4;

import javax.swing.JOptionPane;


public class Ejercicio_12_Cap_4 {

    
    public static void main(String[] args) {
        // Entrada datos
        
        String NOM = JOptionPane.showInputDialog("Ingrese su nombre ");
        int NHT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de horas trabajadas"));
        int VHT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de horas trabajadas"));
        int Salario = 0;
        //Proceso de nomina, condicionar
        if (NHT>40){
            int HET = NHT-40;
            if (HET>8){
                int HEE8 = HET -8;
                Salario = (40*VHT)+(16*VHT)+(HEE8*VHT*3);
            }
            else {
                Salario = (40*VHT)+(HET*VHT*2);
            } 
                
                }
        else {
            Salario = 40*VHT;
        }
        
        //Salida de datos
        JOptionPane.showMessageDialog(null, "El trabajador: "+NOM+" Devengo: $"+Salario);
        
    }
    
}

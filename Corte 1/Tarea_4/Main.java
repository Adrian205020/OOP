import javax.swing.JOptionPane;

public class Main {
     public static void main(String[] args){
         
        {
             
             // Solicitar el primer número
            String inputa = JOptionPane.showInputDialog("Ingrese el primer número (a) :");
            int a = Integer.parseInt(inputa);
             
             
             // Solicitar el segundo número
            String inputb = JOptionPane.showInputDialog("Ingrese el segundo número (b):");
            int b = Integer.parseInt(inputb);
             
            Operations resultado = new Operations();
       
            int suma = resultado.sumar(a, b);
            int resta = resultado.restar(a, b);
            int multiplicacion = resultado.multiplicar(a, b);

            // Mostrar resultados en una ventana
            String mensaje = "La suma es: " + suma +
                             "\nLa resta es: " + resta +
                             "\nLa multiplicación es: " + multiplicacion;

            JOptionPane.showMessageDialog(null, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
}

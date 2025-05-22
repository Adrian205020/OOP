import javax.swing.JOptionPane;

public class BancoInterfaz {

    public static void main(String[] args) {
        Banco cuenta = new Banco(0);

        String[] opciones = {"Depositar", "Retirar", "Ver Saldo", "Salir"};

        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null,"Bienvenido al Banco","Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == -1 || seleccion == 3) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el Banco");
                System.exit(0);
            }

            switch (seleccion) {
                case 0: // Depositar
                    try {
                        double cantidadDeposito = Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Ingrese la cantidad a depositar:"));
                        cuenta.depositar(cantidadDeposito);
                        JOptionPane.showMessageDialog(null, "Depósito exitoso. Saldo actual: $" + cuenta.getSaldo());
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.");
                    }
                    break;

                case 1: // Retirar
                    try {
                        double cantidadRetiro = Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Ingrese la cantidad a retirar:"));
                        if (cantidadRetiro > cuenta.getSaldo()) {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar el retiro.");
                        } else {
                            cuenta.retirar(cantidadRetiro);
                            JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actual: $" + cuenta.getSaldo());
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.");
                    }
                    break;

                case 2: // Ver Saldo
                    JOptionPane.showMessageDialog(null, "Saldo actual: $" + cuenta.getSaldo());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }
}

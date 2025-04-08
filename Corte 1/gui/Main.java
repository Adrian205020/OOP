public class Main {
    
    public static void main(String[] args){
        
       Operations resultado = new Operations();
       
       resultado.sumar(3,2);
       System.out.println("La suma de los enteros es: " +resultado.r);
       resultado.restar(5,3);
       System.out.println("La resta de los enteros es: " +resultado.r);
       resultado.multiplicar(5,5);
       System.out.println("La multiplicacion de los enteros es: " +resultado.r);
       
    }
}

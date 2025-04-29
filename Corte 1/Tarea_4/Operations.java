public class Operations {
    private int a;
    private int b; 
    private int r;
    
    public int geta(){
        return a;
    }
    
    public void seta(int a){  
        this.a = a;
    }

    public int getb(){
        return b;   
    }

    public void setb (int b) {
        this.b = b;   
    }
    
    public int getr (){
        return r;
    }
    
    public void setr (int r){
        this.r = r ;
    }
        // Métodos para operaciones matemáticas
    public int sumar(int a, int b) {
        seta(a);
        setb(b);
        setr(a + b);  
        return getr();
    }

    public int restar(int a, int b) {
        seta(a);
        setb(b);
        setr(a-b);
        return getr();   
    }

    public int multiplicar(int a, int b) {
        seta(a);
        setb(b);
        setr(a*b);
        return getr();   
    }
}

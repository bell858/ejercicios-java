public class EcuacionPrimerGrado {
    private int a;
    private int b;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int solucion() {
        if (a!= 0) {
            return -b/a;
        }
        return 0; // No solution if a is 0
    }
    public String getEcuacion() {
        return a + "x + " + b + " = 0";
    }
    public static void main(String[] args) {
        EcuacionPrimerGrado ecuacion = new EcuacionPrimerGrado();
        ecuacion.setA(2);
        ecuacion.setB(3);
        System.out.println("La ecuacion es: " + ecuacion.getEcuacion());
        System.out.println("La solucion es: " + ecuacion.solucion());
    }
}
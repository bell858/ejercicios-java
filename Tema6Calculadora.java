public class Tema6Calculadora {
    private int num1;
    private int num2;
    
    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int suma() {
        return num1 + num2;
    }
    public int resta(){
        return num1 - num2;
    }
    public int multiplicacion(){
        return num1 * num2;
    }
    public int division(){
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Tema6Calculadora calc = new Tema6Calculadora();
        calc.setNum1(10);
        calc.setNum2(8);
        System.out.println("La calculadora tiene como numero1 : "+calc.getNum1());
        System.out.println("La calculadora tiene como numero2 : "+calc.getNum2());
        System.out.println("La calculadora tiene como resultado de la suma : "+calc.suma());
        System.out.println("La calculadora tiene como resultado de la resta : "+calc.resta());
        System.out.println("La calculadora tiene como resultado de la multiplicacion : "+calc.multiplicacion());
        System.out.println("La calculadora tiene como resultado de la division : "+calc.division());
    }
}
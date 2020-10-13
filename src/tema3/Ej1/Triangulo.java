package tema3.Ej1;




public class Triangulo {
    double lado1, lado2, lado3;
    String colorRelleno, colorLinea;

    public Triangulo(double lado1, double lado2, double lado3, String colorRelleno, String colorLinea){
        this.colorLinea = colorLinea;
        this.colorRelleno = colorRelleno;
        this.lado2 = lado1;
        this.lado2 = lado2;
        this.lado2 = lado2;
    }
    public Triangulo(){
    }
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double calcularArea(){
        return Math.sqrt(((lado1+lado2+lado3)/2)*(((lado1+lado2+lado3)/2) - lado1)*(((lado1+lado2+lado3)/2) - lado2)*(((lado1+lado2+lado3)/2) - lado3));
    }
    public double calcularPerimetro(){
        return lado1+lado2+lado3;
    }
}
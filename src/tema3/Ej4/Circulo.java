package tema3.Ej4;

public class Circulo {
    double radio;
    String colorRelleno, colorLinea;
    public String getColorLinea() {
        return colorLinea;
    }
    public String getColorRelleno() {
        return colorRelleno;
    }
    public double getRadio() {
        return radio;
    }
    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro(){
        return Math.PI * 2 * radio;
    }
}

package tema3.Ej2;

public class Balanza {
    int items;
    double monto;

    public void iniciarCompra(){
        this.items = 0;
        this.monto = 0;
    }
    public void registrarProducto(Double pesoxKg, Double precioxKg){
        this.items ++;
        monto += pesoxKg * precioxKg;
    }
    public double devolverMontoAPagar(){
        return monto;
    }
    public String devolverResumenDeCompra(){
        return "Total a pagar "+monto+" por la compra de "+items+" productos";
    }

}

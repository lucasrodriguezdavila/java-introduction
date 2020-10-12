package tema3.Ej5;

public class Balanza {
    int items;
    double monto;
    String resumen;

    public void iniciarCompra(){
        this.items = 0;
        this.monto = 0;
        resumen = "";
    }
    public void registrarProducto(Producto producto, Double precioxKg){
        this.items ++;
        monto += producto.getPesoEnKg() * precioxKg;
        resumen += producto.getDescripcion() +" "+producto.getPesoEnKg() * precioxKg+" pesos - ";
    }
    public double devolverMontoAPagar(){
        return monto;
    }
    public String devolverResumenDeCompra(){
        return resumen + " Total a pagar "+monto+" por la compra de "+items+" productos";
    }

}

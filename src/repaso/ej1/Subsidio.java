package repaso.ej1;

public class Subsidio {
    private double montoPedido;
    private String motivo;
    private boolean fueOtorgado;

    public Subsidio(double monto, String motivo){
        this.montoPedido = monto;
        this.motivo = motivo;
        this.fueOtorgado = false;
    }
    public double getMontoPedido() {
        return montoPedido;
    }
    public String getMotivo() {
        return motivo;
    }
    public boolean fueOtorgado(){
        return fueOtorgado;
    }
    public void setFueOtorgado(boolean fueOtorgado) {
        this.fueOtorgado = fueOtorgado;
    }
    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}

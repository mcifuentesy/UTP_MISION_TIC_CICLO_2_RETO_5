package model.vo;

public class Consulta1VO_79 {
    private String fechaCompra;
    private String codigoCompra;
    private String nombreProveedor;
    private String valorPagado;

    public Consulta1VO_79() {
        
    }
    public Consulta1VO_79(String fechaCompra, String codigoCompra, String nombreProveedor, String valorPagado) {
        this.fechaCompra = fechaCompra;
        this.codigoCompra = codigoCompra;
        this.nombreProveedor = nombreProveedor;
        this.valorPagado = valorPagado;        
    }
    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(String valorPagado) {
        this.valorPagado = valorPagado;
    }
}

package Practico5;
                                
public class Producto {
    private String nombre;
    private int codigo;
    private boolean importado;
    private String nroLote;
    private int nroProducto;

    private static int generador=1;





    public Producto(String nombre, int codigo, boolean importado, String nroLote) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.importado = importado;
        this.nroLote = nroLote;
        this.nroProducto =generador;
        generador ++;
    }

    public Producto() {
        this.nombre = "Jane";
        this.codigo = 1234;
        this.importado = true;
        this.nroLote = "1EA45";
        this.nroProducto =generador;
        generador ++;
    }


    public String esImportado (){
        if (this.getImportado()==true) {
            return "Este producto es importado";

        }else {
            return "Producto nacional";

        }
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", codigo=" + codigo + " "+ this.esImportado() + ", nroLote=" + nroLote + " Número : " + this.getNroProducto() ;
    }

    //Get y Set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public boolean getImportado() {
        return importado;
    }
    public void setImportado(boolean importado) {
        this.importado = importado;
    }
    public String getNroLote() {
        return nroLote;
    }
    public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
    }
    public int getNroProducto() {
        return nroProducto;
    }
    public void setNroProducto(int nroProducto) {
        this.nroProducto = nroProducto;
    }
}

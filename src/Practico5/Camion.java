package Practico5;

public class Camion {
    //atributos
    private int chapa;
    private String color;
    private int anioCompra;


    //constructor
    public Camion(){
        this.color= "Desconocido";
        this.chapa= 00000000;

    }

    public Camion(int unaChapa){
        this.color= "Desconocido";
        this.chapa= unaChapa;

    }

    public Camion(int unaChapa, String unColor, int anio){
        this.color= unColor;
        this.chapa= unaChapa;
        this.anioCompra=anio;
    }


    //metodos de acceso y modificacion
    public int getChapa(){
        return this.chapa;
    }

    public void setChapa (int unaChapa) {
        this.chapa = unaChapa;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor (String unColor) {
        this.color = unColor;
    }

    public int getanioCompra(){
        return this.anioCompra;
    }

    public void setanioCompra (int unAnio) {
        this.anioCompra = unAnio;
    }


    //comparar si dos camiones tienen el mismo color....
    public boolean tieneMismoColor (Camion otroCamion){
        return this.getColor().equals(otroCamion.getColor());
    }

    public boolean tocaRevision (Camion unCamion){
        if (unCamion.getanioCompra()<2015){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String revision;
        if (this.tocaRevision(this)==true){
            revision="Requiere revision";
        }else{
            revision="NO Requiere revision";
        }

        return "Camion de color -" + this.getColor() + " con una chapa -" + this.getChapa() +" - "+ revision ;
    }
}

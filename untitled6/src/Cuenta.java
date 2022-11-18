public class Cuenta {



    private String titular;
    private float cantidad;

//Constructores


    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

//Metodos


    public void ingresar(float cantidad ){


        if(cantidad>=0){

            this.cantidad=this.cantidad+cantidad;
        }
    }



    public String retirar(float cantidad) {

        if (this.cantidad < cantidad) {

            String saldoIns = "Saldo Insuficiente";

            return saldoIns;

        }

        String saldoActual = Float.toString(this.cantidad-cantidad);


        return "Saldo Actual: "+saldoActual;

    }

//Getter and Setter

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
//To Sting

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }


}

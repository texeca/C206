public class Aviao extends Veiculo implements Acoes {

    private String tipoMotor;
    private String anfibio;

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getAnfibio() {
        return anfibio;
    }

    public void setAnfibio(String anfibio) {
        this.anfibio = anfibio;
    }


    @Override
    public void buzina() {
        System.out.println(getModelo()+" esta buzinando !");

    }

    @Override
    public void ligar() {
        System.out.println(getModelo()+" esta ligado !");

    }
}

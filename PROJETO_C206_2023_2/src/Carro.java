public class Carro extends Veiculo implements Acoes{

    private String tipoCarroceria;
    private String convercivel;

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getConvercivel() {
        return convercivel;
    }

    public void setConvercivel(String convercivel) {
        this.convercivel = convercivel;
    }

    @Override
    public void buzina() {

    }

    @Override
    public void ligar() {

    }
}

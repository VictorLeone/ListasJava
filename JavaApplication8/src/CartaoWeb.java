
public abstract class CartaoWeb {

    protected String destinatario;

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract void retornarMensagem(String remetente);

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatarii(String destinatario) {
        this.destinatario = destinatario;
    }

}

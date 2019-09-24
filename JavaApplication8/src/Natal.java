
import javax.swing.JOptionPane;


public class Natal extends CartaoWeb{
    
    public Natal(String destinatario){
        super(destinatario);
    } 

    @Override
    public void retornarMensagem(String remetente) {
      JOptionPane.showMessageDialog(null, "Eu "+remetente+" lhe desejo um Feliz Natal, "+destinatario+"!!!");
    }
    
}

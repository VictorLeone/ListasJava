
import javax.swing.JOptionPane;


public class Aniversario extends CartaoWeb{
    
    public Aniversario(String destinatario){
    super(destinatario);    
    }
    
    @Override
    public void retornarMensagem(String remetente){
        JOptionPane.showMessageDialog(null,"EU, "+remetente+" lhe desejo Feliz Aniversário, "+destinatario+"!!!");
    }
}


import javax.swing.JOptionPane;


public class DiaDosNamorados extends CartaoWeb{
    
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }
    @Override
    public void retornarMensagem(String remetente){
        JOptionPane.showMessageDialog(null, "Eu, "+remetente+" te desejo um feliz val day, "+destinatario);
    }
}

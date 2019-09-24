
import javax.swing.JOptionPane;


public class Teste {
    public static void main (String[]args){
        CartaoWeb[] cartoes = new CartaoWeb[3];
        String destinatario = JOptionPane.showInputDialog(null, "Informe o destinatário");
        String remetente = JOptionPane.showInputDialog(null, "Informe o remetente");
        DiaDosNamorados dn = new DiaDosNamorados(destinatario);
        cartoes[0] = dn;
        
        Natal n = new Natal(destinatario);
        cartoes[1] = n;
        
        Aniversario a = new Aniversario(destinatario);
        cartoes[2] = a;
        
        for(int i = 0; i< cartoes.length; i++){
            cartoes[i].retornarMensagem(remetente);
        }
       
    }
}

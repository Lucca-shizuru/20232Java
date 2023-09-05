import javax.swing.JOptionpane;
//pacote padrão: java.lang: importado automaticamente
public class SomaDoisNumeros{
    public static void main(String [] args) {
       //declaração de variáveis
       Scanner leitor = new Scanner(System.in);
       double primeiroOperando;
       double segundoOperando;
       double resultado;
    
       //entrada 
       primeiroOperando = Double.parseDouble(JOptionpane.showinputdialog
       ("digite o primeiro operando"));
       System.out.println("Digite o segundo operando");
       segundoOperando = Double.perseDouble(JOptionpane.showinputdialog ("digite o segundo opernado"));
       //processamento
       resultado = primeiroOperando + segundoOperando;
       //saída
       JOptionpane.showMessageDialog(null. resultado);
          
   }  
}
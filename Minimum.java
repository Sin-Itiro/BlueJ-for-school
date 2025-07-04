import javax.swing.JOptionPane;

public class Minimum
{
    String eingabe;
    int zahl;
    int minimum;
    
    public Minimum()
    {
        
    }

    public void minimum()
    {
         while (zahl!=100)
         {
             eingabe=JOptionPane.showInputDialog("Geben Sie die Zahlen ein. Wenn Sie die Zahl 100 eingibt, wird das Minimum der eingegebenen Zahlen ausgegeben.");
             zahl=Integer.parseInt(eingabe);
             // minimum= wie definiere ich das Minimum?? Anwendung von Scanner??
             minimum=zahl;
             if (zahl==100)
             {
                 System.out.println("Das Minimum Ihrer Eingaben beträgt " +minimum+ " .");
             }
         }
    }
}

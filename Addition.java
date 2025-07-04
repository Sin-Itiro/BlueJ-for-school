import javax.swing.JOptionPane;

public class Addition
{
    String eingabe;
    int eZahl;
    int sum=0;
    public Addition()
    {

    }

    public void summe()
    {
        eingabe=JOptionPane.showInputDialog("Geben Sie eine Zahl ein.");
        eZahl=Integer.parseInt(eingabe);
        for (int i=0; i<=eZahl; i++)
        {
            sum += i;
        }
        System.out.println("Die Summe beträgt " +sum+ ".");
    }
}

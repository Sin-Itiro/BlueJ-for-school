import javax.swing.JOptionPane;

public class Durchschnittsalter
{
    String eingabe;
    int alter;
    int durchschnittsAlter;
    int sum=0;
    
    public Durchschnittsalter()
    {

    }

    public void durchschnittsAlter()
    {
        for (int i=1; i<=12; i++)
        {
            eingabe=JOptionPane.showInputDialog("Geben Sie Ihr Alter ein.");
            alter=Integer.parseInt(eingabe);
            sum=sum+alter;
            durchschnittsAlter=sum/12;
        }
        System.out.println("Das Durchscnittsalter beträgt " +durchschnittsAlter+ " Jahre alt.");
    }
}

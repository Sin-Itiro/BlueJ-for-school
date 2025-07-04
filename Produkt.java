import javax.swing.JOptionPane;

public class Produkt
{
    String eingabe;
    int produkt=1;
    int faktor=1;
    
    public Produkt()
    {
        while (faktor!=0)
        {
            eingabe=JOptionPane.showInputDialog("Geben Sie Zahl ein, die miteinander multipliziert werden sollen. Zum Abbruch geben Sie 0 ein.");
            faktor=Integer.parseInt(eingabe);
            produkt=produkt*faktor;
            System.out.println("Das Produkt beträgt " +produkt+ ".");
            if (faktor==0)
            {
                System.out.println("Die Multiplikation wurde abgebrochen.");
            }
        }   
    }
}


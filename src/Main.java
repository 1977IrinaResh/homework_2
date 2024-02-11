// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println("cat="+cat);
        System.out.println("dog="+dog);
        System.out.println("paper="+paper);

        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println("new value of ca="+cat);
        System.out.println("new value of dog="+dog);
        System.out.println("new value of paper="+paper);

        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println("value of dog after decrease is equal to "+dog);
        System.out.println("value of cat after decrease is equal to "+cat);
        System.out.println("value of paper after decrease is equal to "+paper);

        var friend=19;
        System.out.println("friend= " +friend);
        friend=friend+2;
        System.out.println("new value of friend= "+friend);
        friend=friend/7;
        System.out.println("value of friend after division is equal to " +friend);

        var frog=3.5;
        System.out.println("frog= "+frog);
        frog=frog*10;
        System.out.println("new value of frog is "+frog);
        frog=frog/3.5;
        System.out.println("value of frog after division is equal to "+frog);
        frog=frog+4;
        System.out.println("final value of frog is "+frog);

        var firstBoxerWeight=78.2;
        var secondBoxerWeight=82.7;
        System.out.println("total weight of both sportsmen is " + (firstBoxerWeight+secondBoxerWeight));
        System.out.println("difference in weigh of two sportsmen is "+(secondBoxerWeight-firstBoxerWeight));

        var firstVariable=6;
        var secondVariable=8;
        var modulo=secondVariable%firstVariable;
        System.out.println("Modulo is "+modulo);

        var totalWeekHours=640;
        var hoursPerEmployee=4;
        var amountEmployees = 640/4;
        System.out.println("Всего работников в компании "+amountEmployees+" человек");

        amountEmployees=amountEmployees+94;
        hoursPerEmployee=totalWeekHours/amountEmployees;
        System.out.println("Если в компании работает "+amountEmployees+" то всего "+hoursPerEmployee+" часов может быть поделено между сотрудниками");




        }
    }

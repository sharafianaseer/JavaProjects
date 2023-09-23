public class MarksCheck {

    public static void main (String[] args) {

        int marks= 101;
        String Grade;
        if (marks>=0 && marks<=40)
        { Grade = "Fail";}
        else if ( marks>40 && marks<=60)
        {Grade="B grade";}
        else if (marks>60 && marks<=80)
        {Grade="B+ grade";}
        else if (marks>80 && marks<=90)
        {Grade="A grade";}
        else if (marks>90 && marks<=99)
        {Grade="A+ grade";}
        else
        { Grade="You are Alien";}
System.out.println(Grade);


    }
}

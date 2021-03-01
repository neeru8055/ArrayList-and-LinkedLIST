import java.util.*;
public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> Std = new ArrayList<String>();
        Std.add("Neeraj");
        Std.add("Neeru");
        Std.add("Dios");
        Std.add("JOKER");
        Std.add("MR 8055");
        System.out.println("\nStudent LIST : \n");
        for(String o : Std)
        {
            System.out.println(o);
        }
        List<Faculty> fdet = new ArrayList<Faculty>();
        fdet.add(new Faculty("Rajesh",123));
        fdet.add(new Faculty("Ajesh",124));
        fdet.add(new Faculty("Jesh",125));
        fdet.add(new Faculty("Raj",126));
        fdet.add(new Faculty("Rajan",127));

        System.out.println("\n\nFaculty LIST : \n");
        for(Object o : fdet)
        {
            Faculty f = (Faculty) o;
            System.out.println(f.geto());
        }

    }

}
class Faculty{
    private final String Fname;
    private final int regno;

    public Faculty(String name,int reg)
    {
        this.Fname = name;
        this.regno = reg;
    }
   public String geto(){
        return
        "FacultyName = " + this.Fname + " RegistrationNO = " + this.regno;

    }

}

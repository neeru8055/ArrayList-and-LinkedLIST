import java.util.*;

public class ListIteratr {
    public static void main(String[] args) {

//        ArrayList<String> cha = new ArrayList<String>();
//        cha.add("ABC");
//        cha.add("PQR");
//        cha.add("XYZ\n");
//        cha.add("abc");
//        cha.add("pqr");
//        cha.add("xyz");
//        ListIterator<String>itr = cha.listIterator();
//        System.out.println("Capital letters VS Small letters :\n");
//        while(itr.hasNext()) {
//            String i = itr.next();
//            if(i=="ABC") {
//                System.out.println(i+" MATCHED 100% :) ");
//            }
//            else
//                System.out.println(i);
//        }


        //**************************************************************

        List<Integer> rol = new LinkedList<Integer>();
        ListIterator<Integer> litr = null;
        rol.add(12);
        rol.add(11);
        rol.add(18);
        rol.add(13);
        rol.add(16);
        rol.add(15);
        Collections.sort(rol);
        Collections.reverse(rol);
//        boolean a = rol.contains(20);
//        System.out.println(a);
        rol.remove(1);

        rol.set(0,10);

        litr = rol.listIterator();
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }

      }
}

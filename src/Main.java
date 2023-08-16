import java.util.*;
public class Main {
    public static void main (String[] args) {




                ArrayList<String> list=new ArrayList<String>();
                list.add("Ravi");
                list.add("Vijay");
                list.add("Ravi");


                list.add("Ajay");
        System.out.println("Commit");



                Iterator itr=list.iterator();



                while(itr.hasNext()){
                    System.out.println(itr.next());
                }
            }
        }




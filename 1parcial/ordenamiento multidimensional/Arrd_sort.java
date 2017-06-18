import java.util.*;
public class Arrd_sort{
	public static void main(String ... arg){
		String [][]arr={  {"hh" ,"bb"},  {"bb","aa"},  {"ww" ,"jj"}}; 
		 for ( String[] s : arr) 
            System.out.println(s[0] + " " + s[1]);
				Arrays.sort ( arr ,  new  Comparator < String []>()  {
        public  int compare ( String [] o1 ,  String [] o2 )  { 
        return   o1 [ 1 ]. compareTo ( o2 [ 1 ]); //solo cambien la posicion de 
												  //la columna que quieren ocupar, pruebenla con 0
		} });
		System.out.println("ordenamiento por culumna ");
		 for ( String[] s : arr)
            System.out.println(s[0] + " " + s[1]);
	}
}
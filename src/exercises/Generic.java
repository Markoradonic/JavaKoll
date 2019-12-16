package exercises;
import java.util.List;
import java.util.Arrays;

public class Generic extends  forEach {
	
	
	 static void Foreach(int arg) {
			List<Integer> n = Arrays.asList(4,5,6,7,8);
			n.forEach(i -> i++);
			System.out.println(n);
	}

	public static void main(String[] args) {
		int n = 0;
		Foreach(n);
	}

}
	

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/* 1./////////////Statička varijabla je varijabla koja pripada///////
		  	samoj klasi, a ne nekom objektu (instanci klase). Statičke	
		  	varijable se mogu koristiti bez instanciranja novog objekta
		  	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		  
		  	2 ////////////Modifikatori pristupa////////////////
			Default
			Private
			Protected
			Public
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			3.   //////////3.	Implementacija interfejsa omogucava naredba//////////////
			implements
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			4  /////////////4.	Iskljucino sekvencijalno citanje fajlova se omogucava ////////////////
			Ja mislim sa RandomAccessFile
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			5. //////////////Volja opcija je startovanje ////////////////////
			Ja mislim implementacijom klase

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			6. /////// napisati kod kako se startuje sledeca klasa kao nova nit
	
	  public class MyThread extends Thread {

    public void run(){
       System.out.println("MyThread running");
    }
  }

To create and start the above thread you can do like this:


  MyThread myThread = new MyThread();
  myTread.start();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		7. ///////////Sta radi klasa Mammallnt //////////
			Interface Animal (){
			Public void eat();
												}
      Public class Mammalnt implements Animal {
		Public void eat(){
			System.out.println(“Eats”);
			}
}

Interfejs je Animal I njega implementira Mammallnt.

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
8.///////////////Napisati klasu dete koja nasledjuje roditeljsku klasu
	Public calss Dete Extends Roditelj {

class Dete extends Roditelj {
static void Display() {
 System.out.println(“Dete");
}

}  

package exercises;
import java.util.List;
import java.util.Arrays;

public class Generic extends  forEach {
	
	
	 static void Foreach(int arg) {
			List<Integer> n = Arrays.asList(4,5,6,7,8);
			n.forEach(i -> i++);
			System.out.println(n);
	}

	public static void main(String[] args) {
		int n = 0;
		Foreach(n);
	}

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 9. Modifikovati sledeci program tako da koristi Try/Catch ...
 
 
 
 
 
 
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  10. Napisati metodu foreach.....
  package exercises;
import java.util.List;
import java.util.Arrays;

public class Generic extends  forEach {
	
	
	 static void Foreach(int arg) {
			List<Integer> n = Arrays.asList(4,5,6,7,8);
			n.forEach(i -> i++);
			System.out.println(n);
	}

	public static void main(String[] args) {
		int n = 0;
		Foreach(n);
	}

}
  
  * 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * 13. napisati primer koriscenja datog generickog metoda..
 * 
 * Live Demo
public class Box<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      Box<Integer> integerBox = new Box<Integer>();
      Box<String> stringBox = new Box<String>();
    
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));

      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
   }
}
			
		 */
		 
	









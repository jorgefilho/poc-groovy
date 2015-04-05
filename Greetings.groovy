/* code in JAVA
public class Greetings{
  public static void main(String[] args){
    for (int i=0; i<3; i++){
      System.out.print("ho ");
    }
    System.out.println("Merry Groovy!");
  }
}
*/

/* The same code in GROOVY */
for (i in 0..2) {print 'ho '}

println 'Merry Groovy!'


import com.cordoba.org.exercises.scala.UtilFunctions;

object Main extends App {

  val utilFunctions = new UtilFunctions

  Console.println("Hello World: " + (args mkString ", "))

  Console.println(utilFunctions.reverse("awsome"))

  Console.println(utilFunctions.count("awsomea", 'a'))

}
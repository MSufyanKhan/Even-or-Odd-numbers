import java.util.*

fun main(args: Array<String>)
{
       println("Which number do you have to check that's Even or Odd: ")
        var sc = Scanner(System.`in`)
        var number = sc.nextInt()
        if (number % 2 == 0)
            print("The $number is Even ")
        else
            print("The $number is Odd ")

}
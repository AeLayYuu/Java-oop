import java.util.*

fun main(){
    var scanner=Scanner(System.`in`)
    println("enter the the square or rectangle or parallelogram")
    var user1= readLine()
    if (user1 == "square"){
        println("enter the number for square")
        var a1=scanner.nextInt();
        square(a1)
    }
    else if(user1 == "rectangle") {
        println("enter the number 1 and number 2 for rectangle")
        var a2 = scanner.nextInt()
        var a3 = scanner.nextInt()
        rectangle(a2, a3)
    }
    else if (user1=="parallelogram"){
        println("enter the number 1 ,number 2 and hight for parallelogram")
        var a4=scanner.nextInt()
        var a5=scanner.nextInt()
        var h=scanner.nextInt()
        parallelogram(a4,a5,h)
    }
    else println("you are wrong")




}
fun square(a:Int) {

    var squareper= 4*a
    println("the perimeter of square $squareper")
    var sqarea= a*a
    println("the area of square is $sqarea")

}
fun rectangle(a: Int,b: Int) {
    var rectper=((2*a)+(2*b))
    println("the perimeter of rectangle $rectper")
    var rectarea= a*b
    println("the area of rectangle is $rectarea")
}
fun parallelogram(a: Int,b: Int ,c: Int) {
    var paraper=((2*a)+(2*b))
    println("the perimeter of parallelogram is $paraper")
    var pararea = b*c
    println("the area of parallelogram is $pararea")
}

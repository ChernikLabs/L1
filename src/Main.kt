import jdk.nashorn.internal.objects.Global.print
import jdk.nashorn.internal.objects.NativeArray.length
import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import java.sql.DriverManager.println

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    val zadanie = readLine().toString()
    if (zadanie == "1") {
        val x = readLine().toString().toInt()
        val y = x * 0.0075

        if (y < 35 || y == 35.0)
            print(35)
        if (y > 35)
            println(y)
    }

    if (zadanie == "2") {
        val Likes = readLine().toString()
        val x = length(Likes).toString()
        val y = Likes[x.toInt()]
        if (y == '1'){
            println("Понравилось "+Likes+" человеку")
        }
        if (y != '1'){
            println("Понравилось "+Likes+" людям")
        }
    }

    if (zadanie == "3") {
        val UserOrder = readLine().toString().toInt()
        val userPost = readLine().toBoolean()
        var x = 0.0


        if (UserOrder < 1000  && userPost == false)
            println(UserOrder)
        if (UserOrder < 1000 && userPost == true)
            println(UserOrder*0.99)

        if (UserOrder > 1000 && UserOrder < 10000 && userPost == false){
            x = (UserOrder - 100).toDouble()
            println(x)
        }
        if (UserOrder > 1000 && UserOrder < 10000 && userPost == true){
            x = (UserOrder - 100).toDouble()
            x = x * 0.99
            println(x)
        }

        if (UserOrder > 1000  && userPost == false) {
            x = (UserOrder * 0.95).toDouble()
            println(x)
        }
        if (UserOrder > 10000  && userPost == true){
            x = (UserOrder * 0.95).toDouble()
            x = x * 0.99
            println(x)
        }
    }
}
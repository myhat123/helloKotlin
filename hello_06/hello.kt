import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

fun main() {
    var start = DateTime(2019, 11, 26, 23, 0, 0)
    var end = DateTime(2019, 11, 27, 22, 30, 0)
    var list = mutableListOf<DateTime>()
    
    val fmt = DateTimeFormat.forPattern("HH:mm:ss")
    var x = start
    while (!x.isAfter(end)) {
        list.add(x)
        var y = fmt.print(x)
        println("time: ${y}")
        x = x.plusMinutes(30)
    }
    println(list)
}
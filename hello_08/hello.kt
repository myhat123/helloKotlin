import kotliquery.*

fun main() {
    var session = sessionOf("jdbc:postgresql://localhost/ncfin4", "jxyz", "1234")
    val allQuery = queryOf("select name from etl_job_log").map { row -> row.string("name") }.asList

    val allName: List<String> = session.run(allQuery)
    println(allName)

}
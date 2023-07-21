import java.sql.*
import org.tomlj.*

import java.nio.file.Paths;

fun main(){

    var source = Paths.get("config.toml")
    val result = Toml.parse(source)

    val driverName = result.getString("hive.driver");

    // val driverName = "org.apache.hive.jdbc.HiveDriver"

    Class.forName(driverName)

    val jdbcUrl = result.getString("hive.url")
    val username = result.getString("hive.username")
    val password = result.getString("hive.password")

    val conn = DriverManager.getConnection(jdbcUrl, username, password)

    val stmt = conn.createStatement()
    val rs = stmt.executeQuery("""
        select `boolean`,
            `tinyint`,
            `smallint`,
            `int`,
            `bigint`,
            `float`,
            `double`,
            `string`,
            `timestamp`,
            `binary`,
            `array`,
            `map`,
            `struct`,
            `decimal`,
            `varchar`,
            `varchar2` 
        from pyhive_test.view_one_row_complex
    """)
    val m = rs.getMetaData()

    val count = m.getColumnCount()

    for (col in 1..count) {
        val column_name = m.getColumnName(col)
        val column_size = m.getColumnDisplaySize(col)
        val jdbc_type = m.getColumnType(col)

        println("column: ${column_name}, size: ${column_size}, jdbc_type: ${jdbc_type}")
    }
    
}
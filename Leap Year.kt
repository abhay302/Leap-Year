import java.util.*

/**
 * isLeapYear() is an extension funtion to the Date class.
 * returns true if the year is a leap year or otherwise, returns false
 */
fun Date.isLeapYear() : Boolean {
    val c = Calendar.getInstance()
    c.time = this
    return c.get(Calendar.YEAR)%4==0
}


/**
 * Takes year as the argument
 * returns true if the year is a leap year or otherwise, returns false if it's not a leap year
 */
fun isLeapYear(year : Int) = year%4==0

fun main(args: Array<String>) {
    print(isLeapYear(2018))
}
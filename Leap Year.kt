/**
 * The isLeapYear() function takes year as the argument
 * returns true if the year is a leap year or otherwise, returns false if it's not a leap year
 */
fun isLeapYear(year: Int) = if (year % 4 == 0) !(year % 100 == 0 && year % 400 != 0) else false

fun main(args: Array<String>) {
    print(isLeapYear(1700))
}

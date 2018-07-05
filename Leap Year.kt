/**
 * The isLeapYear() function takes year as the argument
 * returns true if the year is a leap year or otherwise, returns false if it's not a leap year
 */
fun isLeapYear(year: Int) = year % 400 == 0 || year % 4 == 0

fun main(args: Array<String>) {
    print(isLeapYear(1700))
}

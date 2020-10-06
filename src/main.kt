/**
 * @author Emily Allen
 * @desc This is the main function
 * date: 10/3/20
 * mod
 * date: 10/5/20
 * @param isexit  was added
 * @param userAns was added
 * added menu
 * added when parameters
 * @param person1 was added
 * @param person2 was added
 * @param person3 was added
 * added person2.printAll
 * added person2.calculate
 * added person3.printAll
 * added person2.calculate
 */

fun main(){
    var isexit = true
    var userAns = 0

    var person1 = Customer("", "", "", 0.00)
    var person2 = Commercial("", true, "", "", "", 0.00)
    var person3 = Residential(true, "", "", "", 0.00)

    do {
        println("1. Commercial")
        println("2. Residential")

        print("Enter the number of the type of customer you are: ")
        userAns = readLine()!!.toInt()

        when(userAns){
            1 -> {
                println("What is your full name?")
                var customerName = readLine()!!.toString()
                println("What is your property name?")
                var propertyName = readLine()!!.toString()
                println("What is your phone number?")
                var customerNumber = readLine()!!.toString()
                println("What is your address?")
                var customerAddress = readLine()!!.toString()
                println("What is the square footage of your property?")
                var squareFootage = readLine()!!.toDouble()
                println("Do you have a multiple properties? (Answer true or false)")
                var multiProperty = readLine()!!.toBoolean()
                isexit = false
            }
            2 -> {
                println("What is your full name?")
                var customerName = readLine()!!.toString()
                println("What is your phone number?")
                var customerNumber = readLine()!!.toString()
                println("What is your address?")
                var customerAddress = readLine()!!.toString()
                println("What is the square footage of your property?")
                var squareFootage = readLine()!!.toDouble()
                println("Are you a senior? (Answer true or false)")
                var multiProperty = readLine()!!.toBoolean()
                isexit = false
            }
        }

    }while (isexit)

    person2.printAll()
    person2.calculate()
    person3.printAll()
    person3.calculate2()

}
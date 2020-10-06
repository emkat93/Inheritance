import java.text.DecimalFormat

/**
 * @author Emily Allen
 * @desc This is the customer class
 * date: 10/3/20
 * mod
 * date: 10/5/20
 * opened the Customer class so the Commercial class use the information
 * added the commercial class constructor info
 * @param customerName was added to the Customer class
 * @param customerNumber was added to the Customer class
 * @param customerAddress was added to the Customer class
 * @param squareFootage was added to the Customer class
 * @param propertyName was added to the Commercial class
 * @param multiProperty was added to the Commercial class
 * The calculate function was added to the Commercial class
 * @param discount was added to Commercial class
 * @param total was added to Commercial class
 * Added the Residential class constructor info
 * The calculate2 function was added to Residential class
 * @param twoDigits was added to both Commerical and Residential class
 * add fun printAll to Commercial and Residential classes
 * added println to calculate and calculate2
 */
open class Customer constructor(customerName: String,
                                customerNumber: String,
                                customerAddress: String,
                                squareFootage: Double,
){
    var customerName: String = ""
        get() = customerName
        set(value) {
            field = value
        }
    var customerNumber: String = ""
        get() = customerNumber
        set(value) {
            field = value
        }
    var customerAddress: String = ""
        get() = customerAddress
        set(value) {
            field = value
        }
    var squareFootage: Double = 0.00
        get() = squareFootage
        set(value) {
            field = value
        }
}

class Commercial constructor(propertyName: String,
                             multiProperty: Boolean,
                             customerName: String,
                             customerNumber: String,
                             customerAddress: String,
                             squareFootage: Double
):Customer(customerName, customerNumber, customerAddress, squareFootage){
    var propertyName: String = ""
        get() = propertyName
        set(value) {
            field = value
        }
    var multiProperty: Boolean = true
        get() = multiProperty
        set(value) {
            field = value
        }
    fun printAll(){
        println("Contact Information" + "\n" + customerName + "\n" + customerAddress + "\n" + customerNumber + "\n"
                + "\n" + "Property Information" + "\n" + propertyName + "\n" + "Multiple Properties: " + multiProperty)
    }

    fun calculate(squareFootage: Double){
        val twoDigits = DecimalFormat("###,###,###.00")

        if (!multiProperty){
            var discount = (squareFootage * 5) * 0.10
            var total = (squareFootage * 5) - discount
            var formatted = twoDigits.format(total)
            println("$customerName has a total of $squareFootage sq ft of properties which cost a total of $$formatted")
        }
        else{
            var total = squareFootage * 5
            var formatted = twoDigits.format(total)
            println("$customerName has a total of $squareFootage sq ft for 1 property which cost a total of $$formatted")
        }
    }
}

class Residential constructor(senior: Boolean,
                              customerName: String,
                              customerAddress: String,
                              customerNumber: String,
                              squareFootage: Double
):Customer(customerName, customerNumber, customerAddress, squareFootage){
    var senior: Boolean = true
        get() = senior
        set(value) {
            field = value
        }

    fun printAll(){
        println("Contact Information" + "\n" + customerName + "\n" + customerAddress + "\n" + customerNumber + "\n"
                + "Senior Citizen: " + senior)
    }
    fun calculate2(squareFootage: Double){
        val twoDigits2 = DecimalFormat("###,###,###.00")
        if (!senior){
            var discount = (squareFootage * 6) * 0.15
            var total2 = (squareFootage * 6) - discount
            var formatted2 = twoDigits2.format(total2)
            println("$customerName has a total of $squareFootage sq ft for 1 property which cost a total of $$formatted2")
        }
        else{
            var total2 = squareFootage * 6
            var formatted2 = twoDigits2.format(total2)
            println("$customerName has a total of $squareFootage sq ft for 1 property which cost a total of $$formatted2")
        }
    }
}
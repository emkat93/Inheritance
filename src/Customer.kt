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
 * date 10/6/20
 * If statement was added to the Commercial class
 * @param rate was added to the Commercial class
 * @param rate2 was added to the Residential class
 * If statement was added to the Residential Class
 * added init to Customer, Commercial, and Residential classes
 * changed some wording in the text on lines 110, 111, 116, 153, 154, 159
 */
open class Customer constructor(customerName: String,
                                customerNumber: String,
                                customerAddress: String,
                                squareFootage: Double,
){
    var customerName: String = ""
        get() = field
        set(value) {
            field = value
        }

    var customerNumber: String = ""
        get() = field
        set(value) {
            field = value
        }

    var customerAddress: String = ""
        get() = field
        set(value) {
            field = value
        }

    var squareFootage: Double = 0.00
        get() = field
        set(value) {
            field = value
        }
    init {
        this.customerName = customerName
        this.customerNumber= customerNumber
        this.customerAddress= customerAddress
        this.squareFootage= squareFootage
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
        get() = field
        set(value) {
            field = value
        }

    var multiProperty: Boolean = false
        get() = field
        set(value) {
            field = value
        }
    init {
        this.propertyName = propertyName
        this.multiProperty = multiProperty
    }

    fun printAll(){
        println("Contact Information" + "\n" + customerName + "\n" + customerAddress + "\n" + customerNumber + "\n"
                + "\n" + "Property Information" + "\n" + propertyName + "\n" + "Multiple Properties: " + multiProperty)
    }

    fun calculate(squareFootage: Double){
        val twoDigits = DecimalFormat("###,###,###.00")
        var rate = squareFootage/1000
        if (rate < 1)
            rate = 1.00
        else
            rate = (rate.toInt()).toDouble()

        if (multiProperty){
            var discount = (rate * 5) * 0.10
            var total = (rate * 5) - discount
            var formatted = twoDigits.format(total)
            println("$customerName your $squareFootage sq ft of your properties cost a total of " +
                    "$$formatted with your 10% multiple properties discount.")
        }
        else{
            var total = rate * 5
            var formatted = twoDigits.format(total)
            println("$customerName your $squareFootage sq ft property cost a total of $$formatted")
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
        get() = field
        set(value) {
            field = value
        }
    init {
        this.senior = senior
    }

    fun printAll(){
        println("Contact Information" + "\n" + customerName + "\n" + customerAddress + "\n" + customerNumber + "\n"
                + "Senior Citizen: " + senior)
    }
    fun calculate2(squareFootage: Double){
        val twoDigits2 = DecimalFormat("###,###,###.00")
        var rate2 = squareFootage/1000
        if (rate2 < 1)
            rate2 = 1.00
        else
            rate2 = (rate2.toInt()).toDouble()

        if (senior){

            var discount = (rate2 * 6) * 0.15
            var total2 = (rate2 * 6) - discount
            var formatted2 = twoDigits2.format(total2)
            println("$customerName your $squareFootage sq ft property cost a total of " +
                    "$$formatted2 with your 15% senior discount.")
        }
        else{
            var total2 = rate2 * 6
            var formatted2 = twoDigits2.format(total2)
            println("$customerName your $squareFootage sq ft property cost a total of $$formatted2")
        }
    }
}
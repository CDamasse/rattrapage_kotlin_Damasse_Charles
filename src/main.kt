import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.text.DecimalFormat
import java.util.ArrayList

val annee = 0
val appareil = 1
val commande = 2
val impression = 3
val clics = 4
val cout = 5
val PM = 6
val CA = 7
val reseau = 8
val mois = 9

fun main(args: Array<String>?) {
    var fileReader: BufferedReader? = null

    try {
        val customers = ArrayList<Device>()
        var line: String?

        fileReader = BufferedReader(FileReader("data_csv.csv"))

        // Read CSV header
        fileReader.readLine()

        // Read the file line by line starting from the second line
        line = fileReader.readLine()
        while (line != null) {
            val tokens = line.split(",")
            if (tokens.isNotEmpty()) {
                val customer = Device(
                    Integer.parseInt(tokens[annee]),
                    tokens[appareil],
                    Integer.parseInt(tokens[commande]),
                    Integer.parseInt(tokens[impression]),
                    Integer.parseInt(tokens[clics]),
                    Integer.parseInt(tokens[cout]),
                    Integer.parseInt(tokens[PM]),
                    Integer.parseInt(tokens[CA]),
                    Integer.parseInt(tokens[reseau]),
                    tokens[mois]
                )
                customers.add(customer)
            }

            line = fileReader.readLine()
        }
        // Print the new customer list
        for (customer in customers) {
            println(customers)
        }
    } catch (e: Exception) {
        println("Reading CSV Error!")
        e.printStackTrace()
    } finally {
        try {
            fileReader!!.close()
        } catch (e: IOException) {
            println("Closing fileReader Error!")
            e.printStackTrace()
        }
    }
}

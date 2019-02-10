import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.time.format.DecimalStyle
import java.util.ArrayList

private const val annee = 0
private const val appareil = 1
private const val commande = 2
private const val impression = 3
private const val clics = 4
private const val cout = 5
private const val PM = 6
private const val CA = 7
private const val reseau = 8
private const val mois = 9

fun main() {
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
            val tokens = line.split(";")
            if (tokens.isNotEmpty()) {
                val customer = Device(
                    tokens[annee],
                    tokens[appareil],
                    tokens[commande],
                    Integer.parseInt(tokens[impression]),
                    Integer.parseInt(tokens[clics]),
                    tokens[cout],
                    Integer.parseInt(tokens[PM]),
                    Integer.parseInt(tokens[CA]),
                    tokens[reseau],
                    tokens[mois]
                )
                customers.add(customer)
            }

            line = fileReader.readLine()
        }

        // Print the new customer list
        for (i in customers) {
            println(i)
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

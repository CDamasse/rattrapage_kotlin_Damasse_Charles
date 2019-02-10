import com.sun.org.apache.xerces.internal.impl.dv.xs.DecimalDV
import java.math.BigInteger
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.time.format.DecimalStyle
import java.util.*

class Device(
    var annee: String,
    var appareil: String,
    var commande: String,
    var impression: Int,
    var clics: Int,
    var couts: String,
    var PM: String,
    var CA: String,
    var reseau: String,
    var mois: String
):DeviceInterface {

    override fun toString(value: String): String {

        val Device = "Device [$annee$appareil$commande$impression$clics$couts$PM$CA$reseau$mois]"

        Device.replace(",",".")

        return Device
    }



/*
    override fun returnDevice(value: Array<Any>): Array<Any> {

        return arrayOf(annee, appareil, commande, impression, clics, couts, PM, CA, reseau, mois)
    }
    */

}

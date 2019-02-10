import java.math.BigInteger
import java.util.*

class Device(
    var annee: Int,
    var appareil: String,
    var commande: Int,
    var impression: Int,
    var clics: Int,
    var couts: Int,
    var PM: Int,
    var CA: Int,
    var reseau: Int,
    var mois: String
):DeviceInterface {

    /*override fun toString(value: String): String {
        return "Device [$annee, $appareil, $commande, $impression, $clics, $couts, $PM, $CA, $reseau, $mois]"
    }
    */



    override fun returnDevice(value: Array<Any>): Array<Any> {

        return arrayOf(annee, appareil, commande, impression, clics, couts, PM, CA, reseau, mois)
    }

}

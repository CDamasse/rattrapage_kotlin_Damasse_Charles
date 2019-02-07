import java.text.DecimalFormat

class Device(
    var annee: Int,
    var appareil: String?,
    var commande: Int?,
    var impression: Int?,
    var clics: Int?,
    var couts: Int?,
    var PM: Int?,
    var CA: Int?,
    var reseau: Int?,
    var mois: String?
):DeviceInterface {

    /*override fun toString(): String {
        return "Device [$annee, $appareil, $commande, $impression, $clics, $couts, $PM, $CA, $reseau, $mois]"
    }
    */

    override fun returnDevice(): Array<Any?> {
        return arrayOf(annee, appareil, commande, impression, clics, couts, PM, CA, reseau, mois)
    }
}

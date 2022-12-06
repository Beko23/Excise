


fun main() {

    var n= readLine()?.toInt()!!
    var soat=n/3600
    var min=n/60-soat*60
    var sek=n % 60

    println("$soat  : $min : $sek")
}
class Data constructor(
    val name:String
) {
    var malumot:String=""
    var yosh:Int=0
    var kurs:String=""
    var vaqti:String=""
    var narx:Int=0
    var boolean:Boolean=false
    constructor(malumot:String,yosh:Int):this("Beko"){
        this.malumot=malumot
        this.yosh=yosh
    }
    constructor(kurs:String,vaqti:String):this("Talaba",24){
        this.kurs=kurs
        this.vaqti=vaqti
    }
    constructor(narx:Int):this("Android","Toq kunlari 19:00"){
        this.narx=narx
    }
    constructor(boolean: Boolean):this(750){
        this.boolean=boolean
    }
    fun Datamalumot (){
        println("O'quvchi ismi: $name\nMa'lumoti: $malumot\nYoshi: $yosh\nQaysi Kurs: $kurs\nVaqti: $vaqti\nKurs narxi: $narx\n Booolean: $boolean")
    }

}
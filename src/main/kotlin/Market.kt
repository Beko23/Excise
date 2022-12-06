class Market constructor(
    var arraylist:ArrayList<Laptop>
){
    fun printlaptop(){
        for (i in 0 until arraylist.size){
            println("Modeli: ${arraylist.get(i).model} Protses: ${arraylist.get(i).protses} " +
                    "Ram: ${arraylist.get(i).ram} SSD: ${arraylist.get(i).ssd}")
        }
    }

}

fun main(){

    val laptoplist=ArrayList<Laptop>()
    laptoplist.add(Laptop("Asus","Core i5-10987",8,256))
    laptoplist.add(Laptop("Hp","Core i7-11987",16,512))
    laptoplist.add(Laptop("Macpro","Core i7-12087",16,512))

    val market=Market(laptoplist)
    market.printlaptop()
}


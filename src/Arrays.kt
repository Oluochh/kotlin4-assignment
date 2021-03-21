import java.util.*

fun main() {
    names("laura", "Billy", "Esther", "Collins")
    cities()
    numbers()
  println(Arrays.toString(name("laura","Billy","Esther","Collins")))


}
fun names(w:String,x:String,y:String,z:String) {
    var names= arrayOf("$w,$x,$y,$z")
    println(Arrays.toString(names))

}
fun cities() {
var cities= arrayOf("Harare","Mumbai","Dodoma","Jakarta")
cities.forEach { cities ->
    println(cities.capitalize())
}
}
fun numbers() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sum = numbers.get(1) + numbers.get(4)
    println(sum)

    var index = numbers.indexOf(158)
    println(index)

    var sortedNums = numbers.sortedArray()
    println(Arrays.toString(sortedNums))

}

fun name(w:String,x:String,y:String,z:String):Array<String> {
    var name= arrayOf("$w,$x,$y,$z")
    return name

}





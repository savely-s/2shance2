fun main(){
    var V1 = readLine()!!.toInt()
    var V2 = readLine()!!.toInt()
    var S = readLine()!!.toInt()
    var T = readLine()!!.toInt()
    var p = V1 + V2
    println("суммарная скорость: $p")
    var c = T * p
    println("Общий путь: $S")
    println("время умноженное на сумарное время: $c")

}
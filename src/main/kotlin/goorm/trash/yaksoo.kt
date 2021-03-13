package goorm.trash

fun main() {
    val yks = readLine()!!.toInt()
    for (i in 1..yks/2){
        if (yks % i == 0){
            print("$i ")
        }
    }
    print("$yks ")
}
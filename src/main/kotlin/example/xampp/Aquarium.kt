package example.xampp

import javax.swing.UIManager.get

class Aquarium  (var length: Int = 100, var width: Int = 20, var height: Int =
    40){
    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
        val volume: Int

    }
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()


    }

        fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm "
        )

            // 1 liter = 1000 cm^3
            val volume = ""
            println("Volume: $volume liters")
        }

}
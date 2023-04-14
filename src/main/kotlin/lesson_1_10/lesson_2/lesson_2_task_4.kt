package lesson_1_10.lesson_2

    fun main (){

        val baff = 0.2

        val crystalline = 7
        val bonusCrystalOre = crystalline * baff
        println("Бонусная кристальная руда будет ровняться = ${bonusCrystalOre.toInt()} (у.е.)")

        val iron = 11
        val bonusIronOre = iron * baff
        println("Бонусная железная руда будет ровняться = ${bonusIronOre.toInt()} (у.е.)")
    }
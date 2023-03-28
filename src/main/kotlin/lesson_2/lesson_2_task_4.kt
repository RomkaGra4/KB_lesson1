package lesson_2

    fun main (){

        val baff = 0.2

        var crystalline = 7
        var bonusCrystalOre = crystalline * baff
        println("Бонусная кристальная руда будет ровняться = ${bonusCrystalOre.toInt()} (у.е.)")

        var iron = 11
        var bonusIronOre = iron * baff
        println("Бонусная железная руда будет ровняться = ${bonusIronOre.toInt()} (у.е.)")
    }
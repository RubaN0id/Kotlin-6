package ru.otus.cars

/**
 * Машина целиком
 */
sealed interface Car : CarInput {
    /**
     * Номерной знак
     */
    val plates: Plates

    /**
     * Цвет машины
     */
    val color: String

    /**
     * Следит за машиной
     */
    val carOutput: CarOutput

    /**
     * горловина
     */
    val tankMouth: TankMouth

    val tank: Tank

    /**
     * Получить оборудование
     */
    fun getEquipment(): String

    // свойство двигателя
    val engine: VazEngine

    /**
     * Внутренний статический класс - номерой знак
     */
    data class Plates(val number: String, val region: Int)
}
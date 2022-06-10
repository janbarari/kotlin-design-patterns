package io.github.janbarari.chain

fun main() {

    val unitConverter = UnitConverter()

    val param = ConvertParams(
        10,
        "mm",
        "cm"
    )

    println(
        unitConverter.convert(param)
    )

}

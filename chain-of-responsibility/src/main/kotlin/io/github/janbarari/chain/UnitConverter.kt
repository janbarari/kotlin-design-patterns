package io.github.janbarari.chain

class UnitConverter {

    val unitConverterChain = CentimeterToMeterHandler(
        MeterToCentimeterHandler(
            MillimeterToCentimeterHandler(
                CentimeterToMillimeterHandler(
                    null
                )
            )
        )
    )

    fun convert(param: ConvertParams): String? {
        return unitConverterChain.handle(param)
    }

}

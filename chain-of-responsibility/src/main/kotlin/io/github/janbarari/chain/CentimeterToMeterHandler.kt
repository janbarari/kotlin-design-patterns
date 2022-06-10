package io.github.janbarari.chain

class CentimeterToMeterHandler(
    next: BaseHandler<ConvertParams, String>?
): BaseHandler<ConvertParams, String>(next) {

    override fun handle(input: ConvertParams): String? {
        if (input.fromUnit == "cm" && input.toUnit == "m") {
            val result = input.value / 100L
            return result.toString()
        }
        return super.handle(input)
    }

}
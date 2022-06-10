package io.github.janbarari.chain

class MeterToCentimeterHandler(
    next: BaseHandler<ConvertParams, String>?
): BaseHandler<ConvertParams, String>(next) {

    override fun handle(input: ConvertParams): String? {
        if (input.fromUnit == "m" && input.toUnit == "cm") {
            val result = input.value * 100L
            return result.toString()
        }
        return super.handle(input)
    }

}
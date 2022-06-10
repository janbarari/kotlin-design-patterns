package io.github.janbarari.chain

class MillimeterToCentimeterHandler(
    next: BaseHandler<ConvertParams, String>?
): BaseHandler<ConvertParams, String>(next) {

    override fun handle(input: ConvertParams): String? {
        if (input.fromUnit == "mm" && input.toUnit == "cm") {
            val result = input.value / 10L
            return result.toString()
        }
        return super.handle(input)
    }

}
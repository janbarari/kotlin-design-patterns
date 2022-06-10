package io.github.janbarari.chain

class CentimeterToMillimeterHandler(
    next: BaseHandler<ConvertParams, String>?
): BaseHandler<ConvertParams, String>(next) {

    override fun handle(input: ConvertParams): String? {
        if (input.fromUnit == "cm" && input.toUnit == "mm") {
            val result = input.value * 10L
            return result.toString()
        }
        return super.handle(input)
    }

}
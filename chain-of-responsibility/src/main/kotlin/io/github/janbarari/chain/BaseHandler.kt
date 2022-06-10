package io.github.janbarari.chain

abstract class BaseHandler<INPUT, OUTPUT>(
    private val next: BaseHandler<INPUT, OUTPUT>?
) {

    open fun handle(input: INPUT): OUTPUT? {
        if(next != null) {
            return next.handle(input)
        }
        return null
    }

}
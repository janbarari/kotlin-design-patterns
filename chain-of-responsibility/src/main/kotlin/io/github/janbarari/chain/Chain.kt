package io.github.janbarari.chain

interface Chain<INPUT, OUTPUT> {
    fun process(input: INPUT): OUTPUT
}
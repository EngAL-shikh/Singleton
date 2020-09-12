fun main() {
    println("omar")
    PrinterDriver.print()
    PrinterDriver.print()
}

object PrinterDriver {
    init {
        println("Initializing with object: $this")
    }

    fun print() = println("Printing with object: $this")
}
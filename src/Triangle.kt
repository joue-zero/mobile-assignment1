open class Triangle(_name: String) : Shape(_name) {
    var side1 = 0.0
    var side2 = 0.0
    var side3 = 0.0
     override fun setDimensions(vararg dimensions: Double) {
        side1 = dimensions[0]
        side2 = dimensions[1]
        side3 = dimensions[2]
    }
    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }
    override fun printDimensions() {
        println("Side 1: $side1, Side 2: $side2, Side 3: $side3")
    }
}
class Circle(_name : String) : Shape(_name) {
    var radius = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        radius = dimensions[0]
    }
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
    override fun printDimensions() {
        println("Radius: $radius")
    }
}
fun main() {
    var circle: Shape = Circle("Circle")
    var square: Shape = Square("Square")
    var triangle: Shape = Triangle("Triangle")
    var equilateralTriangle: Shape = EquilateralTriangle("Equilateral Triangle")

    // let user input the dimensions
    var raduis: Double
    var length: Double
    var height: Double
    var side: Double
    var side2: Double
    var side3: Double

    print("Enter the radius of the circle: ")
    raduis = readLine()!!.toDouble()
    circle.setDimensions(raduis)
    println(circle.name)
    println("Area of the circle: ${circle.getArea()}")
    circle.printDimensions()

    println("************************************")
    print("Enter the length of the square: ")
    length = readLine()!!.toDouble()
    print("Enter the height of the square: ")
    height = readLine()!!.toDouble()
    square.setDimensions(length, height)
    println(square.name)
    println("Area of the square: ${square.getArea()}")
    square.printDimensions()

    println("************************************")
    print("Enter the side of the triangle: ")
    side = readLine()!!.toDouble()
    print("Enter the second side of the triangle: ")
    side2 = readLine()!!.toDouble()
    print("Enter the third side of the triangle: ")
    side3 = readLine()!!.toDouble()
    triangle.setDimensions(side, side2, side3)
    println(triangle.name)
    println("Area of the triangle: ${triangle.getArea()}")
    triangle.printDimensions()
    println("************************************")
    print("Enter the side of the equilateral triangle: ")
    side = readLine()!!.toDouble()
    println(equilateralTriangle.name)
    equilateralTriangle.setDimensions(side)
    println("Area of the equilateral triangle: ${equilateralTriangle.getArea()}")
    equilateralTriangle.printDimensions()


}
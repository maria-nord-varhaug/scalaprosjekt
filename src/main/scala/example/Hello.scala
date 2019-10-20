package example

object Hello {// Scala code has to be in an object or class
  val x = 1               // vals are immutable
  val y: Int = 2          // we can also explicitly specify type
  var z: Int = x + y      // var is a mutable variable, can also declare or not declare type
  z = z + 1               // so this is possible

  (x: Int) => x + 1       // anonymous function ? 
  val add1 = (x: Int) => x + 1 // naming functions
  val add = (x: Int, y: Int) => x + y  //Here we have to declare type?
  val getAnswer = () => 42

  def subtract(x: Int, y: Int):Int = x - y    //Method, a bit different from a function. Can take several lists of parameters: 
  def addThenMultiply(x: Int, y:Int)(multiplier: Int): Int = (x + y) * multiplier    // Has : before the body. Int is the type returned
  def tall: Int = 3                                                                 // Can also have no parameters
  def getSquareString(input: Double): String = {  // {} is a block of code
    val square = input * input
    square.toString                               // The last expression in the body is the methods return value (return is rarely used)
  }


  val emptyList = Nil
  println(addThenMultiply(1,2)(3))    
  println(tall)    
} 


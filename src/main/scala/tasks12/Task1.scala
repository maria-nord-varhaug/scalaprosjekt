package tasks12

object Task1 extends App {
    val list = List(1,2,3,4,5)

    def generateRangeList: List[Int] = { // the sketch is real, ikke veldig funksjonelt
        var list:List[Int] = Nil
        var i = 0
        for(i <- 1 to 50){
            list = list:::i::Nil
        }
        return list
    }

    val newGenerateRangedList = 
        for(number <- 1 to 50)
            yield number

    /*def sumFor(list: List[Int]): Int = {
        var sum: Int = 0
        for(value <- list){
            sum += value
        }
    }*/

    def sumFor(list: List[Int]): Int = { 
        var sum = 0
        for(number <- list) 
            sum += number // ikke funksjonell
        sum
    }

    def sum(list: List[Int], accumulator:Int): Int = list match {
        case start :: rest => sum(rest, accumulator + start)
        case Nil => accumulator
    }



    println(sum(list, 0))
    println(newGenerateRangedList)
    println(sumFor(list))
    //println(generateRangeList)
}
import javax.print.attribute.IntegerSyntax

// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println(stringResult)
    println(intResult)
}

// TODO 1
fun <T> getResult(args: T): Int {
   var  x = if(args is Int) {
         args * 5
    }
   else if(args is String){
         args.length
    }else{
       0
   }
    return x
}




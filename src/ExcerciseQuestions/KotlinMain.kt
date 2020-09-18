package ExcerciseQuestions

fun main(){
    var kotlinFunctions = KotlinFunctions()

    //checking armstrong number
    println(kotlinFunctions.armstrongNUmber(153))
    println(kotlinFunctions.armstrongNUmber(158))

    //sublist function
    val A = listOf(0, 10, 2, 1, 2, 3, 4, 5)
    val B = listOf(4, 5)
    if(A.size>B.size)
        kotlinFunctions.recursivecall(A, B, 0, B.size)
    if(B.size>A.size)
        kotlinFunctions.recursivecall(B, A, 0, B.size)
    else{
        if(A==B){println("")}
    }

    //Leap Year function
    println(kotlinFunctions.leapYear(1600))
    println(kotlinFunctions.leapYear(1700))

    //occurences of a word
    println(kotlinFunctions.stringCount("olly olly in come free"))
    println(kotlinFunctions.stringCount("knock knock welcome to check"))

    //reversing a string
    println(kotlinFunctions.reverseString("cool"))
    println(kotlinFunctions.reverseString("sundar"))
}


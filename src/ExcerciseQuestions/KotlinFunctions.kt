package ExcerciseQuestions

class KotlinFunctions {

    fun armstrongNUmber(numberValue:Int): String{
        val numberList = mutableListOf<Int>()
        var sum:Int = 0
        var remainningValue = numberValue
        while(remainningValue != 0){
            var remainder = remainningValue%10
            remainningValue = remainningValue/10
            numberList.add(remainder)
        }
        println(numberList)
        numberList.forEach {
            sum = sum + (Math.pow(it.toDouble(),(numberList.size).toDouble())).toInt()
        }
        if(sum == numberValue)
            return ("the number $numberValue is an amstrong number")
        else
            return ("the number $numberValue is not an amstrong number")
    }

    fun recursivecall(listA: List<Int>, listB: List<Int>, start: Int, end: Int) {

        var samp = listA.subList(start, end)
        if (samp == listB) {
            println(samp)
            println("$listB is subset of $listA")
        } else if (end == listA.size) {
            println("Nothing matching")
        } else
            recursivecall(listA, listB, start + 1, end + 1)
    }

    fun leapYear(years : Int): String{
        if(years % 400 == 0)
            return "The year $years is a leap year"
        else if(years % 4 == 0 && !(years % 100 == 0 ))
            return "The year $years is a leap year"
        else
            return "The year $years is not leap year"
    }

    fun reverseString(values : String) {
        var finalReversedString: String = ""
        var checking:Int = 0
        val strArr:Array<Char> = arrayOf<Char>()
        for(i in values.length - 1 downTo 0){
            finalReversedString = finalReversedString + values[i]
        }
        println(finalReversedString)
    }

    fun stringCount(str: String) {

        val splittedString = str.trim().splitToSequence(' ')
            .filter{it.isNotEmpty()}.toList()
        println(splittedString)
        println(splittedString.groupBy { it }
            .mapValues { it.value.count() })
    }
}
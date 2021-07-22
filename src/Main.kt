fun main() {
    print(arrayMaxConsecutiveSum(mutableListOf(2, 3, 5, 1, 6),2))
}

fun arrayMaxConsecutiveSum(inputArray: MutableList<Int>, k: Int): Int {
    var sumList=mutableListOf<Int>()
    for(i in 0 until inputArray.size){
        var m=i+k
        if(m<=inputArray.size){
            var sum=0
            for(j in i..i.plus(k.minus(1)))
                sum+=inputArray[j]

            sumList.add(sum)
        }
    }

    return sumList.maxOf{ it }

}

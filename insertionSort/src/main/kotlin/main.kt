fun main(args: Array<String>) {
    val unsortedList = mutableListOf<Int>(
        3,5,2,6,1,5,6,8,3,9,3,5,3,2,5,76,3,43,12,4,3,423,42,12,6,534,5,123,65,213
    )
    //
    println("Unsorted list: ${unsortedList}")
    val sortedList = insertionSort(unsortedList)
    println("sorted list: $sortedList")

}

fun insertionSort(list: MutableList<Int>): List<Int>{
    for(i in 1 until list.size){
        val currentItem = list[i]
        if(currentItem < list[i-1]){
            for(j in i-1 downTo 0){
                if(currentItem < list[j]){
                    list[j+1] = list[j]
                }else{
                    list[j+1] = currentItem
                    break
                }
                if(j==0){
                    list[j] = currentItem
                }
            }
        }
    }



    return list.toList()
}
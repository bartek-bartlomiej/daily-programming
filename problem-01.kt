/*
fun containsSum(elements: List<Int>, sum: Int): Boolean {
    elements.forEach { element ->
        val secondElement = sum - element
        if (elements.contains(secondElement)) return true
    }
    return false
}
*/

fun containsSum(elements: List<Int>, sum: Int): Boolean {
    val queriedElements = mutableSetOf<Int>()
    
    return elements.any { element ->
        queriedElements.add(element)
        
        queriedElements.contains(sum - element)
    }
}

fun main() {
    println(containsSum(listOf(10, 15, 3, 7), 17))
    println(containsSum(listOf(15, 3, 7), 17))
}

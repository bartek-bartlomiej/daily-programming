fun <T> cons(a: T, b: T): ((T, T) -> T) -> T  {
	val pair: ((T, T) -> T) -> T = { f -> f(a, b) }
    return pair
}

fun <T> car(pair: ((T, T) -> T) -> T): T {
    val first = { a: T, _: T -> a }
    return pair(first)
}

fun <T> cdr(pair: ((T, T) -> T) -> T): T {
    val second = { _: T, b: T -> b }
    return pair(second)
}

fun main() {
   val pair = cons(3, 4)
   println(car(pair))
   println(cdr(pair))
}

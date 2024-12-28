```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = list.filter { it % 2 != 0 }.toMutableList() // Create a new list
    println(filteredList)
}
```
# Kotlin MutableList.removeIf() Unexpected Behavior

This repository demonstrates a potential issue with the `removeIf` function when used with a `MutableList` in Kotlin.  The `removeIf` function modifies the list in place, leading to unexpected results if the list is accessed or iterated concurrently or in a way not anticipating in-place modification.  The example shows how unexpected elements might remain after filtering.

The solution involves creating a new list with the filtered elements, avoiding the in-place modification and ensuring predictable behavior.
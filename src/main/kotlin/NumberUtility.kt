/**
 * Contains utility functions for dealing with numbers.
 */
@Suppress("unused", "FunctionName")
external object NumberUtility {
    /**
     * Adds together a list of numbers where items are allowed to be pre-commified.
     *
     * @param numbers An array of items to add; items may be either Numbers or commified Number strings.
     * @return The commified total of all numbers that were passed in.
     */
    fun add_commified_numbers(numbers: List<String>): String

    /**
     * Takes a number and adds commas to the appropriate places, e.g. 1000000 to 1,000,000.
     *
     * @param number The value you want commified.
     */
    fun commify(number: NumberUtility): String
}
/**
 * @param key The identifying string with which this data is stored and can be retrieved
 * @param value The value to store under the given key
 */
data class Data<T>(val key: String, val value: T?)
import kotlin.js.Date

@Suppress("unused", "FunctionName")
external object DateUtility {
    fun create_date(date_string: String, time_string: String, options: CreateDateOptions? = definedExternally): Date
    fun date_to_UTC_string(date: Date): String
    fun date_to_UTC_timestamp(date: Date): Long
    // TODO: Figure out the return types and represent them properly here
    fun date_to_string(date: Date, options: DateToStringOptions? = definedExternally): dynamic
}

data class CreateDateOptions(val utc: Boolean)
data class DateToStringOptions(val military: Boolean)
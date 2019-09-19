import kotlin.js.Date

/**
 * Contains utility functions for dealing with dates.
 */
@Suppress("unused", "FunctionName")
external object DateUtility {
    /**
     * Creates a Date object given a date and time.
     *
     * @param date_string e.g. 2011-10-31
     * @param time_string e.g. 12:00am or 1:00pm
     * @param options Additional options
     * @return The passed-in date, represented as a JavaScript Date object.
     */
    fun create_date(date_string: String, time_string: String, options: CreateDateOptions? = definedExternally): Date

    /**
     * Takes a Date object and returns a UTC date and time string.
     *
     * @param date The JavaScript Date object.
     * @return The passed-in date, represented as a UTC date and time string ex. "2011-10-31 12:00:00" (12pm on Halloween).
     */
    fun date_to_UTC_string(date: Date): String

    /**
     * Takes a Date object and returns a UTC timestamp which represents the number of seconds since January 1, 1970.
     *
     * @param date The Javascript Date object.
     * @return The passed-in date, represented as a UTC timestamp.
     */
    fun date_to_UTC_timestamp(date: Date): Long


    /**
     * Takes a Date object and returns an object containing various date and time formats in local time.
     *
     * @param date The JavaScript Date object.
     * @param options Additional options
     * @return The passed-in date, represented in various formats in an object
     */
    fun date_to_string(date: Date, options: DateToStringOptions? = definedExternally): DateToStringOutput
}

/**
 * @param utc If true, the passed in datetime is UTC time.
 */
data class CreateDateOptions(val utc: Boolean = false)

/**
 * @param military If true, returns the date in military (24h) format, if false, returns it in standard (12h) format.
 */
data class DateToStringOptions(val military: Boolean = true)

/**
 * @param date Date represented in string form such as "2019-09-19"
 * @param time Time represented in string form such as "02:36 PM"
 * @param time_no_pad Time represented in string form without padding such as "2:36 PM"
 */
data class DateToStringOutput(val date: String, val time: String, val time_no_pad: String)
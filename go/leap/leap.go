// Package leap contains a function for calculating Leap Year
package leap

// IsLeapYear takes an input year and returns true or false, based on if its a leap year.
func IsLeapYear(year int) bool {
	return (year%4 == 0 && year%100 != 0) || year%400 == 0
}

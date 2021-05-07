// Package raindrops contains a Convert function.
package raindrops

import "strconv"

// Convert takes an integer and returns the rain drop sound string, or the integer.
func Convert(n int) string {
	rain := ""

	if n%3 == 0 {
		rain += "Pling"
	}
	if n%5 == 0 {
		rain += "Plang"
	}
	if n%7 == 0 {
		rain += "Plong"
	}

	if rain == "" {
		return strconv.Itoa(n)
	}

	return rain
}

// Package isogram has a function IsIsogram
package isogram

import (
	"strings"
	"unicode"
)

// IsIsogram takes an input string and returns a bool telling whether its an isogram or not
func IsIsogram(input string) bool {
	alphabetMap := make(map[rune]int, 26)
	input = strings.ToUpper(input)

	for _, i := range input {
		if !unicode.IsLetter(i) {
			continue
		}
		alphabetMap[i] += 1
		if alphabetMap[i] > 1 {
			return false
		}
	}

	return true
}

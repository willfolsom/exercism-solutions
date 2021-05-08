// Package isogram has a function IsIsogram
package isogram

import "strings"

const ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

// IsIsogram takes an input string and returns a bool telling whether its an isogram or not
func IsIsogram(input string) bool {
	alphabetMap := make(map[rune]int, 26)

	input = strings.ToUpper(input)

	for _, i := range input {
		if strings.ContainsRune(ALPHABET, i) {
			alphabetMap[i] += 1
		}
	}

	for _, value := range alphabetMap {
		if value > 1 {
			return false
		}
	}

	return true
}

// Package scrabble contains a function for determining Score
package scrabble

import "strings"

const (
	TWO   string = "DG"
	THREE string = "BCMP"
	FOUR  string = "FHVWY"
	FIVE  string = "K"
	EIGHT string = "JX"
	TEN   string = "QZ"
)

// Score returns the Scrabble score of a word
func Score(word string) int {
	score := 0
	for _, c := range strings.ToUpper(word) {
		if strings.ContainsRune(TWO, c) {
			score += 2
		} else if strings.ContainsRune(THREE, c) {
			score += 3
		} else if strings.ContainsRune(FOUR, c) {
			score += 4
		} else if strings.ContainsRune(FIVE, c) {
			score += 5
		} else if strings.ContainsRune(EIGHT, c) {
			score += 8
		} else if strings.ContainsRune(TEN, c) {
			score += 10
		} else {
			score += 1
		}
	}

	return score
}

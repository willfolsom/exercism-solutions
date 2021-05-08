// Package scrabble contains a function for determining Score
package scrabble

import s "strings"

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
	letters := s.Split(s.ToUpper(word), "")

	score := 0
	for _, c := range letters {
		if s.Contains(TWO, c) {
			score += 2
		} else if s.Contains(THREE, c) {
			score += 3
		} else if s.Contains(FOUR, c) {
			score += 4
		} else if s.Contains(FIVE, c) {
			score += 5
		} else if s.Contains(EIGHT, c) {
			score += 8
		} else if s.Contains(TEN, c) {
			score += 10
		} else {
			score += 1
		}
	}

	return score
}

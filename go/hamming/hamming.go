// Package hamming provides a function for determining Hamming Distance
package hamming

// Import errors to generate new errors with messages
import (
	"errors"
)

/* Function Distance compares two DNA sequence strings and returns the Hamming Distance,
*  or 0 and an error if the strings are of different length or empty. */
func Distance(a, b string) (int, error) {
	runesA, runesB := []rune(a), []rune(b)
	if len(runesA) != len(runesB) {
		return 0, errors.New("Not allowed")
	}

	distance := 0
	for i := 0; i < len(runesA); i++ {
		if runesA[i] != runesB[i] {
			distance++
		}
	}

	return distance, nil
}

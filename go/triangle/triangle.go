// Contains a function to check sides and return triangle type
package triangle

// Used to check "not a number"s and "infinity"s
import (
	"math"
)

type Kind int

// iota makes these 0-3
const (
	NaT Kind = iota // Not a Triangle
	Equ Kind = iota // Equilateral Triangle
	Iso Kind = iota // Isoceles Triangle
	Sca Kind = iota // Scalene Triangle
)

// Checks three input sides and returns the Kind of triangle
func KindFromSides(a, b, c float64) Kind {
	if (a <= 0 || b <= 0 || c <= 0) ||
		((a+b < c) || (b+c < a) || (a+c < b)) ||
		(math.IsNaN(a) || math.IsNaN(b) || math.IsNaN(c)) ||
		(math.IsInf(a, 0) || math.IsInf(b, 0) || math.IsInf(c, 0)) {
		return NaT
	}

	if a == b && b == c {
		return Equ
	} else if (a == b && a != c) || (b == c && b != a) || (a == c && a != b) {
		return Iso
	} else {
		return Sca
	}
}

// Package twofer provides a function ShareWith to return a custom string.
package twofer

// ShareWith returns a custom string "One for {name}, one for me." base on name input, or uses "you" as {name}.
func ShareWith(name string) string {
	if name == "" {
		name = "you"
	}

	return "One for " + name + ", one for me."
}

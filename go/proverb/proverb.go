// Package proverb has a function Proverb that returns a proverb. ;)
package proverb

// Proverb returns a structured proverb based on an input list of strings.
func Proverb(rhyme []string) []string {
	proverb := []string{}

	if len(rhyme) != 0 {
		for i, item := range rhyme {
			if i < len(rhyme) - 1 {
				proverb = append(proverb, getStandardLine(item, rhyme[i+1]))
			} else {
				proverb = append(proverb, getLastLine(rhyme[0]))
			}
		}
	}

	return proverb
}

// Concat is more performant than fmt.Sprintf
// https://dev.to/pmalhaire/concatenate-strings-in-golang-a-quick-benchmark-4ahh
func getStandardLine(item1 string, item2 string) string {
	return "For want of a " + item1 + " the " + item2 + " was lost."
}

func getLastLine(item string) string {
	return "And all for the want of a " + item + "."
}

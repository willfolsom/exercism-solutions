package gigasecond

// import path for the time package from the standard library
import "time"

// AddGigasecond takes a time and returns the time 1,000,000,000 seconds after
func AddGigasecond(t time.Time) time.Time {
	return t.Add(time.Second * 1000000000)
}

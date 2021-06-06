# exercism-solutions
Exercism provides learning tracks for languages with coding problems and prompts for each, increasing fluency.

**I highly encourage folks to try to it out for themselves.** It's not about solutions so much as it is about learning.

My solutions are divided by ```{language}/{prompt}```. Some of them have short READMEs to give the idea of what to expect. Others (like Hello World) should just be intuited.

[Here is my Exercism profile.](https://exercism.io/profiles/willfolsom)

### Note
This does not cover installation instructions, but happy to help if you have issues along the way.

---

## Go
In individual {prompt} directories, run ```go test``` to see that they pass.

---

## Kotlin

Copy and paste the contents of the base ```kotlin/wrapper/``` directory into ```kotlin/{prompt}/gradle/wrapper/``` for whichever prompt you are trying to run. (I didn't want to check-in the jar file redundantly).

Then run ```./gradlew test``` to see tests passing. Testing will add a ```build/``` and ```.gradle/``` directory.

You may have to run ```chmod +x ./gradlew``` to allow yourself proper access.

If on Windows, ```gradlew test``` should work, but you'll need the `.bat` which isn't in every solution.

---

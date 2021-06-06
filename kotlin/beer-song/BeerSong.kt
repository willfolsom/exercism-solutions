object BeerSong {
    fun verses(startBottles: Int, takeDown: Int): String {
        var outString = "";

        for (i in startBottles downTo takeDown) {
            when {
                i == 0 -> outString += "${if (i == takeDown && startBottles != takeDown) "\n" else ""}No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n";
                i == 1 -> outString += "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n";
                i > 1 -> outString += "${i} bottles of beer on the wall, ${i} bottles of beer.\nTake one down and pass it around, ${i-1} bottle${if (i-1>1) "s" else ""} of beer on the wall.\n${if (i > takeDown) "\n" else ""}";
            }
        }

        return outString;
    }
}

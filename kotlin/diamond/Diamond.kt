class DiamondPrinter {
    fun printToList(input: Char): List<String> {
        var list = arrayListOf<String>();
        val distance = input - 'A';
        var d = distance;
        var x = 1;
        val space = " ";

        var spaceString = "";
        for (i in 'A'..input) {
            var its = i.toString();
            if (i == 'A') {
                if (distance > 0) {
                    spaceString = space.repeat(distance);
                }
                list.add(spaceString + i + spaceString);
            } else {
                d-=1;
                spaceString = space.repeat(x);
                var outerSpaceString = space.repeat(d);
                list.add(outerSpaceString + its + spaceString + its + outerSpaceString);
                x+=2;
            }
        }

        return list.slice(0..distance) + list.slice(0..distance-1).reversed();
    }
}

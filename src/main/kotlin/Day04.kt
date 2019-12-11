class Day04 {

    fun countInRange(rangeInput: String): Int {
        val range = rangeInput.split("-")
        var found = 0
        print("Possible:")
        for (pass in range[0].toInt()..range[1].toInt()) {
            if (checkPossiblePassword(pass)) {
                print("$pass,")
                found++
            }
        }
        println()
        return found
    }

    fun checkPossiblePassword(pass: Int): Boolean {
        val stringPass = pass.toString()
        if (stringPass.length != 6) return false
        var doubleFound = false
        for (i in 1..stringPass.length - 1) {
            if (stringPass[i] < stringPass[i - 1]) {
                return false
            }
            if (stringPass[i] == stringPass[i - 1]) {
                doubleFound = true
            }
        }
        if (!doubleFound) return false
        return true
    }

    fun countInRange2(rangeInput: String): Int {
        val range = rangeInput.split("-")
        var found = 0
        print("Possible:")
        for (pass in range[0].toInt()..range[1].toInt()) {
            if (checkPossiblePassword2(pass)) {
                print("$pass,")
                found++
            }
        }
        println()
        return found
    }

    fun checkPossiblePassword2(pass: Int): Boolean {
        val stringPass = pass.toString()
        if (stringPass.length != 6) return false
        var doubleFound = false
        for (i in 1..stringPass.length - 1) {
            if (stringPass[i] < stringPass[i - 1]) {
                return false
            }
            if (stringPass[i - 1] == stringPass[i] // is double if equal to last
                && !(stringPass.hasCharIndex(i + 1) && stringPass[i + 1] == stringPass[i]) // but not equal to next
                && !(stringPass.hasCharIndex(i - 2) && stringPass[i - 2] == stringPass[i]) // and not equal to i-2
            ) {
                doubleFound = true
            }
        }
        if (!doubleFound) return false
        return true
    }

    fun String.hasCharIndex(i: Int): Boolean {
        val latestIndex = this.length - 1
        return i in 0..latestIndex
    }

    // fun checkDouble(): Any? {
    //     TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    // }
}

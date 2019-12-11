import org.junit.*
import org.junit.Assert.*

class Day04Test {

    @Test
    fun check_password() {
        assertFalse("6 digit", Day04().checkPossiblePassword(11111))
        assertTrue(Day04().checkPossiblePassword(111111))
        assertFalse("no decrease", Day04().checkPossiblePassword(223450))
        assertTrue(Day04().checkPossiblePassword(223459))
        assertFalse("no double", Day04().checkPossiblePassword(123789))
    }

    @Test
    fun return_count_in_range() {
        assertEquals(2, Day04().countInRange("111111-111112"))
        assertEquals(3, Day04().countInRange("111111-111113"))
        assertEquals(2, Day04().countInRange("123456-123480"))
    }

    @Test
    fun puzzle1() {
        assertEquals(579, Day04().countInRange("353096-843212"))
    }


    @Test
    fun check_password2() {
        assertFalse(Day04().checkPossiblePassword2(123456))
        assertTrue(Day04().checkPossiblePassword2(123455))
        assertFalse(Day04().checkPossiblePassword2(123334))
        assertFalse(Day04().checkPossiblePassword2(123444))
        assertFalse("6 digit", Day04().checkPossiblePassword2(11111))
        assertTrue(Day04().checkPossiblePassword2(112233))
        assertFalse(Day04().checkPossiblePassword2(111111))
        assertFalse(Day04().checkPossiblePassword2(123444))
        assertTrue(Day04().checkPossiblePassword2(111122))
        assertFalse(Day04().checkPossiblePassword2(124445))
        assertTrue(Day04().checkPossiblePassword2(124456))
        assertFalse(Day04().checkPossiblePassword2(355567))
    }

    @Test
    fun puzzle2() {
        assertEquals(358, Day04().countInRange2("353096-843212"))
    }
}

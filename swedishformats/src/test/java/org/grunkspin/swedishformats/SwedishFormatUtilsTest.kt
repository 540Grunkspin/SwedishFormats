package org.grunkspin.swedishformats

import com.winterbe.expekt.should
import org.junit.Test


class SwedishFormatUtilsTest {
    @Test
    fun testFormatPostalCode() {
        "123 32".formatPostalCode().should.equal("123 32")
        "12332".formatPostalCode().should.equal("123 32")
        "1233".formatPostalCode().should.equal("123 3")
        "123".formatPostalCode().should.equal("123")
        "12".formatPostalCode().should.equal("12")
        "1".formatPostalCode().should.equal("1")
        "".formatPostalCode().should.equal("")
    }

    @Test
    fun testFormatMeterId() {
        "735 999 137 000 000 000".formatMeterId().should.equal("735 999 137 000 000 000")
        "735999137000000000".formatMeterId().should.equal("735 999 137 000 000 000")
        "73599913700000000".formatMeterId().should.equal("735 999 137 000 000 00")
        "7359991370000000".formatMeterId().should.equal("735 999 137 000 000 0")
        "735999137000000".formatMeterId().should.equal("735 999 137 000 000")
        "73599913700000".formatMeterId().should.equal("735 999 137 000 00")
        "7359991370000".formatMeterId().should.equal("735 999 137 000 0")
        "735999137000".formatMeterId().should.equal("735 999 137 000")
        "73599913700".formatMeterId().should.equal("735 999 137 00")
        "7359991370".formatMeterId().should.equal("735 999 137 0")
        "735999137".formatMeterId().should.equal("735 999 137")
        "73599913".formatMeterId().should.equal("735 999 13")
        "7359991".formatMeterId().should.equal("735 999 1")
        "735999".formatMeterId().should.equal("735 999")
        "73599".formatMeterId().should.equal("735 99")
        "7359".formatMeterId().should.equal("735 9")
        "735".formatMeterId().should.equal("735")
        "73".formatMeterId().should.equal("73")
        "7".formatMeterId().should.equal("7")
        "".formatMeterId().should.equal("")
    }

    @Test
    fun testFormatMeterIdWithForcedPrefix() {
        "735 999 137 000 000 000".formatMeterId("735999").should.equal("735 999 137 000 000 000")
        "735999137000000000".formatMeterId("735999").should.equal("735 999 137 000 000 000")
        "73599913700000000".formatMeterId("735999").should.equal("735 999 137 000 000 00")
        "7359991370000000".formatMeterId("735999").should.equal("735 999 137 000 000 0")
        "735999137000000".formatMeterId("735999").should.equal("735 999 137 000 000")
        "73599913700000".formatMeterId("735999").should.equal("735 999 137 000 00")
        "7359991370000".formatMeterId("735999").should.equal("735 999 137 000 0")
        "735999137000".formatMeterId("735999").should.equal("735 999 137 000")
        "73599913700".formatMeterId("735999").should.equal("735 999 137 00")
        "7359991370".formatMeterId("735999").should.equal("735 999 137 0")
        "735999137".formatMeterId("735999").should.equal("735 999 137")
        "73599913".formatMeterId("735999").should.equal("735 999 13")
        "7359991".formatMeterId("735999").should.equal("735 999 1")
        "735999".formatMeterId("735999").should.equal("735 999")
        "73599".formatMeterId("735999").should.equal("735 999")
        "7359".formatMeterId("735999").should.equal("735 999")
        "735".formatMeterId("735999").should.equal("735 999")
        "73".formatMeterId("735999").should.equal("735 999")
        "7".formatMeterId("735999").should.equal("735 999")
        "".formatMeterId("735999").should.equal("735 999")
    }

    @Test
    fun testFormattedForcedPrefix() {
        "735 999 137 000 000 000".formatMeterId("735 999").should.equal("735 999 137 000 000 000")
        "735999137000000000".formatMeterId("735 999").should.equal("735 999 137 000 000 000")
        "73599913700000000".formatMeterId("735 999").should.equal("735 999 137 000 000 00")
        "7359991370000000".formatMeterId("735 999").should.equal("735 999 137 000 000 0")
        "735999137000000".formatMeterId("735 999").should.equal("735 999 137 000 000")
        "73599913700000".formatMeterId("735 999").should.equal("735 999 137 000 00")
        "7359991370000".formatMeterId("735 999").should.equal("735 999 137 000 0")
        "735999137000".formatMeterId("735 999").should.equal("735 999 137 000")
        "73599913700".formatMeterId("735 999").should.equal("735 999 137 00")
        "7359991370".formatMeterId("735 999").should.equal("735 999 137 0")
        "735999137".formatMeterId("735 999").should.equal("735 999 137")
        "73599913".formatMeterId("735 999").should.equal("735 999 13")
        "7359991".formatMeterId("735 999").should.equal("735 999 1")
        "735999".formatMeterId("735 999").should.equal("735 999")
        "73599".formatMeterId("735 999").should.equal("735 999")
        "7359".formatMeterId("735 999").should.equal("735 999")
        "735".formatMeterId("735 999").should.equal("735 999")
        "73".formatMeterId("735 999").should.equal("735 999")
        "7".formatMeterId("735 999").should.equal("735 999")
        "".formatMeterId("735 999").should.equal("735 999")
    }

    @Test
    fun testFormatLongPersonalNumber() {
        "19930131-1234".formatLongPersonalNumber().should.equal("19930131-1234")
        "199301311234".formatLongPersonalNumber().should.equal("19930131-1234")
        "19930131123".formatLongPersonalNumber().should.equal("19930131-123")
        "1993013112".formatLongPersonalNumber().should.equal("19930131-12")
        "199301311".formatLongPersonalNumber().should.equal("19930131-1")
        "19930131".formatLongPersonalNumber().should.equal("19930131")
        "1993013".formatLongPersonalNumber().should.equal("1993013")
    }

    @Test
    fun testFormatShortPersonalNumber() {
        "930131-1234".formatShortPersonalNumber().should.equal("930131-1234")
        "9301311234".formatShortPersonalNumber().should.equal("930131-1234")
        "930131123".formatShortPersonalNumber().should.equal("930131-123")
        "93013112".formatShortPersonalNumber().should.equal("930131-12")
        "9301311".formatShortPersonalNumber().should.equal("930131-1")
        "930131".formatShortPersonalNumber().should.equal("930131")
        "93013".formatShortPersonalNumber().should.equal("93013")
    }
}


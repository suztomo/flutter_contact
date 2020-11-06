import com.google.common.truth.Truth.assertThat
import co.sunnyapp.flutter_contact.ContactExtensions
import org.junit.Test

class ContactExtensionsTest {


    @Test
    fun testParseContactDateWithHyphen() {
        val parsed = ContactExtensions.parseEventDate("1986-01-02")
        assertThat(parsed.year).isEqualTo(1986)
        assertThat(parsed.month).isEqualTo(1)
        assertThat(parsed.day).isEqualTo(2)
    }

    @Test
    fun testParseContactDate() {
        val parsed = ContactExtensions.parseEventDate("19860102")
        assertThat(parsed.year).isEqualTo(1986)
        assertThat(parsed.month).isEqualTo(1)
        assertThat(parsed.day).isEqualTo(2)
    }
}
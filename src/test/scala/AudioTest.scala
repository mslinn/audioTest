import org.scalatest._
import org.scalatest.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class AudioTest extends AnyWordSpec with MustMatchers {
  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world".length === 11
    }
  }
}

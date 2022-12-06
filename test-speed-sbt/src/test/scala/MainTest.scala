import org.specs2.mutable.Spec
import org.specs2.specification.Scope

class MainTest extends Spec {
  "p" should {
    "do100" in new Scope {
      success
    }
  }
}

import utest._

object Tests extends TestSuite:
  val tests = Tests {
    test("test1") {
      assert(1 - 0 == 1)
      println("All's well that ends well")
    }
  }

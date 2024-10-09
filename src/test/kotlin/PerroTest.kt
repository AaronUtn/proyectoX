import ar.edu.unsam.algo2.Perro
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe


class PerroTest : DescribeSpec ({
    describe("Test de Perro"){
        it("Cuando un perro ladra se escucha"){
            val perro = Perro()
            perro.ladrar() shouldBe "Guau"
        }
    }
})
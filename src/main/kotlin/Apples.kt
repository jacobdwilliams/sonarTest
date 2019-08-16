
class Apples {
    var name = "Red Delicious"
    var qty = 100

    fun takeBite(amt: Int) {
        qty -= amt
    }

    fun changeName(newName: String) {
        name = newName
    }
}
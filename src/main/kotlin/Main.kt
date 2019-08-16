fun main() {
    var apple1 = Apples()
    apple1.takeBite(25)
    println("${apple1.name} qty: ${apple1.qty}")

    var apple2 = Apples()
    apple2.changeName("Honeycrisp")
    apple1.takeBite(50)
    println("${apple2.name} qty: ${apple2.qty}")
}


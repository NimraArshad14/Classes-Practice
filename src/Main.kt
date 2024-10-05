fun main() {
    println("Hello Horld!")
    val person = Person("Nimra")
    val person1 = Person1("nimra arshad")
    val student1 = Student1(1)
    student1.name1()
    student1.number1()
    val person2 = Person2("NIMRA")
    val student2 = Student2(10)
    student2.name2()
    student2.marks()
    val person3 = Person3("nimra mayo",7,8)
    val student3 = Student3("",4,6)
    person3.number3()
    student3.name3()


}


//primary and secondary constructor class with initializer block
class Person  constructor(name: String) {
    constructor(name: String, number: Int) : this(name){}

    init {
        println("Nimra")
    }

    init {
        println(8 + 8)
    }

}




//inheritence class using .super

open class Person1(name1: String) {

    open fun message() {

        println("hp")
    }

    open fun type() {

        println(7*5)
    }
}

class Student1(number1: Int) : Person1(name1 = "hp") {

    fun name1() {
        println("hp")
        super.message()

    }

    fun number1() {
        println(7*5)
        super.type()

    }

}


//inheritence class using ovverride
open class Person2(name2: String) {
    open fun checking() {
        println("NIMRA")
    }
    open fun marking() {
        println(10)
    }

}

class Student2(marks: Int) : Person2(name2 = "NIMRA") {

    open fun name2() {


    }

    override fun checking() {

    }
    open fun marks() {


    }

    override fun marking() {

    }
}

//multiple constructor with class inheritence
open class Person3(val name3:String) {
    constructor(name3: String,name4:Int):this (name3) {}
    constructor(name3: String,name4:Int,number3: Int):this(name3,name4){}

    open fun name3() {

        println("mayo")
    }
    open fun number3() {

        println(9)
    }

}
class Student3 : Person3 {

    constructor(name3: String,name4:Int) : super(name3,name4){}
    constructor(name3: String,name4:Int,number3: Int) : super(name3,name4,number3){}

    override fun name3() {

        println("nimra mayo")
    }
    override fun number3() {
        println("update number:${6+9}")
    }

}
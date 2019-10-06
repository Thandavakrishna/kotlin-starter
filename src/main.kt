import java.util.*
fun main(args: Array<String>) {
    println("Hello, World")
    // val q:Question? = null -> Try this
    val q = Question()

    q.answer = "Forty"
    q.display() //q?.display()

    println("The answer to the question ${q.Question} is ${q.answer}") //${q?.Question} is ${q?.answer}

    val message = if(q.answer == q.CorrectAnswer){ //q?.answer == q?.CorrectAnswer
         "You were correct"
    }else {
         "Try again?"
    }

    println(message)
    q.printResult()

    val num:Int? = try {
        Integer.parseInt(q.answer)
    }catch (e:NumberFormatException) {
        null
    }

    println(num)

    for (i in 1 until 10 step 3){ // 1..10 step 2, in 10 downTo 1 step 2,
        println(i)
    }

    var numbers = listOf(1, 2, 3, 4, 5)

    for (i in numbers){
        println(i)
    }

    for((index, element) in numbers.withIndex()){
        println("$element is at $index")
    }

    var ages = TreeMap<String, Int>()
    ages["A"] = 26
    ages["B"] = 25
    ages["C"] = 30
    ages["D"] = 10

    for ((name, age) in ages){
        println("$name is $age")
    }

}

class Question {
    // var answer:String = ""
    var answer:String? = null
    val Question: String = "Is this a question?"
    var CorrectAnswer = "42"

    fun display() {
        println("You said $answer")
    }
    
    fun printResult(){
        when (answer) {
            CorrectAnswer -> println("You were correct")
            else -> println("Try again?")
        }
    }
}

// Less Ceremony -> No keyword specification, no "new", String interpolation($ or ${<>.<>}) instead of +
// Object-oriented
// Functional support
// Immutability support
// Classes need not be present in their own file
// 'If' can be treated as an expression and the result of it can be assigned to a value. Different style of ternary operator
// Kotlin initializes everything as non-null by default. '?' To be added for variable(field) in order to allow null values.
// So, to assign values to property of class variable that can be null, there are two choices.
// 1) Put an explicit test and say if class variable isn't equal to null, then assign value. 2) Use the safe operator(?) after variable
// 'when' similar to 'switch'
// try can be treated as an expression as well
// while and do-while loops are similar as Java. for loop has different syntax.
// Can use ranges (1..10). Uses full range unless using 'until' to make it half-range.
// Range can be used for anything that implements Comparable interface and not only numbers.
// 'for' interesting use case is with Collections
// Kotlin throws unchecked exceptions. So, there is no explicit need to catch exceptions and also specify exceptions thrown in the method declaration
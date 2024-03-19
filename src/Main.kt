//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    canada("Nkatha")
    isEven(7)
    isEven(6)
    extractString("happiness")
    println(statement("Kibaki was the second president of Kenya"))
    studentRecords()
    printString("beautiful")
    isName("Mercy",30)
    printSum(8,10)
    calculateArea()
    calcArea(1,2,3)
    createPro("Peter",35,"Yellow")

}

    fun canada(name:String) {
        if (name == "Valentine") {
            println("That's Me!")
        } else {
            println("I don't know who that is")
        }
    }
fun isEven(num:Int):Boolean{
   var result=num%2==0
    println(result)
  return result
}
fun extractString(word:String):String{
    var newWord=word.slice(2..5)
    return newWord
}
fun statement(sentence:String):String{
    return sentence.replace("Kibaki","Ruto")
}
fun studentRecords(){
    var fullName="Valentine Nkatha"
    var age=23
    var phoneNumber="0701815843"
    var weight=70.5
    var isKenyan=true
    println(fullName)
    println(age)
    println(phoneNumber)
    println(weight)
    println(isKenyan)
}
fun printString(word:String){
    var a= word[0]
    var b=word[2]
    var c=word[3]
    var result="$a$b$c"
    println(result)
}
fun isName(x:String,y:Int):String{
    var senten="Hi,my name is $x and am $y years old."
    return senten
}
fun printSum(d:Int,f:Int){
    var sum=d+f
    var difference=d-f
    var product=d*f
    var quotient=d/f
    println(sum)
    println(difference)
    println(product)
    println(quotient)

}
fun calculateArea(){
    var k=10
    var v=20
    var result=k*v
    println(result)
}
fun calcArea(j:Int,m:Int,n:Int){
    var sum=j+m+n
    var result=sum/3
    println(result)
}
fun createPro(names:String,ages:Int,favouritecolour:String){
    var state="My name is $names am $ages and my favourite colour is $favouritecolour"
    println(state)
}


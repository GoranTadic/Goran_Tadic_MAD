fun main(){
    var myList = mutableListOf<Int>()

    while (myList.size < 4){
        var number = (1..9).random()
        if (!myList.contains(number)){
            myList.add(number)
        } else{
            while (myList.contains(number)){
                number = (1..9).random()
            }
        }
    }

    val number = myList.get(0)*1000 + myList.get(1)*100 + myList.get(2)*10 + myList.get(3)



    while(true){
        println(number)
        var inputNumber = 0
        var inputList = mutableListOf<Int>()
        var count = 0
        var countRight = 0

        inputNumber = readLine()?.toInt() ?: 0
        if (inputNumber == number) {
            break
        }
        if(inputNumber < 1000) {
           inputList.add(0)
        }
        if(inputNumber < 100){
            inputList.add(0)
        }
        if (inputNumber < 10){
            inputList.add(0)
        }
        if (inputNumber == 0){
            inputList.add(0)
        }
        while(inputNumber > 0 && inputNumber != number){
            inputList.add(0, inputNumber%10)
            inputNumber /= 10
        }
        var mySet = myList.intersect(inputList)
        count = mySet.size
        for(i in 0..3) {
            if (myList.get(i) == inputList.get(i)){
                countRight++
            }
        }
        println("$count : $countRight")
    }

    println("You got it!!!")
}
package pacote


import pacote._
import pacote.memoContext._


object testMemContext {
  
  def main(args: Array[String]) {
    //transação 1
    transactional {
    	val person = new NaturalPerson("John", "Marie")
    	println(person.name)
    	person.name = "John2"
    	println(person.name)
    }
    //transação 2
    transactional {
      val result = 
        query {
            (person: Person) => where(person.name :== "John2") select(person)
        }
      	for (person <- result){
      		var p = person.asInstanceOf[NaturalPerson]
      		println(p.motherName)
      	}
    }
  }
  
}

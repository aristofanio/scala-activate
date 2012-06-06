package pacote

import net.fwbrasil.activate.entity.Entity


abstract class Person(var name: String) extends Entity {
}

class NaturalPerson(name: String, var motherName: String) extends Person(name){
}

class LegalPerson(name: String, var director: NaturalPerson) extends Person(name){
}

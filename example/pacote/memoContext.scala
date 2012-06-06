package pacote


import net.fwbrasil.activate.ActivateContext
import net.fwbrasil.activate.storage.memory.MemoryStorage


object memoContext extends ActivateContext {
    def contextName = "memoryContext"
    val storage = new MemoryStorage    
}

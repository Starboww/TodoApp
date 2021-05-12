package `in`.starbow.kotlintodolist.Modles
/*
class Todoo(val task: String,val done:Boolean)
{
fun getTask():String{
    return this.task
}
}*/
data class Todo(val task:String,val done: Boolean)
/* that's my entire class in just 1 line
    it contains two data members task and done and 4 function getTask(),getDone(),setTask(),setDone()
*/

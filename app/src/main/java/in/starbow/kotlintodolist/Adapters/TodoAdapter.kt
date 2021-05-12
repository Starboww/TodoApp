package `in`.starbow.kotlintodolist.Adapters


import `in`.starbow.kotlintodolist.Modles.Todo
import `in`.starbow.kotlintodolist.R

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


/*
In Java to initialize base class Constructor we Write it as
class A extends B
{
        public A (int a)//constructor
        {
           super(a)
        }
}

In Kotlin to initialize base class constructor
class A (val a:Int): B(a){
}
here class A has a variable named 'a' and class A is extending from class B and variable 'a' is passed to base class
*/
class TodoAdapter(val todos: ArrayList<Todo>):RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder
        {
               val li = parent?.context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
              val itemView=  li.inflate(R.layout.list_item_todo,parent,false)
                return TodoViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return todos.size
    }
    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
//         val task : Todoo = todos[position]
//          holder.bind(task)
      holder?.tvTodoTask?.text=todos[position].task

    }


    class TodoViewHolder(var item: View) : RecyclerView.ViewHolder(item)
    { val tvTodoTask: TextView = item.findViewById<TextView>(R.id.tvTodoTask)
    }

}
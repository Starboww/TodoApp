package `in`.starbow.kotlintodolist

import `in`.starbow.kotlintodolist.Adapters.TodoAdapter
import `in`.starbow.kotlintodolist.Modles.Todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val todos: ArrayList<Todo> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mrvTodos:RecyclerView? = findViewById(R.id.rvTodos)
        val btnAdd: Button = findViewById(R.id.btnAdd)
        val etNewTodo:EditText=findViewById(R.id.etNewTodo)
        todos.add(Todo("First Task",false))

        mrvTodos?.layoutManager =LinearLayoutManager(this)
        val todoAdapter: TodoAdapter= TodoAdapter(todos)
        mrvTodos?.adapter=todoAdapter
        btnAdd.setOnClickListener{
            val newTodo = etNewTodo.text.toString()
            todos.add(Todo(newTodo,false))
            todoAdapter.notifyDataSetChanged()
        }
    }
}
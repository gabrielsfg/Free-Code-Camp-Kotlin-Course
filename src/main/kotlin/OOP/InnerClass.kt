package OOP

fun main(args: Array<String>){
    val listView: ListView = ListView(arrayOf("Name1", "Name", "Name3", "Name4"))
    listView.ListViewItem().displayItem(2)

}

class ListView(val items: Array<String>){

    inner class ListViewItem(){
        fun displayItem(position: Int){
            println(items[position])
        }
    }

}
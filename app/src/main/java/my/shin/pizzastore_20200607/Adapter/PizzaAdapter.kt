package my.shin.pizzastore_20200607.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import my.shin.pizzastore_20200607.Data.PizzaStore
import my.shin.pizzastore_20200607.R

class PizzaAdapter(context: Context, resId: Int, list: List<PizzaStore>) : ArrayAdapter<PizzaStore>(context,resId, list){

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {

            tempRow = inf.inflate(R.layout.pizza_store_list, null)

        }

        val row = tempRow!!

        val data = mList.get(position)

        val




    }
}
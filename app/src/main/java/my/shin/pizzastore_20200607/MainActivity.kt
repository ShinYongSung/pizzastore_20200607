package my.shin.pizzastore_20200607

import android.os.Bundle
import my.shin.pizzastore_20200607.Adapter.PizzaStoreAdapter
import my.shin.pizzastore_20200607.Data.PizzaStore

class MainActivity : BaseActivity() {

    val pizzas = ArrayList<PizzaStore>()

    lateinit var pizzaStoreAdapter: PizzaStoreAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

        pizzas.add(PizzaStore())

    }


}
